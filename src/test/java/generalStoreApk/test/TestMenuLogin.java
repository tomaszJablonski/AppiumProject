package generalStoreApk.test;

import generalStoreApk.utils.GeneralStoreBaseTest;
import io.appium.java_client.AppiumBy;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import java.util.List;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

public class TestMenuLogin extends GeneralStoreBaseTest {

    @Test
    public void loginAndAddToCartPositive() throws InterruptedException {
        menuPage.clickFirstCart();
        menuPage.clickChooseCountry();
        scrollByGoogleEngine("Aruba");
        menuPage.clickCountryAruba();
        menuPage.sendKeysYourName("Yang");
        menuPage.clickLetsChopButton();
        assertTrue(menuPage.isProductsTabVisible());
        scrollByGoogleEngine("Jordan 6 Rings");
        menuPage.clickJordan6RingsAddToCart();
        scrollByGoogleEngine("Jordan Lift Off");
        menuPage.clickJordanLiftOffAddToCart();
        menuPage.clickCartButton();
        assertTrue(menuPage.isJordan6RingsAddToCart());
        assertTrue(menuPage.isJordanLiftOffAddToCart());


        List<WebElement> productPrices = driver.findElements(AppiumBy.id("com.androidsample.generalstore:id/productPrice"));
        double totalSum = 0;
        for (WebElement productPrice : productPrices) {
            String amountString = productPrice.getText();
            Double price = getFormattedAmount(amountString);
            totalSum = totalSum + price;
        }

        String textAllCost = menuPage.allCost.getText();
        Double displayFormattedSum = getFormattedAmount(textAllCost);
        assertEquals(totalSum, displayFormattedSum);

        longPressAction(menuPage.termsButton);
        assertEquals(menuPage.getTermsOfConditionsText(), "Terms Of Conditions");

        menuPage.clickCloseTerms();

        menuPage.clickCheckBoxSend();
        assertEquals(menuPage.isCheckSendIsTrue(),"true");
        menuPage.clickVisitWebsiteToCompletePurchaseButton();
    }

    @Test
    public void loginNegativeToastMsg() throws InterruptedException {
        menuPage.clickFirstCart();
        menuPage.clickChooseCountry();
        scrollByGoogleEngine("China");
        menuPage.clickCountryAruba();
        menuPage.clickLetsChopButton();
        assertEquals(menuPage.getTextLoginToast(), "Please enter your name");
    }
}

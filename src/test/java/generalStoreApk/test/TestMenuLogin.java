package generalStoreApk.test;

import generalStoreApk.utils.GeneralStoreBaseTest;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

public class TestMenuLogin extends GeneralStoreBaseTest {

    @Test
    public void loginPositive() throws InterruptedException {
        menuPage.clickFirstCart();
        menuPage.clickChooseCountry();
        scrollByGoogleEngine("China");
        menuPage.clickCountryChina();
        menuPage.sendKeysYourName("Yang");
        menuPage.clickLetsChopButton();
        assertTrue(menuPage.isProductsTabVisible());
    }

    @Test
    public void loginNegativeToastMsg() throws InterruptedException {
        menuPage.clickFirstCart();
        menuPage.clickChooseCountry();
        scrollByGoogleEngine("China");
        menuPage.clickCountryChina();
        menuPage.clickLetsChopButton();
        assertEquals(menuPage.getTextLoginToast(),"Please enter your name");
    }
}

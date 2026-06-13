package generalStoreApk.page;

import generalStoreApk.utils.GeneralStoreBaseTest;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import static java.lang.Thread.sleep;

public class MenuPage extends GeneralStoreBaseTest {

    public MenuPage(AndroidDriver driver) {
        this.driver = driver;
        PageFactory.initElements(new AppiumFieldDecorator(driver), this);
    }

    @AndroidFindBy(id = "com.androidsample.generalstore:id/splashscreen")
    WebElement firstCart;

    @AndroidFindBy(id = "com.androidsample.generalstore:id/spinnerCountry")
    WebElement chooseCountry;

    @AndroidFindBy(uiAutomator = "new UiSelector().text(\"Aruba\")")
    WebElement countryAruba;

    @AndroidFindBy(className = "android.widget.EditText")
    WebElement yourName;

    @AndroidFindBy(id = "com.androidsample.generalstore:id/btnLetsShop")
    WebElement letsChopButton;

    @AndroidFindBy(xpath = "//android.widget.TextView[@text='Products']")
    WebElement productsTab;

    @AndroidFindBy(xpath = "(//android.widget.Toast)[1]")
    WebElement loginToast;

    @AndroidFindBy(xpath = "//android.widget.TextView[@text='Jordan 6 Rings']")
    WebElement jordan6RingsBoots;

    @AndroidFindBy(xpath = "//android.widget.TextView[@text='Jordan Lift Off']")
    WebElement jordanLiftOffBoots;

    @AndroidFindBy(xpath = "//android.widget.TextView[@text='Jordan 6 Rings']/following-sibling::android.widget.LinearLayout//android.widget.TextView[@text='ADD TO CART']")
    WebElement jordan6RingsAddToCart;

    @AndroidFindBy(xpath = "//android.widget.TextView[@text='Jordan Lift Off']/following-sibling::android.widget.LinearLayout//android.widget.TextView[@text='ADD TO CART']")
    WebElement jordanLiftOffAddToCart;

    @AndroidFindBy(id = "com.androidsample.generalstore:id/appbar_btn_cart")
    WebElement cartButton;

    @AndroidFindBy(xpath = "//android.widget.TextView[@resource-id=\"com.androidsample.generalstore:id/totalAmountLbl\"]")
    public WebElement allCost;

    @AndroidFindBy(xpath = "//android.widget.CheckBox[@text=\"Send me e-mails on discounts related to selected products in future\"]")
    WebElement checkBoxSend;

    @AndroidFindBy(id = "com.androidsample.generalstore:id/btnProceed")
    WebElement visitWebsiteToCompletePurchaseButton;

    @AndroidFindBy(id = "com.androidsample.generalstore:id/termsButton")
    public WebElement termsButton;

    @AndroidFindBy(xpath = "//android.widget.TextView[@text='Terms Of Conditions']")
    public WebElement termsOfConditionsText;

    @AndroidFindBy(id = "android:id/button1")
    WebElement closeTerms;

    public void clickFirstCart() throws InterruptedException {
        firstCart.click();
        sleep(3000);
    }

    public void clickChooseCountry() {
        chooseCountry.click();
    }

    public void clickCountryAruba() {
        countryAruba.click();
    }

    public void sendKeysYourName(String name) {
        yourName.sendKeys(name);
    }

    public void clickLetsChopButton() {
        letsChopButton.click();
    }

    public void clickJordan6RingsAddToCart() {
        jordan6RingsAddToCart.click();
    }

    public void clickJordanLiftOffAddToCart() {
        jordanLiftOffAddToCart.click();
    }

    public void clickCartButton() {
        cartButton.click();
    }

    public void clickCheckBoxSend() {
        checkBoxSend.click();
    }

    public void clickVisitWebsiteToCompletePurchaseButton() {
        visitWebsiteToCompletePurchaseButton.click();
    }

    public void clickCloseTerms() {
        closeTerms.click();
    }

    public boolean isProductsTabVisible() {
        return productsTab.isDisplayed();
    }

    public boolean isJordan6RingsAddToCart() {
        return jordan6RingsBoots.isDisplayed();
    }

    public boolean isJordanLiftOffAddToCart() {
        return jordanLiftOffBoots.isDisplayed();
    }

    public String isCheckSendIsTrue() {
        return getAttribute(checkBoxSend);
    }

    public String getTextLoginToast() {
        return loginToast.getAttribute("name");
    }

    public String getTermsOfConditionsText() {
        return termsOfConditionsText.getText();
    }
}

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

    @AndroidFindBy(uiAutomator = "new UiSelector().text(\"China\")")
    WebElement countryChina;

    @AndroidFindBy(className = "android.widget.EditText")
    WebElement yourName;

    @AndroidFindBy(id = "com.androidsample.generalstore:id/btnLetsShop")
    WebElement letsChopButton;

    @AndroidFindBy(id = "com.androidsample.generalstore:id/toolbar_title")
    WebElement productsTab;

    public void clickFirstCart() throws InterruptedException {
        firstCart.click();
        sleep(3000);
    }

    public void clickChooseCountry() {
        chooseCountry.click();
    }

    public void clickCountryChina() {
        countryChina.click();
    }

    public void sendKeysYourName(String name) {
        yourName.sendKeys(name);
    }

    public void clickLetsChopButton() {
        letsChopButton.click();
    }

    public boolean isProductsTabVisible() {
        return productsTab.isDisplayed();
    }
}

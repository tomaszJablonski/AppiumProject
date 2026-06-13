package generalStoreApk.utils;

import com.google.common.collect.ImmutableMap;
import generalStoreApk.page.MenuPage;
import io.appium.java_client.AppiumBy;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;
import io.appium.java_client.service.local.AppiumDriverLocalService;
import io.appium.java_client.service.local.AppiumServiceBuilder;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebElement;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URI;
import java.net.URISyntaxException;
import java.time.Duration;
import java.util.Map;

public class GeneralStoreBaseTest {

    public AndroidDriver driver;
    public AppiumDriverLocalService service;
    public MenuPage menuPage;

    @BeforeClass
    public void configureAppium() throws URISyntaxException, MalformedURLException {
        service =
                new AppiumServiceBuilder()
                        .withAppiumJS(new File("C:\\Users\\MrMag\\AppData\\Roaming\\npm\\node_modules\\appium\\build\\lib\\main.js"))
                        .withIPAddress("127.0.0.1")
                        .usingPort(4723)
                        .withEnvironment(Map.of("APPIUM_HOME", "C:\\Users\\MrMag"))
                        .build();

        service.start();

        UiAutomator2Options options = new UiAutomator2Options();
        options.setDeviceName("Pixel4a");
        options.setApp("D:\\1.TESTOWANIE\\3. Testowanie aplikacji na telefonie\\Kurs Udemy\\intellij\\Projekt1\\AppiumProject\\src\\test\\resources\\General-Store.apk");

        driver = new AndroidDriver(new URI("http://127.0.0.1:4723/").toURL(), options);
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));

        menuPage = new MenuPage(driver);
    }

    public void longPressAction(WebElement element) {
        Assert.assertNotNull(((RemoteWebElement) element).getId());
        driver.executeScript("mobile: longClickGesture", ImmutableMap.of("elementId", ((RemoteWebElement) element).getId(),
                "duration", 2000));
    }

    public void scrollByGoogleEngine(String textInElement) {
        driver.findElement(AppiumBy.androidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView(text(\"" + textInElement + "\"));"));
    }

    public String getAttribute(WebElement element) {
        return element.getAttribute("focusable");
    }

    public Double getFormattedAmount(String amount) {
        return Double.parseDouble(amount.substring(1));
    }

    @AfterClass
    public void tearDown(){
        driver.quit();
        service.stop();
    }
}

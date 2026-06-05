package training.tests;

import io.appium.java_client.AppiumBy;
import org.testng.annotations.Test;
import training.utils.BaseTest;

public class TestScroll extends BaseTest {

    @Test(testName = "Przewijanie w aplikacji na androdzie - sposób pierwszy")
    public void scrollInApp() {
        driver.findElement(AppiumBy.accessibilityId("Views")).click();
        //pierwszy sposób Google Engine
        scrollByGoogleEngine("WebView");
    }

    @Test(testName = "Przewijanie w aplikacji na android - sposób drugi")
    public void scrollInApp2() {
        driver.findElement(AppiumBy.accessibilityId("Views")).click();
        //drugi sposób
        scrollToEndAction();
    }
}
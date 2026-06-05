package training.tests;

import io.appium.java_client.AppiumBy;
import org.testng.annotations.Test;
import training.utils.BaseTest;

public class TestAppiumBasic extends BaseTest {

    @Test
    public void wifiSettingsName() {
        //Actual automation
        //Xpath, id, accessibilityId, classname, androidUIAutomator -> Appium inspector
        driver.findElement(AppiumBy.accessibilityId("Preference")).click();

    }
}
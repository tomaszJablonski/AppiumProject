package apiDemosDebugApk.tests;

import io.appium.java_client.AppiumBy;
import org.testng.annotations.Test;
import apiDemosDebugApk.utils.ApiDemosDebugBaseTest;

import static org.testng.Assert.assertEquals;

public class TestAppiumBasicApiDemosDebug extends ApiDemosDebugBaseTest {

    @Test
    public void wifiSettingsName() {
        //Actual automation
        //Xpath, id, accessibilityId, classname, androidUIAutomator -> Appium inspector
        driver.findElement(AppiumBy.accessibilityId("Preference")).click();
        driver.findElement(AppiumBy.accessibilityId("3. Preference dependencies")).click();
        driver.findElement(AppiumBy.id("android:id/checkbox")).click();
        driver.findElement(AppiumBy.xpath("//android.widget.TextView[@resource-id=\"android:id/title\" and @text=\"WiFi settings\"]")).click();

        String textWifiPopup = driver.findElement(AppiumBy.id("android:id/alertTitle")).getText();
        assertEquals(textWifiPopup, "WiFi settings", "Text is wrong !!!");

        driver.findElement(AppiumBy.id("android:id/edit")).sendKeys("testWifi");
        driver.findElement(AppiumBy.id("android:id/button1")).click();
    }
}
package apiDemosDebugApk.tests;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.android.nativekey.AndroidKey;
import io.appium.java_client.android.nativekey.KeyEvent;
import org.openqa.selenium.DeviceRotation;
import org.testng.annotations.Test;
import apiDemosDebugApk.utils.ApiDemosDebugBaseTest;

import static org.testng.Assert.assertEquals;

public class TestMiscellaneousInAppiumApiDemosDebug extends ApiDemosDebugBaseTest {

    @Test
    public void miscellaneous() {
        driver.findElement(AppiumBy.accessibilityId("Preference")).click();
        driver.findElement(AppiumBy.accessibilityId("3. Preference dependencies")).click();
        driver.findElement(AppiumBy.id("android:id/checkbox")).click();
        //***orientacja pozioma telefonu***
        DeviceRotation landScape = new DeviceRotation(0,0,90);
        driver.rotate(landScape);

        driver.findElement(AppiumBy.xpath("//android.widget.TextView[@resource-id=\"android:id/title\" and @text=\"WiFi settings\"]")).click();

        String textWifiPopup = driver.findElement(AppiumBy.id("android:id/alertTitle")).getText();
        assertEquals(textWifiPopup, "WiFi settings", "Text is wrong !!!");

        //copy and paste
        //copy to clipboard - paste it clipboard
        driver.setClipboardText("testWifi");
        driver.findElement(AppiumBy.id("android:id/edit")).sendKeys(driver.getClipboardText());

        //naciskanie różnych przycisków na telefonie

        driver.pressKey(new KeyEvent(AndroidKey.ENTER));
        driver.findElement(AppiumBy.id("android:id/button1")).click();
        //przycisk wstecz na telefonie
        driver.pressKey(new KeyEvent(AndroidKey.BACK));
        //przycisk Home na telefonie
        driver.pressKey(new KeyEvent(AndroidKey.HOME));
    }
}
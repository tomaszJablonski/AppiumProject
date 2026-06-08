package training.tests;

import com.google.common.collect.ImmutableMap;
import io.appium.java_client.AppiumBy;
import org.testng.annotations.Test;
import training.utils.BaseTest;

import static org.testng.Assert.assertEquals;

public class TestAppPackageAndActivity extends BaseTest {

    @Test
    public void appPackageAndActivity() {
        //App Package & App Activity
        //Po co tego używamy? Żeby nie klikać po całej aplikacji
        // tylko znaleźć się od razu w jej punkcie na start tam gdzie chcemy testować
        //jak nie musimy przechodzić przez cała aplikacje
        //1.adb devices in cmd - powinien byćtam wpis o aktywności użądzenia emulacji
        //2.W Android studio na emulatorze ustawiamy ekran który chcemy przechwycić
        //3.W cmd potem wpisujemy - adb shell dumpsys window | find "mCurrentFocus"
        //i dostajemy taki wynik np. io.appium.android.apis/io.appium.android.apis.preference.PreferenceDependencies
        //Wszystko przed ukośnikiem to jest Package --> io.appium.android.apis
        //a to co po to jest Activity --> io.appium.android.apis.preference.PreferenceDependencies

        //Tu podajemy app package i app activity
        driver.executeScript("mobile: startActivity", ImmutableMap.of(
                "intent", "io.appium.android.apis/io.appium.android.apis.preference.PreferenceDependencies"
        ));

        driver.findElement(AppiumBy.id("android:id/checkbox")).click();
        driver.findElement(AppiumBy.xpath("//android.widget.TextView[@resource-id=\"android:id/title\" and @text=\"WiFi settings\"]")).click();

        String textWifiPopup = driver.findElement(AppiumBy.id("android:id/alertTitle")).getText();
        assertEquals(textWifiPopup, "WiFi settings", "Text is wrong !!!");
    }
}
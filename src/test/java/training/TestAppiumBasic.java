package training;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;
import org.testng.annotations.Test;

import java.net.MalformedURLException;
import java.net.URI;
import java.net.URISyntaxException;

public class TestAppiumBasic {

    //For android - Android Driver
    //For IOS - IOSDriver


    @Test
    public void test() throws URISyntaxException, MalformedURLException {
        //Appium code -> appium Server -> Mobile
        //new AndroidDriver(AppiumServer,capabilities)
        UiAutomator2Options options = new UiAutomator2Options();
        options.setDeviceName("Pixel4a");
        options.setApp("D:\\1.TESTOWANIE\\3. Testowanie aplikacji na telefonie\\Kurs Udemy\\intellij\\Projekt1\\AppiumProject\\src\\test\\resources\\ApiDemos-debug.apk");

        AndroidDriver androidDriver = new AndroidDriver(new URI("http://127.0.0.1:4723/").toURL(), options);
        androidDriver.quit();
        //Actual automation

    }
}
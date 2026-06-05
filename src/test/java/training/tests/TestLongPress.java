package training.tests;

import io.appium.java_client.AppiumBy;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebElement;
import org.testng.Assert;
import org.testng.annotations.Test;
import training.utils.BaseTest;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

public class TestLongPress extends BaseTest {

    @Test(testName = "Długie przytrzymanie przycisku tylko w aplikacjach mobilnych żeby zobaczyć popup")
    public void longHoldTheElementOnlyOnMobile() {
        driver.findElement(AppiumBy.accessibilityId("Views")).click();
        driver.findElement(AppiumBy.accessibilityId("Expandable Lists")).click();
        driver.findElement(AppiumBy.accessibilityId("1. Custom Adapter")).click();
        WebElement elementPeopleNames = driver.findElement(AppiumBy.xpath("//android.widget.TextView[@text=\"People Names\"]"));

        Assert.assertNotNull(((RemoteWebElement) elementPeopleNames).getId());
        longPressAction(elementPeopleNames);

        boolean displayedSampleMenu = driver.findElement(AppiumBy.id("android:id/title")).isDisplayed();
        assertTrue(displayedSampleMenu);

        String textSampleMenu = driver.findElement(AppiumBy.id("android:id/title")).getText();
        assertEquals(textSampleMenu, "Sample menu");
    }
}
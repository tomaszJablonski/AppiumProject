package training.tests;

import io.appium.java_client.AppiumBy;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
import training.utils.BaseTest;

import static org.testng.Assert.assertEquals;

public class TestSwipe extends BaseTest {

    @Test
    public void swipePositive() {
        driver.findElement(AppiumBy.accessibilityId("Views")).click();
        driver.findElement(AppiumBy.accessibilityId("Gallery")).click();
        driver.findElement(AppiumBy.accessibilityId("1. Photos")).click();
        WebElement firstImage = driver.findElement(AppiumBy.xpath("//android.widget.ImageView [1]"));
        String focusableTrue = firstImage.getAttribute("focusable");
        assertEquals(focusableTrue, "true");
        //Swipe - przesunięcie tak jak palcem po telefonie
        swipeScreen(firstImage, "left");
        String focusableFalse = firstImage.getAttribute("focusable");
        assertEquals(focusableFalse, "false");
    }
}
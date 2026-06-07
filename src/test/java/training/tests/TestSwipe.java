package training.tests;

import org.testng.annotations.Test;
import training.utils.BaseTest;

import static org.testng.Assert.assertEquals;

public class TestSwipe extends BaseTest {

    @Test
    public void swipePositive() {
        viewPage.clickViews();
        viewPage.clickGallery();
        viewPage.clickPhotos();
        String focusableTrue = getAttribute(viewPage.firstPhotos);
        assertEquals(focusableTrue, "true");
        //Swipe - przesunięcie tak jak palcem po telefonie
        swipeScreen(viewPage.firstPhotos, "left");
        String focusableFalse = getAttribute(viewPage.firstPhotos);
        assertEquals(focusableFalse, "false");
    }
}
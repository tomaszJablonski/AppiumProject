package training.tests;

import org.testng.annotations.Test;
import training.utils.BaseTest;

public class TestScroll extends BaseTest {

    @Test(testName = "Przewijanie w aplikacji na androdzie - sposób pierwszy")
    public void scrollInApp() {
        viewPage.clickViews();
        //pierwszy sposób Google Engine
        scrollByGoogleEngine("WebView");
    }

    @Test(testName = "Przewijanie w aplikacji na android - sposób drugi")
    public void scrollInApp2() {
        viewPage.clickViews();
        //drugi sposób
        scrollToEndAction();
    }
}
package apiDemosDebugApk.tests;

import org.testng.annotations.Test;
import apiDemosDebugApk.utils.ApiDemosDebugBaseTest;

public class TestScrollApiDemosDebug extends ApiDemosDebugBaseTest {

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
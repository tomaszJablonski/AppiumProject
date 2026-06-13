package apiDemosDebugApk.tests;

import org.testng.annotations.Test;
import apiDemosDebugApk.utils.ApiDemosDebugBaseTest;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

public class TestLongPressApiDemosDebug extends ApiDemosDebugBaseTest {

    @Test(testName = "Długie przytrzymanie przycisku tylko w aplikacjach mobilnych żeby zobaczyć popup")
    public void longHoldTheElementOnlyOnMobile() {
        viewPage.clickViews();
        viewPage.clickExpandedList();
        viewPage.clickCustomAdapter();
        longPressAction(viewPage.peopleNames);
        assertTrue(viewPage.isDisplayedSampleMenu());
        assertEquals(viewPage.getSampleMenuText(), "Sample menu");
    }
}
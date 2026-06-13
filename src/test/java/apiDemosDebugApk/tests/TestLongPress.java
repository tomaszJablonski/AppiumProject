package apiDemosDebugApk.tests;

import org.testng.annotations.Test;
import apiDemosDebugApk.utils.BaseTest;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

public class TestLongPress extends BaseTest {

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
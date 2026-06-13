package apiDemosDebugApk.tests;

import org.testng.annotations.Test;
import apiDemosDebugApk.utils.ApiDemosDebugBaseTest;

import static org.testng.Assert.assertEquals;

public class TestDragDropApiDemosDebug extends ApiDemosDebugBaseTest {

    @Test
    public void dragDropPositive() {
        viewPage.clickViews();
        viewPage.clickDragAndDrop();
        dragDrop(viewPage.sourceImage, 651, 654);
        assertEquals(viewPage.getTextDropped(), "Dropped!");
    }
}
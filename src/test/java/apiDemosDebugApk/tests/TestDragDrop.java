package apiDemosDebugApk.tests;

import org.testng.annotations.Test;
import apiDemosDebugApk.utils.BaseTest;

import static org.testng.Assert.assertEquals;

public class TestDragDrop extends BaseTest {

    @Test
    public void dragDropPositive() {
        viewPage.clickViews();
        viewPage.clickDragAndDrop();
        dragDrop(viewPage.sourceImage, 651, 654);
        assertEquals(viewPage.getTextDropped(), "Dropped!");
    }
}
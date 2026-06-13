package generalStoreApk.test;

import generalStoreApk.utils.GeneralStoreBaseTest;
import org.testng.annotations.Test;

import static org.testng.Assert.assertTrue;

public class TestMenuLogin extends GeneralStoreBaseTest {

    @Test
    public void loginPositive(){
        menuPage.clickChooseCountry();
        scrollByGoogleEngine("China");
        menuPage.clickCountryChina();
        menuPage.sendKeysYourName("Yang");
        menuPage.clickLetsChopButton();
        assertTrue(menuPage.isProductsTabVisible());
    }
}

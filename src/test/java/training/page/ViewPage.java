package training.page;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import training.utils.BaseTest;

public class ViewPage extends BaseTest {

    public ViewPage(AndroidDriver driver) {
        this.driver = driver;
        PageFactory.initElements(new AppiumFieldDecorator(driver), this);
    }

    @AndroidFindBy(accessibility = "Views")
    protected WebElement views;

    @AndroidFindBy(accessibility = "Drag and Drop")
    protected WebElement dragAndDrop;

    @AndroidFindBy(id = "io.appium.android.apis:id/drag_dot_1")
    public WebElement sourceImage;

    @AndroidFindBy(id = "io.appium.android.apis:id/drag_result_text")
    public WebElement droppedText;

    @AndroidFindBy(accessibility = "Expandable Lists")
    protected WebElement expandedList;

    @AndroidFindBy(accessibility = "1. Custom Adapter")
    protected WebElement customAdapter;

    @AndroidFindBy(xpath = "//android.widget.TextView[@text=\"People Names\"]")
    public WebElement peopleNames;

    @AndroidFindBy(id = "android:id/title")
    WebElement sampleMenu;

    @AndroidFindBy(accessibility = "Gallery")
    WebElement gallery;

    @AndroidFindBy(accessibility = "1. Photos")
    WebElement photos;

    @AndroidFindBy(xpath = "//android.widget.ImageView [1]")
    public WebElement firstPhotos;

    public void clickViews() {
        views.click();
    }

    public void clickDragAndDrop() {
        dragAndDrop.click();
    }

    public void clickExpandedList() {
        expandedList.click();
    }

    public void clickCustomAdapter() {
        customAdapter.click();
    }

    public void clickGallery() {
        gallery.click();
    }

    public void clickPhotos() {
        photos.click();
    }

    public String getTextDropped() {
        return droppedText.getText();
    }

    public String getSampleMenuText() {
        return sampleMenu.getText();
    }

    public boolean isDisplayedSampleMenu() {
        return sampleMenu.isDisplayed();
    }

}
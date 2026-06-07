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

    public void clickViews() {
        views.click();
    }

    public void clickDragAndDrop() {
        dragAndDrop.click();
    }

    public String getTextDropped() {
        return droppedText.getText();
    }
}
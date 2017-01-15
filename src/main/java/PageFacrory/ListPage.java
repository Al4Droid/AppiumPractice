package PageFacrory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

/**
 * Created by almogood on 2017-01-15.
 */
public class ListPage {

    WebDriver driver;

    @FindBy(id = "android:id/text1")
    WebElement firstListItem;

    public ListPage(WebDriver driver) {
        this.driver = driver;

        PageFactory.initElements(driver, this);
    }

    public String getListFirstItem() {
        return firstListItem.getText().toString();
    }
}

package PageFacrory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Login {

    WebDriver driver;

    @FindBy(id = "com.almog.gymglish:id/textView")
    WebElement LoginPageTitle;

    @FindBy(id = "com.almog.gymglish:id/user_nameET")
    WebElement LoginPageUserName;

    @FindBy(id = "com.almog.gymglish:id/passwordET")
    WebElement LoginPagePassword;

    @FindBy(id = "com.almog.gymglish:id/submit_btn")
    WebElement LoginPageSubmitBtn;


    public Login(WebDriver driver) {
        this.driver = driver;

        PageFactory.initElements(driver, this);
    }

    public  void setUserName(String strUserName) {
        LoginPageUserName.sendKeys(strUserName);
    }

    public void setPassword(String strPassword) {
        LoginPagePassword.sendKeys(strPassword);
    }

    public void clickLogin() {
        LoginPageSubmitBtn.click();
    }

    public void loginToGymglish(String strUserName, String strPassword) {
        this.setUserName(strUserName);
        this.setPassword(strPassword);
        this.clickLogin();
    }

}

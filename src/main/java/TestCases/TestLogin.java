package TestCases;

import PageFacrory.Login;
import com.google.common.annotations.VisibleForTesting;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.*;


import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;
import java.util.concurrent.TimeUnit;

/**
 * Created by almogood on 2017-01-15.
 */
public class TestLogin {

    WebDriver driver;

    Login objLogin;

    List objListPage;

    //String platformVersion_,  "platformVersion_",
    @Parameters({"deviceName_",  "UDID_", "URL_", "appPackage_", "appActivity_"})
    @BeforeMethod
    public void beforeMethod( String deviceName_, String UDID_, String URL_,
                              String appPackage_, String appActivity_) throws MalformedURLException {

        DesiredCapabilities capabilities = new DesiredCapabilities();
        capabilities.setCapability("deviceName", deviceName_);
        capabilities.setCapability("applicationName", UDID_);
       // capabilities.setCapability("platformVersion", platformVersion_);
        capabilities.setCapability("appPackage", appPackage_);
        capabilities.setCapability("appActivity", appActivity_);

        driver = new AndroidDriver< MobileElement>(new URL("http://"+URL_), capabilities);
        driver.manage().timeouts().implicitlyWait(80, TimeUnit.SECONDS);
    }

    @Parameters({"userName_", "password_"})
    @Test
   // public void testLogin(){
    public void testLogin(String userName_ , String password_ ) {

        objLogin = new Login(driver);

        objLogin.loginToGymglish(userName_ , password_ );

    }

    @AfterTest
    public void cleanUp() {
        driver.quit();
    }
}

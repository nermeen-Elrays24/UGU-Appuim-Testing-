package Tests;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import org.junit.BeforeClass;

import java.net.MalformedURLException;
import java.net.URL;
import org.openqa.selenium.remote.DesiredCapabilities;

import org.testng.annotations.BeforeSuite;

public class TestBase {
    public static AndroidDriver<MobileElement> driver;
    @BeforeSuite
    public void SetAppium() throws MalformedURLException
    {
        DesiredCapabilities Caps= new DesiredCapabilities();
        Caps.setCapability("platformName","Android");
        Caps.setCapability("platformVersion","7");
        Caps.setCapability("deviceName","FUH0216709016494");
        Caps.setCapability("app","C:\\Users\\Nermeen.Mahmoud\\Downloads\\ugu-v0.4.4-f408a1e-release_qc_v0.4.2_01_oct_2020-release.apk");
        //Caps.setCapability("appPackage","com.android.mms");
        //Caps.setCapability("appActivity","com.android.mms.ui.MessageFullScreenActivity");
        try {
            driver=new AndroidDriver<MobileElement>(new URL("http://127.0.0.1:4723/wd/hub/"),Caps);

        } catch (MalformedURLException e) {
            e.printStackTrace();
        }
    }
  //  @AfterMethod
   // public void TearDown(){
        //driver.resetApp();
        //driver.quit();
    }


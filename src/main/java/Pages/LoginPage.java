package Pages;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.TouchAction;
import io.appium.java_client.touch.WaitOptions;
import io.appium.java_client.touch.offset.PointOption;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

import javax.xml.xpath.XPath;
import java.time.Duration;
import java.util.Random;
import java.util.concurrent.TimeUnit;

public class LoginPage extends PageBase {

    public LoginPage(AppiumDriver driver) {
        super(driver);
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

    }

    @FindBy(xpath="/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.ScrollView/android.view.ViewGroup/android.widget.LinearLayout/android.widget.LinearLayout[1]/android.widget.FrameLayout/android.widget.EditText")
    MobileElement EmailTxt;
    @FindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.ScrollView/android.view.ViewGroup/android.widget.LinearLayout/android.widget.LinearLayout[2]/android.widget.FrameLayout/android.widget.EditText")
    MobileElement passwordTxt;
    @FindBy(id="com.humansoftsolution.ugu:id/login_btn")
    MobileElement LoginBtn;
    @FindBy(id="com.humansoftsolution.ugu:id/textinput_error")
    MobileElement ExpectedMessage;
    @FindBy(id="com.humansoftsolution.ugu.debug:id/textinput_error")
    MobileElement EmptyErrorMessage;
    public void InvalidCredentials(AppiumDriver driver){
        EmailTxt.sendKeys("user-5@ugu.com");
        ScrollDown(driver);
        passwordTxt.sendKeys("S1234s");
        ClickButton(LoginBtn);
        Assert.assertEquals(ExpectedMessage.getText(),"Wrong email or password!");
        System.out.println(ExpectedMessage.getText());
    }
    public void EmptyFields (AppiumDriver driver)
    {
        ScrollDown(driver);
        ClickButton(LoginBtn);
        Assert.assertEquals(EmptyErrorMessage,"This field cannot be empty");
        System.out.println(EmptyErrorMessage.getText());
    }
    public void SuccessfullyLogin(AppiumDriver driver)
    {
        Random r =new Random();
        int RandomInt=r.nextInt(100);
        EmailTxt.sendKeys("user-"+RandomInt+"@ugu.com");
        ScrollDown(driver);
        passwordTxt.sendKeys("S1234s12");
        ClickButton(LoginBtn);
    }

}

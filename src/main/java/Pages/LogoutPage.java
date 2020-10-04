package Pages;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import org.openqa.selenium.By;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;

public class LogoutPage extends PageBase {
    public LogoutPage(AppiumDriver driver) {
        super(driver);
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
    }
    @FindBy(id="com.humansoftsolution.ugu:id/profileFragment")
    MobileElement Profile;
    @FindBy(id="com.humansoftsolution.ugu:id/iv_global_settings")
    MobileElement Settings;
    @FindBy(xpath="/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/androidx.recyclerview.widget.RecyclerView/androidx.cardview.widget.CardView[6]/android.widget.TextView")
    MobileElement LogoutBtn;
    public void UserCanLogOut(AppiumDriver driver) {
        ClickButton(Profile);

        ClickButton(Settings);
        ScrollDown(driver);

        ClickButton(LogoutBtn);
    }
}

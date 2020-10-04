package Pages;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

import java.util.concurrent.TimeUnit;

public class ProfilePage extends PageBase {
    public ProfilePage(AppiumDriver driver) {
        super(driver);
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

    }
    @FindBy(id="com.humansoftsolution.ugu:id/settings_update_profile_card")
    MobileElement Pencil;
    @FindBy(id="com.humansoftsolution.ugu:id/profileFragment")
    MobileElement Profile;
    @FindBy(id="com.humansoftsolution.ugu:id/iv_global_settings")
    MobileElement Settings;
    @FindBy(id="com.humansoftsolution.ugu:id/update_profile_upload_picture")
    MobileElement UploadImage;
    @FindBy(id="com.humansoftsolution.ugu:id/file_thumbnail")
    MobileElement Image;
    @FindBy(id="com.humansoftsolution.ugu:id/done")
    MobileElement DoneBtn;
    @FindBy(id="com.humansoftsolution.ugu:id/update_profile_reset_password")
    MobileElement ChangePass;
    @FindBy(id="com.humansoftsolution.ugu:id/update_profile_save_btn")
    MobileElement SaveBtn;


    public void ChangeProfilePic(AppiumDriver driver) {
        ClickButton(Profile);
        ClickButton(Settings);
        ClickButton(Pencil);
        ClickButton(UploadImage);
        ScrollDown(driver);
        ClickButton(Image);
        ClickButton(DoneBtn);
        ClickButton(SaveBtn);
        driver.navigate().back();
        driver.navigate().back();
    }
    }



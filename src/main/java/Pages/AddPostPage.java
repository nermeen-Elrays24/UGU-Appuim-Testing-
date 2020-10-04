package Pages;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import org.openqa.selenium.By;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.util.concurrent.TimeUnit;

public class AddPostPage extends PageBase {
    public AddPostPage(AppiumDriver driver) {
        super(driver);
        driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);
    }
    @FindBy(id="com.humansoftsolution.ugu:id/navGraphContentCreator")
    MobileElement AddPostBtn;
    @FindBy(id="com.android.packageinstaller:id/permission_allow_button")
    MobileElement Allow1;
    @FindBy(id="com.android.packageinstaller:id/permission_allow_button")
    MobileElement Allow2;
    @FindBy(id="com.android.packageinstaller:id/permission_allow_button")
    MobileElement Allow3;
    @FindBy(id="com.humansoftsolution.ugu:id/layoutRecording")
    MobileElement Capture;
    @FindBy(id="com.humansoftsolution.ugu:id/iv_send")
    MobileElement Send;
    @FindBy(id="com.humansoftsolution.ugu:id/et_caption")
    MobileElement Automation_Run;
    @FindBy(id = "com.humansoftsolution.ugu:id/btn_send_post")
    MobileElement NormalPost;
    @FindBy(id="com.humansoftsolution.ugu:id/btn_send_story")
    MobileElement Story;
    @FindBy(id="com.humansoftsolution.ugu:id/iv_pick_from_gallery")
    MobileElement Gallery;
    @FindBy(id="com.humansoftsolution.ugu:id/file_thumbnail")
    MobileElement Image1;
    @FindBy(id="com.humansoftsolution.ugu:id/file_thumbnail")
    MobileElement Image2;
    @FindBy(id="com.humansoftsolution.ugu:id/done")
    MobileElement DoneBtn;
    @FindBy(id="com.humansoftsolution.ugu:id/iv_add_text_content")
    MobileElement TextBtn;
    @FindBy(id="com.humansoftsolution.ugu:id/et_post_text")
    MobileElement PostText;
    @FindBy(id="com.humansoftsolution.ugu:id/snackbar_text")
    MobileElement successMessage;
    public void AddNormalPost(AppiumDriver driver){
        ClickButton(AddPostBtn);
        ClickButton(Allow1);
        ClickButton(Allow2);
        ClickButton(Allow3);
        ClickButton(Capture);
        ClickButton(Send);
        Automation_Run.sendKeys("Automation Run ");
        ClickButton(NormalPost);
       // driver.navigate().back();
       // driver.navigate().back();

    }
    public void AddStory(AppiumDriver driver) {
        ClickButton(AddPostBtn);
        ClickButton(Allow1);
        ClickButton(Allow2);
        ClickButton(Allow3);
        ClickButton(Gallery);
        ClickButton(Image1);
        ClickButton(DoneBtn);
        ClickButton(Send);
        Automation_Run.sendKeys("Automation Run ");
        WebDriverWait wait = new WebDriverWait(driver,50);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("com.humansoftsolution.ugu:id/btn_send_story")));
        ClickButton(Story);
        WebDriverWait w = new WebDriverWait(driver,50);
        w.until(ExpectedConditions.visibilityOfElementLocated(By.id("com.humansoftsolution.ugu:id/snackbar_text")));
        driver.navigate().back();
        driver.navigate().back();
    }

    public void AddFromGallery(AppiumDriver driver)
    {
        ClickButton(AddPostBtn);
        ClickButton(Allow1);
        ClickButton(Allow2);
        ClickButton(Allow3);
        ClickButton(Gallery);
        ClickButton(Image1);
       // ClickButton(Image2);
        ClickButton(DoneBtn);
        ClickButton(Send);
        Automation_Run.sendKeys("Automation Run ");
        ClickButton(NormalPost);
        WebDriverWait wait = new WebDriverWait(driver,50);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("com.humansoftsolution.ugu:id/btn_send_story")));
        ClickButton(Story);
        driver.navigate().back();
        driver.navigate().back();
    }
    public void AddAll(AppiumDriver driver){
        ClickButton(AddPostBtn);
        ClickButton(Allow1);
        ClickButton(Allow2);
        ClickButton(Allow3);
        ClickButton(Capture);
        ClickButton(Gallery);
        ClickButton(Image1);
        ClickButton(DoneBtn);
        ClickButton(Send);
        Automation_Run.sendKeys("Automation Run ");
        ClickButton(NormalPost);
        WebDriverWait wait = new WebDriverWait(driver,50);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("com.humansoftsolution.ugu:id/btn_send_story")));
        ClickButton(Story);
        driver.navigate().back();
        driver.navigate().back();
       // driver.navigate().refresh();


    }
    public void AddText(AppiumDriver driver){
        ClickButton(AddPostBtn);
        ClickButton(TextBtn);
        PostText.sendKeys("Hello , It's automation Run");
        ClickButton(NormalPost);
        WebDriverWait wait = new WebDriverWait(driver,50);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("com.humansoftsolution.ugu:id/btn_send_story")));
        ClickButton(Story);
        driver.navigate().back();
        driver.navigate().back();

    }


}

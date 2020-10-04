package Pages;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.TouchAction;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import io.appium.java_client.touch.WaitOptions;
import io.appium.java_client.touch.offset.PointOption;
import org.openqa.selenium.*;
import org.openqa.selenium.support.PageFactory;

import java.time.Duration;

public class PageBase {
    public JavascriptExecutor Jse;

    public PageBase(AppiumDriver driver)
    {

        PageFactory.initElements(new AppiumFieldDecorator(driver, Duration.ofSeconds(10)), this);
    }

    protected  static void ClickButton(MobileElement button)
    {

        button.click();
    }

    WebElement checkElement(AppiumDriver driver, By by) {
        try {
            return driver.findElement(by);
        } catch (NoSuchElementException e) {
            return null;
        }
    }
    public void ScrollDown(AppiumDriver driver){
        Dimension dim=driver.manage().window().getSize();
        int x = dim.getWidth()/2;
        int y=(int) (dim.getHeight()*0.3);
        int endY=(int)(dim.getHeight()*0.1);
        TouchAction t = new TouchAction(driver);
        t.press(PointOption.point(x,y)).waitAction(WaitOptions.waitOptions(Duration.ofMillis(500)))
                .moveTo(PointOption.point(x,endY)).release().perform();
    }

}

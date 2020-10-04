package Tests;

import Pages.LoginPage;
import Pages.LogoutPage;
import org.testng.annotations.Test;

public class LogoutTests extends TestBase {

    LogoutPage LogoutObj;
    @Test(priority = 6)
    public void UserCanLogOut() {
        LogoutObj=new LogoutPage(driver);
        LogoutObj.UserCanLogOut(driver);

    }
}

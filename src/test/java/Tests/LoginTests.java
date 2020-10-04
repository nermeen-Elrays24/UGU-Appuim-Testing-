package Tests;

import Pages.LoginPage;
import org.testng.annotations.Test;

public class LoginTests extends TestBase {
    LoginPage loginObj;

    @Test(priority = 1)
    public void UserCanLogin() {
        loginObj=new LoginPage(driver);
        loginObj.SuccessfullyLogin(driver);

    }
    @Test(priority = 1,enabled = false)
    public void UserEnterInvalidCredentials(){
        loginObj=new LoginPage(driver);
        loginObj.InvalidCredentials(driver);
    }
    @Test(enabled = false)
    public void UserEnterEmptyFields(){
        loginObj=new LoginPage(driver);
        loginObj.EmptyFields(driver);
    }
}

package Tests;

import Pages.ProfilePage;

public class ProfileTests extends TestBase {
    ProfilePage ProfileObj;



    public void UserCanChangeProfilePic(){
        ProfileObj=new ProfilePage(driver);
        ProfileObj.ChangeProfilePic(driver);
    }
}

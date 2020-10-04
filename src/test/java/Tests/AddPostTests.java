package Tests;

import Pages.AddPostPage;
import org.testng.annotations.Test;

public class AddPostTests extends TestBase {
    AddPostPage AddPostObj;

    @Test(priority = 3,enabled = false)
    public void UserCanAddNormalPost(){
        AddPostObj= new AddPostPage(driver);
        AddPostObj.AddNormalPost(driver);
    }
    @Test(priority = 3,enabled = true)
    public void UserCanAddStory() throws InterruptedException {
        AddPostObj=new AddPostPage(driver);
        AddPostObj.AddStory(driver);
    }
    @Test(priority = 4,enabled = false)
    public void UserCanAddPhotoAndGallery(){
        AddPostObj=new AddPostPage(driver);
        AddPostObj.AddAll(driver);
    }
    @Test(priority = 5,enabled = false)
    public void UserCanAddTextPost()
    {
        AddPostObj=new AddPostPage(driver);
        AddPostObj.AddText(driver);
    }
}

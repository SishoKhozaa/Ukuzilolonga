package Tests;

import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

@Test
public class PurchaseItemTest extends Base{

    String username = "standard_user";
    String password = "secret_sauce";

    @Test
    public void EnterUserName(){
        loginPage.enterUsername(username);
    }

    @Test(dependsOnMethods = "EnterUserName")
    public void EnterPassword(){
        loginPage.enterPassword(password);
    }

    @Test(dependsOnMethods = "EnterPassword")
    public void ClickLoginButton(){
        loginPage.clickLoginButton();
    }

    @Test(dependsOnMethods = "ClickLoginButton")
    public void ProductIsDisplayed(){
        homePage.verifyProductTextIsDisplayedInHomePage();
    }

    @AfterTest
    public void closeBrowser(){
        driver.quit();
    }

}

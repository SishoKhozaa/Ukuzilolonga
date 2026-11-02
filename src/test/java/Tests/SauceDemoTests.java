package Tests;

import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

public class SauceDemoTests extends Base{

    String username = "standard_user";
    String password = "secret_sauce";

    @Test
    public void loginWithInvalidDetails(){
        loginPage.enterUsername(password);
        loginPage.enterPassword(password);
        loginPage.clickLoginButton();
        loginPage.verifyMessageIsDisplayedWhenLoginIsIncorrect();
    }

    @Test
    public void loginWithValidDetails(){
        loginPage.enterUsername(username);
        loginPage.enterPassword(password);
        loginPage.clickLoginButton();
        homePage.verifyProductTextIsDisplayedInHomePage();
    }

    @AfterTest
    public void closeBrowser(){
        driver.quit();
    }
}

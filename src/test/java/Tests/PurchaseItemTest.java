package Tests;

import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

@Test
public class PurchaseItemTest extends Base{

    @Test
    public void EnterUserName(){
        loginPage.enterUsername(readFromExcel.username);
    }

    @Test(dependsOnMethods = "EnterUserName")
    public void EnterPassword(){
        loginPage.enterPassword(readFromExcel.password);
        takeScreenShots.takeSnapShot(driver, "screenshot");
    }

    @Test(dependsOnMethods = "EnterPassword")
    public void ClickLoginButton(){
        loginPage.clickLoginButton();
    }

    @Test(dependsOnMethods = "ClickLoginButton")
    public void ProductIsDisplayed(){
        homePage.verifyProductTextIsDisplayedInHomePage();
        takeScreenShots.takeSnapShot(driver, "screenshot");
    }

    @Test(dependsOnMethods = "ProductIsDisplayed")
    public void AddSauceLabsBackpackToCart(){
        homePage.clickSauceLabsBackpackButton();
    }

    @Test(dependsOnMethods = "AddSauceLabsBackpackToCart")
    public void CartDisplaysIncrement(){
        homePage.cartDisplaysIncrement();
        takeScreenShots.takeSnapShot(driver, "screenshot");
    }

    @Test(dependsOnMethods = "AddSauceLabsBackpackToCart")
    public void ClickCart(){
        homePage.clickShoppingCart();
    }

    @Test(dependsOnMethods = "ClickCart")
    public void YourCartTitle(){
        yourCartPage.verifyYourCartTextIsDisplayed();
        takeScreenShots.takeSnapShot(driver, "screenshot");
    }

    @Test(dependsOnMethods = "ClickCart")
    public void SauceLabBackpackIsDisplayed(){
        yourCartPage.sauceLabsBackpackItemIsDisplayed();
    }

    @Test(dependsOnMethods = "SauceLabBackpackIsDisplayed")
    public void ClickCheckout(){
        yourCartPage.clickCheckoutButton();
    }

    @Test(dependsOnMethods = "ClickCheckout")
    public void CheckoutTitle(){
        checkoutPage.verifyCheckoutTitleIsDisplayed();
        takeScreenShots.takeSnapShot(driver, "screenshot");
    }

    @Test(dependsOnMethods = "CheckoutTitle")
    public void EnterFirstName(){
        checkoutPage.enterFirstName(readFromExcel.firstName);
    }

    @Test(dependsOnMethods = "EnterFirstName")
    public void EnterLastName(){
        checkoutPage.enterLastName(readFromExcel.lastName);
    }

    @Test(dependsOnMethods = "EnterLastName")
    public void EnterPostalCode(){
        checkoutPage.enterPostalCode(readFromExcel.zipCode);
        takeScreenShots.takeSnapShot(driver, "screenshot");
    }

    @Test(dependsOnMethods = "EnterPostalCode")
    public void ClickContinueButton(){
        checkoutPage.clickContinueButton();
    }

    @Test(dependsOnMethods = "ClickContinueButton")
    public void CheckoutOverviewIsDisplayed(){
        checkoutOverviewPage.verifyCheckoutOverviewTitleIsDisplayed();
        takeScreenShots.takeSnapShot(driver, "screenshot");
    }

    @Test(dependsOnMethods = "CheckoutOverviewIsDisplayed")
    public void ClickFinishButton(){
        checkoutOverviewPage.clickFinishButton();
    }

    @Test(dependsOnMethods = "ClickFinishButton")
    public void CheckoutCompleteIsDisplayed(){
        checkoutCompletePage.verifyCheckoutOverviewTitleIsDisplayed();
        takeScreenShots.takeSnapShot(driver, "screenshot");
    }

    @Test(dependsOnMethods = "CheckoutCompleteIsDisplayed")
    public void ClickBackHomeButton(){
        checkoutCompletePage.clickBackHomeButton();
    }

    @Test(dependsOnMethods = "ClickBackHomeButton")
    public void ProducttIsDisplayed(){
        homePage.verifyProductTextIsDisplayedInHomePage();
        takeScreenShots.takeSnapShot(driver, "screenshot");
    }

    @AfterTest
    public void closeBrowser(){
        driver.quit();
    }

}

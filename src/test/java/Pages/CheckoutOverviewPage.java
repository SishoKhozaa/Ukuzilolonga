package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class CheckoutOverviewPage {
    WebDriver driver;

    @FindBy(xpath = "//span[@class='title'][contains(.,'Checkout: Overview')]")
    WebElement checkoutOverviewTitle_xpath;

    //@FindBy(xpath = "//input[contains(@id,'first-name')]")
    //WebElement firstname_xpath;

    //@FindBy(xpath = "//input[contains(@id,'last-name')]")
    //WebElement lastname_xpath;

    //@FindBy(xpath = "//input[contains(@id,'postal-code')]")
    //WebElement postalcode_xpath;

    @FindBy(xpath = "//button[contains(@id,'finish')]")
    WebElement finish_button;

    //@FindBy(xpath = "//button[@id='add-to-cart-sauce-labs-backpack']")
    //WebElement sauceLabsBackpack_button;

    //@FindBy(xpath = "//a[@class='shopping_cart_link'][contains(.,'1')]")
    //WebElement shoppingCart_xpath;

    //@FindBy(xpath = "//a[contains(@class,'shopping_cart_link')]")
   // WebElement shoppingCart_button;


    public CheckoutOverviewPage(WebDriver driver){
        this.driver = driver;
    } //constructor

    public void verifyCheckoutOverviewTitleIsDisplayed(){
        new WebDriverWait(driver, Duration.ofSeconds(20)).until(ExpectedConditions.visibilityOf(checkoutOverviewTitle_xpath));
        checkoutOverviewTitle_xpath.isDisplayed();
    }

   // public void enterFirstName(String firstname){
     //   firstname_xpath.clear();
      //  firstname_xpath.sendKeys(firstname);
   // }

    //public void enterLastName(String lastname){
        //lastname_xpath.clear();
        //lastname_xpath.sendKeys(lastname);
   // }

    //public void enterPostalCode(String postalcode){
       // postalcode_xpath.clear();
       // postalcode_xpath.sendKeys(postalcode);
    //}

    //public void sauceLabsBackpackItemIsDisplayed(){
       // sauceLabsBackpack_xpath.isDisplayed();
   // }

    public void clickFinishButton(){
        finish_button.click();
    }

    //public void clickSauceLabsBackpackButton(){
      //  sauceLabsBackpack_button.click();
    //}

    //public void cartDisplaysIncrement(){
       // shoppingCart_xpath.isDisplayed();
    //}

    //public void clickShoppingCart(){
        //shoppingCart_button.click();
    //}
}

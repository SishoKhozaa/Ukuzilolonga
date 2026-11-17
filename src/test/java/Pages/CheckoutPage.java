package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class CheckoutPage {
    WebDriver driver;

    @FindBy(xpath = "//span[contains(.,'Checkout: Your Information')]")
    WebElement checkoutTitle_xpath;

    @FindBy(xpath = "//input[contains(@id,'first-name')]")
    WebElement firstname_xpath;

    @FindBy(xpath = "//input[contains(@id,'last-name')]")
    WebElement lastname_xpath;

    @FindBy(xpath = "//input[contains(@id,'postal-code')]")
    WebElement postalcode_xpath;

    @FindBy(xpath = "//input[@id='continue']")
    WebElement continue_button;

    //@FindBy(xpath = "//button[@id='add-to-cart-sauce-labs-backpack']")
    //WebElement sauceLabsBackpack_button;

    //@FindBy(xpath = "//a[@class='shopping_cart_link'][contains(.,'1')]")
    //WebElement shoppingCart_xpath;

    //@FindBy(xpath = "//a[contains(@class,'shopping_cart_link')]")
   // WebElement shoppingCart_button;


    public CheckoutPage(WebDriver driver){
        this.driver = driver;
    } //constructor

    public void verifyCheckoutTitleIsDisplayed(){
        new WebDriverWait(driver, Duration.ofSeconds(10)).until(ExpectedConditions.visibilityOf(checkoutTitle_xpath));
        checkoutTitle_xpath.isDisplayed();
    }

    public void enterFirstName(String firstname){
        firstname_xpath.clear();
        firstname_xpath.sendKeys(firstname);
    }

    public void enterLastName(String lastname){
        lastname_xpath.clear();
        lastname_xpath.sendKeys(lastname);
    }

    public void enterPostalCode(String postalcode){
        postalcode_xpath.clear();
        postalcode_xpath.sendKeys(postalcode);
    }

    //public void sauceLabsBackpackItemIsDisplayed(){
       // sauceLabsBackpack_xpath.isDisplayed();
   // }

    public void clickContinueButton(){
        continue_button.click();
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

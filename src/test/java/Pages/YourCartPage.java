package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class YourCartPage {
    WebDriver driver;

    @FindBy(xpath = "//span[contains(.,'Your Cart')]")
    WebElement yourCartTitle_xpath;

    @FindBy(xpath = "//div[@class='inventory_item_name'][contains(.,'Sauce Labs Backpack')]")
    WebElement sauceLabsBackpack_xpath;

    @FindBy(xpath = "//button[@id='checkout']")
    WebElement checkout_button;

    //@FindBy(xpath = "//button[@id='add-to-cart-sauce-labs-backpack']")
    //WebElement sauceLabsBackpack_button;

    //@FindBy(xpath = "//a[@class='shopping_cart_link'][contains(.,'1')]")
    //WebElement shoppingCart_xpath;

    //@FindBy(xpath = "//a[contains(@class,'shopping_cart_link')]")
   // WebElement shoppingCart_button;


    public YourCartPage(WebDriver driver){
        this.driver = driver;
    } //constructor

    public void verifyYourCartTextIsDisplayed(){
        new WebDriverWait(driver, Duration.ofSeconds(10)).until(ExpectedConditions.visibilityOf(yourCartTitle_xpath));
        yourCartTitle_xpath.isDisplayed();
    }

    public void sauceLabsBackpackItemIsDisplayed(){
        sauceLabsBackpack_xpath.isDisplayed();
    }

    public void clickCheckoutButton(){
        checkout_button.click();
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

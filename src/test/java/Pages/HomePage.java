package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class HomePage {
    WebDriver driver;

    @FindBy(xpath = "//span[contains(.,'Products')]")
    WebElement productTitle_xpath;

    @FindBy(xpath = "//div[@class='inventory_item_name '][contains(.,'Sauce Labs Backpack')]")
    WebElement sauceLabsBackpack_xpath;

    @FindBy(xpath = "//button[@id='add-to-cart-sauce-labs-backpack']")
    WebElement sauceLabsBackpack_button;

    @FindBy(xpath = "//a[@class='shopping_cart_link'][contains(.,'1')]")
    WebElement shoppingCart_xpath;

    @FindBy(xpath = "//a[contains(@class,'shopping_cart_link')]")
    WebElement shoppingCart_button;


    public HomePage(WebDriver driver){
        this.driver = driver;
    } //constructor

    public void verifyProductTextIsDisplayedInHomePage(){
        new WebDriverWait(driver, Duration.ofSeconds(10)).until(ExpectedConditions.visibilityOf(productTitle_xpath));
        productTitle_xpath.isDisplayed();
    }

    public void clickSauceLabsBackpackButton(){
        sauceLabsBackpack_button.click();
    }

    public void cartDisplaysIncrement(){
        shoppingCart_xpath.isDisplayed();
    }

    public void clickShoppingCart(){
        shoppingCart_button.click();
    }
}

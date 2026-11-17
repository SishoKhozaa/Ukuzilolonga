package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class CheckoutCompletePage {
    WebDriver driver;

    @FindBy(xpath = "//span[@class='title'][contains(.,'Checkout: Complete!')]")
    WebElement checkoutCompleteTitle_xpath;


    @FindBy(xpath = "//button[contains(@id,'back-to-products')]")
    WebElement back_home_button;


    public CheckoutCompletePage(WebDriver driver){
        this.driver = driver;
    } //constructor

    public void verifyCheckoutOverviewTitleIsDisplayed(){
        new WebDriverWait(driver, Duration.ofSeconds(10)).until(ExpectedConditions.visibilityOf(checkoutCompleteTitle_xpath));
        checkoutCompleteTitle_xpath.isDisplayed();
    }


    public void clickBackHomeButton(){
        back_home_button.click();
    }

}

package Tests;

import Pages.*;
import Utils.BrowserFactory;
import Utils.ReadFromExcel;
import Utils.TakeScreenShots;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import java.io.IOException;

public class Base {
    BrowserFactory browserFactory = new BrowserFactory();
    final WebDriver driver = browserFactory.startBrowser("chrome", "https://www.saucedemo.com/");
    LoginPage loginPage = PageFactory.initElements(driver,LoginPage.class);
    HomePage homePage = PageFactory.initElements(driver,HomePage.class);
    YourCartPage yourCartPage = PageFactory.initElements(driver,YourCartPage.class);
    CheckoutPage checkoutPage = PageFactory.initElements(driver,CheckoutPage.class);
    CheckoutOverviewPage checkoutOverviewPage = PageFactory.initElements(driver,CheckoutOverviewPage.class);
    CheckoutCompletePage checkoutCompletePage = PageFactory.initElements(driver,CheckoutCompletePage.class);
    TakeScreenShots takeScreenShots = new TakeScreenShots();
    ReadFromExcel readFromExcel;
    {
        try {
            readFromExcel = new ReadFromExcel();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

}

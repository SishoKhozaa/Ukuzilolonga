package Utils;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class TakeScreenShots {

    private static String screenShotFolder = new SimpleDateFormat("yyyyMMdd_HHmmss").format(new Date());
    private static String screenShotDir = System.getProperty("user.dir") + "/Screenshots/Sauce Demo screenshots_" + screenShotFolder;

    public void takeSnapShot(WebDriver driver, String ScreenshotName){
        String timestamp = new SimpleDateFormat("yyyyMMdd_HHmmss").format(new Date());
        TakesScreenshot takesScreenshot = (TakesScreenshot) driver;
        File src = takesScreenshot.getScreenshotAs(OutputType.FILE);
        File destination = new File(screenShotDir, ScreenshotName + "_" +timestamp+ ".png");

        try {
            FileUtils.copyFile(src, destination);
        } catch (IOException e){
            e.printStackTrace();
        }
    }
}

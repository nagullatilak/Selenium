package testcases;

import ObjectRepository.MobilesPage;
import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import static java.awt.SystemColor.window;

public class MobileTest extends SignIn {
    public  WebDriver driver;
    @Test
     public  void  selectLastMobile() throws InterruptedException {
        MobileTest test = new MobileTest();
        driver = test.getDriver();
        MobilesPage mobilesPage = new MobilesPage(driver);
        mobilesPage.getSearchBox().sendKeys("mobiles");
        mobilesPage.getSearchButton().click();
        JavascriptExecutor js = (JavascriptExecutor)driver;
        js.executeScript("scroll(0, 4000);");
        WebDriverWait wait=new WebDriverWait(driver,3);
        wait.until(ExpectedConditions.visibilityOfElementLocated(mobilesPage.waitForMobile()));
         String info = mobilesPage.getSelectLastMobile().getText();
         System.out.println(info);
        JavascriptExecutor jse = (JavascriptExecutor)driver;
        jse.executeScript("scroll(0, -250);");
    }
}

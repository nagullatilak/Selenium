package testcases;

import ObjectRepository.LeftNavPage;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

public class LeftNavTest extends SignIn {
    public WebDriver driver;
    @Test
    public void leftNavigation() throws InterruptedException {
        LeftNavTest nav = new LeftNavTest();
        driver = nav.getDriver();
        LeftNavPage leftNav = new LeftNavPage(driver);
        leftNav.leftNavigation().click();
       // Thread.sleep(300);
        leftNav.getClickOnMobiles().click();
        leftNav.getMainManu().click();
        //Thread.sleep(300);
        leftNav.getClose().click();

    }
}

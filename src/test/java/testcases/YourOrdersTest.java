package testcases;

import ObjectRepository.YourOrdersPage;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

public class YourOrdersTest  extends SignIn{
    public WebDriver driver;
    @Test
    public void myOrders(){
        YourOrdersTest test = new YourOrdersTest();
        driver = test.getDriver();
        YourOrdersPage myOrders = new YourOrdersPage(driver);
        myOrders.getYourOrders().click();
        myOrders.getDropDown().click();
        myOrders.getSelectYear().click();
        myOrders.getGetProduct().click();
        driver.navigate().back();

    }

}

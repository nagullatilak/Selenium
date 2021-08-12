package testcases;
import ObjectRepository.TodaysDeals;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TodaysDealsTest extends SignIn {
    public  WebDriver driver;
    public  String expected = "1";
    @Test
    public void todaysDeals() throws InterruptedException {
        TodaysDealsTest todays = new TodaysDealsTest();
        driver = todays.getDriver();
        TodaysDeals deals = new TodaysDeals(driver);
        int items =0;
        deals.todaysDeals().click();
        Thread.sleep(2000);
        deals.selectThirdProduct().click();
        WebDriverWait wait=new WebDriverWait(driver,3);
        wait.until(ExpectedConditions.visibilityOfElementLocated(deals.getByThirdDeal()));
        deals.clickOnProduct().click();
        String quantity = deals.emptyCart();
        if(quantity == "0") {
            Assert.assertEquals(expected, quantity);
        }
        else{
            items = Integer.parseInt(quantity)+1;
        }
        deals.addToCart().click();
        String noOfProductsInTheCart = deals.emptyCart();
        String actualItems = String.valueOf(items);
       // Assert.assertEquals(actualItems ,noOfProductsInTheCart);
    }
}

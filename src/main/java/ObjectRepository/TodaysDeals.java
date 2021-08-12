package ObjectRepository;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class TodaysDeals {
    WebDriver driver;
    public  TodaysDeals(WebDriver driver){
        this.driver = driver;
    }
    By todaysDeals = By.linkText("See all deals");
    By selectThirdProduct = By.xpath("//*[@id=\"slot-12\"]/div/div/div/div[2]/div/div[3]/div/a[1]/div/div/img");
    By clickOnProduct = By.xpath("//*[@id=\"octopus-dlp-asin-stream\"]/ul/li[3]/span/div/div[1]/a");
    //Do the assertion before adding in to the cart whether the cart is empty or not;
    By emptyCart = By.id("nav-cart-count");
    By addToCart = By.id("add-to-cart-button");
    public WebElement todaysDeals(){
        return  driver.findElement(todaysDeals);
    }
    public WebElement selectThirdProduct(){
        ((JavascriptExecutor) driver)
                .executeScript("window.scrollTo(0, document.body.scrollHeight)");
        return driver.findElement(selectThirdProduct);
    }
    public WebElement clickOnProduct() throws InterruptedException {

        return driver.findElement(clickOnProduct);
    }
    public String emptyCart(){
        return driver.findElement(emptyCart).getText();
    }
    public WebElement addToCart(){
        return  driver.findElement(addToCart);
    }
    public  By getByThirdDeal(){
        return By.xpath("//*[@id=\"octopus-dlp-asin-stream\"]/ul/li[3]/span/div/div[1]/a");
    }
}

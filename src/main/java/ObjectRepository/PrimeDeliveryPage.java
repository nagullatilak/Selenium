package ObjectRepository;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PrimeDeliveryPage {
    WebDriver driver;
    public PrimeDeliveryPage(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver,this);
    }
    @FindBy(xpath = "//*[@id=\"nav-xshop\"]/a[1]")
    WebElement mobiles;
    @FindBy(xpath = "//*[@id=\"s-refinements\"]/div[3]/ul/li/span/a/div/label/i")
    WebElement primeCheckBox;
    @FindBy(xpath = "//div[@data-component-type='s-search-result'][4] //span[@class='a-text-bold']")

    WebElement firstProductDate;

    public  WebElement getMobiles(){
        return  mobiles;
    }
    public  WebElement clickOnPrime(){
        return  primeCheckBox;
    }
    public WebElement getFirstProductDate(){
        return firstProductDate;
    }

}


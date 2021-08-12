package ObjectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class YourOrdersPage {
    WebDriver driver;
    public YourOrdersPage(WebDriver driver){
        this.driver =driver;
        PageFactory.initElements(driver,this);
    }
    @FindBy(id = "nav-orders")
    WebElement yourOrders;
    @FindBy(id = "timePeriodForm")
    WebElement dropDown;
    @FindBy(linkText = "2020")
    WebElement selectYear;
    @FindBy(xpath = "//*[@id=\"ordersContainer\"]/div[2]/div[2]/div/div/div/div[1]/div/div/div/div[2]/div[1]")
    WebElement getProduct;
    public WebElement getYourOrders(){
        return yourOrders;
    }
    public  WebElement getDropDown(){
        return  dropDown;
    }
    public WebElement getSelectYear(){
        return  selectYear;
    }
    public  WebElement getGetProduct(){
        return  getProduct;
    }
}

package ObjectRepository;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class MobilesPage {
    WebDriver driver;
    public  MobilesPage(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver,this);
    }
    @FindBy(id ="twotabsearchtextbox")
    WebElement searchBox;
    @FindBy(id = "nav-search-submit-button")
    WebElement searchButton;
    @FindBy(xpath = "//*[@id=\"search\"]/div[1]/div[1]/div")
    public  List<WebElement> selectLastMobile;
    public WebElement getSearchBox(){
        return searchBox;
    }
    public WebElement getSearchButton(){
        return  searchButton;
    }
    public  WebElement getSelectLastMobile(){
        String  size = String.valueOf(selectLastMobile.size()-1);
        System.out.println("Size :"+size);
        return driver.findElement(By.cssSelector("div[data-component-type='s-search-result']:nth-child(15) h2"));
    }
    public  By waitForMobile(){
        String size=String.valueOf(selectLastMobile.size()-1);
        return By.cssSelector("div[data-component-type='s-search-result']:nth-child(15) h2");
    }
}

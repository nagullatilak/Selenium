package ObjectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LeftNavPage {
    WebDriver driver;
    public  LeftNavPage(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver,this);
    }
    @FindBy(id = "nav-hamburger-menu")
    WebElement leftNav;
    @FindBy(xpath = "//*[@id=\"hmenu-content\"]/ul[1]/li[15]/a")
    WebElement clickOnMobiles;
    @FindBy(xpath = "//*[@id=\"hmenu-content\"]/ul[8]/li[1]/a")
    WebElement mainManu;
    @FindBy(xpath = "//*[@id=\"hmenu-canvas-background\"]/div")
    WebElement close;
    public WebElement leftNavigation(){
        return leftNav;
    }
    public  WebElement getClickOnMobiles(){
        return  clickOnMobiles;
    }
    public WebElement getMainManu(){
        return  mainManu;
    }
    public  WebElement getClose(){
        return close;
    }

}

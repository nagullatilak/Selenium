package ObjectRepository;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class AmazonSignIn {
    WebDriver driver;

    public AmazonSignIn(WebDriver driver) {
        this.driver =driver;
    }
    By signIn = By.xpath("//*[@id=\"nav-link-accountList\"]");
    //By clickOnSignIn = By.xpath("//*[@id=\"nav-flyout-ya-signin\"]/a/span");
    By email = By.id("ap_email");
    By next = By.id("continue");
    By passWord = By.name("password");
    By submit = By.id("signInSubmit");
    By name = By.id("nav-link-accountList-nav-line-1");
    public WebElement signIn(){
        return  driver.findElement(signIn);

    }
    public WebElement email(){

        return driver.findElement(email);
    }
    public WebElement next(){

        return driver.findElement(next);
    }
    public WebElement passWord(){
        return  driver.findElement(passWord);
    }
    public  WebElement submit(){
        return  driver.findElement(submit);
    }
    public WebElement getName(){
        return  driver.findElement(name);
    }
}

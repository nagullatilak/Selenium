package testcases;

import ObjectRepository.AmazonSignIn;
import ObjectRepository.TodaysDeals;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.*;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

public class SignIn {
    public static WebDriver driver;
    public  AmazonSignIn  signIn;
    public WebDriver getDriver(){
        return driver;
    }
    @BeforeTest
    public void login() throws IOException {
        FileInputStream file = new FileInputStream("/home/tilan/IdeaProjects/AmazonAssignment/src/data.properties");
        Properties prop = new Properties();
        prop.load(file);
        System.setProperty("webdriver.chrome.driver", "/home/tilan/Downloads/chromedriver_linux64/chromedriver");
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
        driver.get(prop.getProperty("url"));
        driver.manage().window().maximize();
        signIn = new AmazonSignIn(driver);
        signIn.signIn().click();
        signIn.email().sendKeys(prop.getProperty("email"));
        signIn.next().click();
        signIn.passWord().sendKeys(prop.getProperty("password"));
        signIn.submit().click();
        //Account checking
        WebElement element = signIn.getName();
        String name = element.getText();
        Assert.assertEquals("Hello, tilak", name);
    }
    @AfterTest
    public void atLast(){
        driver.close();
    }

}

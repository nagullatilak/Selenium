package testcases;

import ObjectRepository.AddAddressPage;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class AddAddressTest extends SignIn {
    public WebDriver driver;

    @Test
    public void  addAddress() throws IOException, InterruptedException {
        AddAddressTest test = new AddAddressTest();
        driver = test.getDriver();
        AddAddressPage addAddress = new AddAddressPage(driver);
        FileInputStream file = new FileInputStream("/home/tilan/IdeaProjects/AmazonAssignment/src/data.properties");
        Properties prop = new Properties();
        prop.load(file);
        driver.navigate().back();
        addAddress.getYourAddress().click();
        Thread.sleep(3000);
        addAddress.getAddAddressBox().click();
        addAddress.getEnterYourName().sendKeys(prop.getProperty("name"));
        Actions act = new Actions(driver);
        act.sendKeys(Keys.TAB).build().perform();
        act.sendKeys(Keys.TAB).build().perform();
        act.sendKeys(prop.getProperty("mobileNo")).build().perform();
        act.sendKeys(Keys.TAB).build().perform();
        act.sendKeys(prop.getProperty("pinCode")).build().perform();
        act.sendKeys(Keys.TAB).build().perform();
        act.sendKeys(prop.getProperty("flatN0")).build().perform();
        act.sendKeys(Keys.TAB).build().perform();
        act.sendKeys(prop.getProperty("street")).build().perform();
        act.sendKeys(Keys.TAB).build().perform();
        act.sendKeys(prop.getProperty("landMark")).build().perform();
        act.sendKeys(Keys.TAB).build().perform();
        act.sendKeys(prop.getProperty("town")).build().perform();
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,250)", "");
        //Thread.sleep(300);
        WebElement element = addAddress.getAddressType();
        element.click();
        //Thread.sleep(3000);
        act.sendKeys(Keys.ARROW_DOWN).build().perform();
        act.sendKeys(Keys.ENTER).build().perform();
        //Thread.sleep(3000);
        addAddress.getSubmit().click();
        String message = addAddress.getAddressSavedMessage().getText();
        Assert.assertEquals("Address saved",message);

    }
}

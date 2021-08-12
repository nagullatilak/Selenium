package testcases;

import ObjectRepository.AddPaymentPage;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class AddPaymentTest extends  SignIn{
    public WebDriver driver;
    @Test
    public void addPaymentOption(){
        AddPaymentTest test = new AddPaymentTest();
        driver = test.getDriver();
        AddPaymentPage addPaymentOption = new AddPaymentPage(driver);
        addPaymentOption.getAccount().click();
        addPaymentOption.getYourAccount().click();
        addPaymentOption.getPaymentOption().click();
        String cvvNo = addPaymentOption.getCardNo().getText();
        Assert.assertEquals("ending in 0173" , cvvNo);

    }
}

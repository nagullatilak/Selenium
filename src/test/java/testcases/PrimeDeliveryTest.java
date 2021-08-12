package testcases;

import ObjectRepository.PrimeDeliveryPage;
import ObjectRepository.TodaysDeals;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

public class PrimeDeliveryTest extends  SignIn {
    public WebDriver driver;
    @Test
    public void primeDelivery() throws InterruptedException {
        PrimeDeliveryTest test = new PrimeDeliveryTest();
       driver = test.getDriver();
        PrimeDeliveryPage prime = new PrimeDeliveryPage(driver);
        prime.getMobiles().click();
        prime.clickOnPrime().click();
        Thread.sleep(3000);
        String date = prime.getFirstProductDate().getText();
        System.out.println(date);

    }
}
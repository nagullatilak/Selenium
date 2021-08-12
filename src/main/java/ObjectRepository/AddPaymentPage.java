package ObjectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AddPaymentPage {
    public WebDriver driver;
    public AddPaymentPage(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver,this);
    }
    @FindBy(xpath = "//*[@id=\"nav-link-accountList\"]")
    WebElement account;
    @FindBy(linkText = "Your Account")
    WebElement yourAccount;
    @FindBy(xpath = "//*[@id=\"a-page\"]/div[2]/div/div[3]/div[2]/a")
    WebElement paymentOption;
    @FindBy(xpath = "//*[@id=\"cpefront-mpo-widget\"]/div/form/div/div/div[2]/div/div/a/span/div/div/div[2]/div/div/div[1]/span[2]/span[2]")
    WebElement cardNo;
            public WebElement getAccount(){
                  return  account;
            }
            public WebElement getYourAccount(){
                return  yourAccount;
            }
            public WebElement getPaymentOption(){
                return paymentOption;
            }
            public WebElement getCardNo(){
                return cardNo;
            }
    }


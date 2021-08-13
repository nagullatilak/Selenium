package ObjectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AddAddressPage {
    WebDriver driver;
    public  AddAddressPage(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver,this);
    }
    @FindBy(xpath = "//*[@id=\"a-page\"]/div[2]/div/div[3]/div[1]/a")
    WebElement yourAddress;
    @FindBy(xpath = "//*[@id=\"ya-myab-address-add-link\"]/div/div/h2")
    WebElement addAddressBox;
    @FindBy(xpath = "//*[@id=\"address-ui-widgets-enterAddressFullName\"]")
    WebElement enterYourName;
    @FindBy(xpath = "//*[@id=\"address-ui-widgets-enterAddressPhoneNumber\"]")
    WebElement mobileNO;
    @FindBy(xpath = "//*[@id=\"address-ui-widgets-enterAddressPostalCode\"]")
    WebElement pinCode;
    @FindBy(xpath = "//*[@id=\"address-ui-widgets-enterAddressLine1\"]")
    WebElement  flat;
    @FindBy(xpath = "//*[@id=\"address-ui-widgets-enterAddressLine2\"]")
    WebElement street;
    @FindBy(xpath = "//*[@id=\"address-ui-widgets-landmark\"]")
    WebElement landMark;
    //@FindBy(xpath = "")
    @FindBy(xpath = "//*[@id=\"address-ui-widgets-addr-details-address-type-and-business-hours\"]/span/span")
    WebElement addressType;
    @FindBy(id = "address-ui-widgets-form-submit-button")
    WebElement submit;
    @FindBy(className = "a-alert-heading")
    WebElement addressSavedMessage;
    public WebElement getYourAddress(){
        return yourAddress;
    }
    public WebElement getAddAddressBox(){
        return addAddressBox;
    }
    public WebElement getEnterYourName(){
        return  enterYourName;
    }
    public WebElement getMobileNO(){
        return  mobileNO;
    }
    public WebElement getPinCode(){
        return  pinCode;
    }
    public WebElement getFlat(){
        return flat;
    }
    public WebElement getStreet(){
        return flat;
    }
    public WebElement getLandMark(){
        return landMark;
    }
    public WebElement getAddressType(){
        return addressType;
    }
    public  WebElement getSubmit(){
        return  submit;
    }
    public WebElement getAddressSavedMessage(){
        return addressSavedMessage;
    }
}

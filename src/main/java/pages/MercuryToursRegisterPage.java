package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

public class MercuryToursRegisterPage extends BasePage {
    public MercuryToursRegisterPage(WebDriver driver) throws InterruptedException {
        super(driver);
    }

    //Using xpath
    @FindBy(xpath = "//a[contains(text(),'REGISTER')]")
        private WebElement registerLinkLocator;

    @FindBy(xpath = "//input[@name='firstName']")
        private WebElement firstNameLocator;

    @FindBy(xpath = "//input[@name='lastName']")
        private WebElement lastNameLocator;

    @FindBy(xpath = "//input[@name='phone']")
        private WebElement phoneLocator;

    @FindBy(xpath = "//select[@name='country']")
    private WebElement countryLocator;

    @FindBy(xpath = "//input[@id='userName']")
        private WebElement emailLocator;

    @FindBy(xpath = "//input[@name='address1']")
        private WebElement address1Locator;

    @FindBy(xpath = "//input[@name='address2']")
    private WebElement address2Locator;

    @FindBy(xpath = "//input[@name='city']")
    private WebElement cityLocator;

    @FindBy(xpath = "//input[@name='postalCode']")
    private WebElement postcodeLocator;

    //Using css
    @FindBy(css = "[name='email']")
        private WebElement userNameLocator;

    @FindBy(css = "[name='password']")
        private WebElement passwordLocator;

    @FindBy(css = "[name='confirmPassword']")
        private WebElement confirmPasswordLocator;

    @FindBy(css = "[name='register']")
    private WebElement submitButtonLocator;


    public void clickOnRegisterLink() {registerLinkLocator.click();}
    public void enterFirstName(String firstname) {firstNameLocator.sendKeys(firstname);}
    public void enterLastName(String lastname) {lastNameLocator.sendKeys(lastname);}
    public void enterPhone(String phone) {phoneLocator.sendKeys(phone);}
    public void enterEmail(String email) {emailLocator.sendKeys(email);}
    public void enterAddress1(String address1) {address1Locator.sendKeys(address1);}
    public void enterAddress2(String address2) {address2Locator.sendKeys(address2);}
    public void enterCity(String city) {cityLocator.sendKeys(city);}
    public void enterPostcode(String postcode) {postcodeLocator.sendKeys(postcode);}

    public void selectCountry(String Country) {
        Select country = new Select(countryLocator);
        country.selectByVisibleText(Country);
    }
    public void enterUsername(String username) {userNameLocator.sendKeys(username);}
    public void enterPassword(String password) {passwordLocator.sendKeys(password);}
    public void confirmPassword(String password) {confirmPasswordLocator.sendKeys(password);}
    public void clickOnSubmitButton(){submitButtonLocator.click();}

}

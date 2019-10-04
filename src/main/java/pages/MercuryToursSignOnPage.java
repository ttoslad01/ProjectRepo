package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

public class MercuryToursSignOnPage extends BasePage {
    public MercuryToursSignOnPage(WebDriver driver) {
        super(driver);
    }

    //Using Link text
    @FindBy(linkText = "SIGN-ON")
    private WebElement signOnLinkLocator;

    @FindBy(linkText = "SIGN-OFF")
    private WebElement signOffLinkLocator;

    //Using xpath
    @FindBy(xpath = "//a[contains(text(),'SIGN-ON')]")
    private WebElement signOnLink2Locator;

    @FindBy(xpath = "//select[@name='fromPort']")
    private WebElement departureLocator;

    @FindBy(xpath = "//select[@name='toPort']")
    private WebElement arrivalLocator;

    @FindBy(xpath = "//select[@name='airline']")
    private WebElement airlineLocator;


    //Using css
    @FindBy(css = "[name='userName']")
    private WebElement userNameLocator;

    @FindBy(css = "[name='password']")
    private WebElement passwordLocator;

    @FindBy(css = "[name='login']")
    private WebElement submitButtonLocator;

    @FindBy(css = "[name='findFlights']")
    private WebElement confirmButtonLocator;

    @FindBy(css = "[name='reserveFlights']")
    private WebElement reservationButtonLocator;

    @FindBy(css = "[name='creditnumber']")
    private WebElement cardnumberLocator;

    @FindBy(css = "[name='passFirst0']")
    private WebElement firstNameLocator;

    @FindBy(css = "[name='passLast0']")
    private WebElement lastNameLocator;

    @FindBy(css = "[name='buyFlights']")
    private WebElement purchaseButtonLocator;

    public void clickOnSignOnLink() {
        //signOnLinkLocator.click();
        click(signOnLinkLocator);
    }
    public void clickOnSignOffLink() {
        //signOffLinkLocator.click();
        click(signOffLinkLocator);
    }

    //public void clickOnSignOnLink2() {signOnLink2Locator.click();}

    public void enterCardNumber(String cardnumber) {
        //passwordLocator.sendKeys(password);
        sendKeys(cardnumberLocator,cardnumber);
    }
    public void enterFirstName(String username) {
        //userNameLocator.sendKeys(username);
        sendKeys(firstNameLocator,username);
    }
    public void enterLastName(String username) {
        //userNameLocator.sendKeys(username);
        sendKeys(lastNameLocator,username);
    }
    public void enterUsername(String username) {
        //userNameLocator.sendKeys(username);
        sendKeys(userNameLocator,username);
    }

    public void enterPassword(String password) {
        //passwordLocator.sendKeys(password);
        sendKeys(passwordLocator,password);
    }
    public void clickOnSubmitButton(){
        //submitButtonLocator.click();
        click(submitButtonLocator);
    }

    public void getPageTitle(){}

    public void clickOnConfirmationButton(){
        click(confirmButtonLocator);
    }
    public void clickOnReservationButton(){
        click(reservationButtonLocator);
    }
    public void clickOnSecurePurchaseButton(){
        click(purchaseButtonLocator);
    }

    public void selectDeaparture(String departFrom) {
        Select country = new Select(departureLocator);
        country.selectByVisibleText(departFrom);
    }
    public void selectArrival(String arriveIn) {
        Select country = new Select(arrivalLocator);
        country.selectByVisibleText(arriveIn);
    }
    public void selectAirline(String airline) {
        Select country = new Select(airlineLocator);
        country.selectByVisibleText(airline);
    }
}

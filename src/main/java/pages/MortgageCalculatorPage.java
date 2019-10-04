package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import pages.Utilities.Utility;

public class MortgageCalculatorPage extends BasePage implements MortgageCalcInterface{

    public MortgageCalculatorPage(WebDriver driver) {
        super(driver);
    }

    //Using css
    @FindBy(css = "input#homeval")
    private WebElement homeValueLocator;

    @FindBy(css = "input#downpayment")
    private WebElement downPaymentLocator;

    @FindBy(css = "input#loanamt")
    private WebElement loanAmountLocator;

    @FindBy(css = "input#intrstsrate")
    private WebElement interestRateLocator;

    @FindBy(css = "input#loanterm")
    private WebElement loanTermLocator;

    @FindBy(css = "[name='param[start_month]']")
    private WebElement monthLocator;

    @FindBy(css = "input#start_year")
    private WebElement yearLocator;

    @FindBy(css = "input[type='submit']")
    private WebElement calculateButtonLocator;

    @FindBy(xpath = "//div[@class='repayment-block']/div[1]/div[1]/h3")
    private WebElement monthlyRepaymentLocator;

    @FindBy(xpath = "//div[@class='repayment-block']/div[2]/div[1]/h3")
    private WebElement down_PaymentLocator;

    @FindBy(xpath = "//div[@class='repayment-block']/div[5]/div[1]/h3")
    private WebElement monthlyTaxLocator;

    @FindBy(xpath = "//div[@class='repayment-block']/div[6]/div[1]/h3")
    private WebElement monthlyHomeInsuranceLocator;

    public void enterHomeValue(String homeValue) {
        sendKeys(homeValueLocator,homeValue);
    }
    public void enterDownPayment(String downPayment) {
        sendKeys(downPaymentLocator,downPayment);
    }
    public void enterLoanAmt(String loanAmt) {
        sendKeys(loanAmountLocator,loanAmt);
    }
    public void enterInterstRate(String interstRate) {
        sendKeys(interestRateLocator,interstRate);
    }
    public void enterLoanTerm(String loanTerm) {
        sendKeys(loanTermLocator,loanTerm);
    }
    public void selectMonth(String month){
        selectFromDropDown(monthLocator,month);
    }
    public void enterYear(String year) {
        sendKeys(yearLocator,year);
    }
    public void clickOnCalculateButton() {
        click(calculateButtonLocator);
    }
    public String getMonthlyRepayment(){
        return monthlyRepaymentLocator.getText();
    }
    public String getDownPayment(){
        return down_PaymentLocator.getText();
    }
    public String getMonthlyTax(){
        return monthlyTaxLocator.getText();
    }
    public String getMonthlyHomeInsurance(){
        return monthlyHomeInsuranceLocator.getText();
    }
}

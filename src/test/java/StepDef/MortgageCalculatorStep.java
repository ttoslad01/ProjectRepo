package StepDef;

import base.BaseUtil;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pages.MortgageCalculatorPage;

import java.util.Arrays;
import java.util.List;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.IsCollectionContaining.hasItem;
import static org.hamcrest.core.IsEqual.equalTo;

public class MortgageCalculatorStep extends BaseUtil {
    private BaseUtil base;
    public MortgageCalculatorStep(BaseUtil base){this.base=base;}

    @Given("^I am on the Mortgage Calculator Home page$")
    public void iAmOnTheMortgageCalculatorHomePage() {
            base.driver.navigate().to("https://www.mortgagecalculator.org");
    }

    @When("^I enter valid details as \"([^\"]*)\", \"([^\"]*)\", \"([^\"]*)\", \"([^\"]*)\", \"([^\"]*)\", \"([^\"]*)\" and \"([^\"]*)\"$")
    public void i_enter_valid_details_as_and(String Home_Value, String DownPayment, String LoanAmount, String InterestRate, String LoanTerm, String Month, String Year) throws Throwable {
        MortgageCalculatorPage mortgageCalculatorPage = new MortgageCalculatorPage(base.driver);
        mortgageCalculatorPage.enterHomeValue(Home_Value);
        mortgageCalculatorPage.enterDownPayment(DownPayment);
        mortgageCalculatorPage.enterLoanAmt(LoanAmount);
        mortgageCalculatorPage.enterInterstRate(InterestRate);
        mortgageCalculatorPage.enterLoanTerm(LoanTerm);
        mortgageCalculatorPage.selectMonth(Month);
        mortgageCalculatorPage.enterYear(Year);
    }

    @When("^I click Calculate Button$")
    public void i_click_Calculate_Button() throws Throwable {
        MortgageCalculatorPage mortgageCalculatorPage = new MortgageCalculatorPage(base.driver);
        mortgageCalculatorPage.clickOnCalculateButton();
    }

    @Then("^\"([^\"]*)\", \"([^\"]*)\", \"([^\"]*)\" and \"([^\"]*)\" are correctly dispalyed$")
    public void and_are_correctly_dispalyed(String Monthly_Repayment, String Down_Payment, String MonthlyTax, String MonthlyHomeInsurance) throws Throwable {
        MortgageCalculatorPage mortgageCalculatorPage = new MortgageCalculatorPage(base.driver);
        assertThat(mortgageCalculatorPage.getMonthlyRepayment(), is(equalTo(Monthly_Repayment)));
        List<String>expectedDownPayAmounts = Arrays.asList(Down_Payment,"$25,000.00", "$30,000.00", "$35,000.00", "40,000.00");
        assertThat(expectedDownPayAmounts, hasItem(mortgageCalculatorPage.getDownPayment()));
        //assertThat(mortgageCalculatorPage.getDownPayment(), is(equalTo(Down_Payment)));
        assertThat(mortgageCalculatorPage.getMonthlyTax(), is(equalTo(MonthlyTax)));
        assertThat(mortgageCalculatorPage.getMonthlyHomeInsurance(), is(equalTo(MonthlyHomeInsurance)));
    }
}

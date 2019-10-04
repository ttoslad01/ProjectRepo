package StepDef;

import base.BaseUtil;
import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import pages.MercuryToursRegisterPage;
import pages.MercuryToursSignOnPage;

import java.util.Random;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.IsEqual.equalTo;

public class MercurySignOnStep extends BaseUtil {
    private BaseUtil base;

    public MercurySignOnStep(BaseUtil base) {
        this.base = base;
    }

    @Given("^I am on the Mercury Tours homepage$")
    public void iAmOnTheMercuryWebsite() {
        base.driver.navigate().to("http://newtours.demoaut.com/");
    }

    @When("^I click on the Sign-On button$")
    public void iClickOnTheSignOnButton() {
        MercuryToursSignOnPage mercuryToursSignOnPage = new MercuryToursSignOnPage(base.driver);
        mercuryToursSignOnPage.clickOnSignOnLink();

    }

    @And("^enter details as follows \"([^\"]*)\" and \"([^\"]*)\"$")
    public void enterDetailsAsFollowsAnd(String username, String password) throws Throwable {
        MercuryToursSignOnPage mercuryToursSignOnPage = new MercuryToursSignOnPage(base.driver);
        mercuryToursSignOnPage.enterUsername(username);
        mercuryToursSignOnPage.enterPassword(password);
    }

    @And("^enter details as follows username as \"([^\"]*)\" and password as \"([^\"]*)\"$")
    public void enterDetailsAsFollowsUsernameAsAndPasswordAs(String username, String password) throws Throwable {
        MercuryToursSignOnPage mercuryToursSignOnPage = new MercuryToursSignOnPage(base.driver);
        mercuryToursSignOnPage.enterUsername(username);
        mercuryToursSignOnPage.enterPassword(password);
    }

    @And("^click SUBMIT$")
    public void click_Submit() throws Throwable {
        MercuryToursSignOnPage mercuryToursSignOnPage = new MercuryToursSignOnPage(base.driver);
        mercuryToursSignOnPage.clickOnSubmitButton();
    }


    @Then("^\"([^\"]*)\" page is displayed$")
    public void pageIsDisplayed(String arg0) throws Throwable {
        MercuryToursSignOnPage mercuryToursSignOnPage = new MercuryToursSignOnPage(base.driver);
        assertThat(base.driver.getTitle(), is(equalTo("Find a Flight: Mercury Tours:")));
    }

    @And("^enter invalid details as follows username as \"([^\"]*)\" and password as \"([^\"]*)\"$")
    public void enterInvalidDetailsAsFollowsUsernameAsAndPasswordAs(String username, String password) throws Throwable {
        MercuryToursSignOnPage mercuryToursSignOnPage = new MercuryToursSignOnPage(base.driver);
        base.driver.findElement(By.xpath("//input[@name='userName']")).sendKeys(username);
        base.driver.findElement(By.xpath("//input[@name='password']")).sendKeys(password);

        //mercuryToursSignOnPage.enterUsername(username);
        //mercuryToursSignOnPage.enterPassword(password);
    }

    @Then("^Sign On page is displayed$")
    public void signOnPageIsDisplayed() {
        MercuryToursSignOnPage mercuryToursSignOnPage = new MercuryToursSignOnPage(base.driver);
        assertThat(base.driver.getTitle(), is(equalTo("Sign-on: Mercury Tours")));
        System.out.println("THE PAGE TITLE IS " + base.driver.getTitle());
    }

    @Given("^I am on the Flight finder page$")
    public void iAmOnTheFlightFinderPage() {
        base.driver.navigate().to("http://newtours.demoaut.com/");
    }

    @When("^I click on the Continue button$")
    public void iClickOnTheContinueButton() {
        MercuryToursSignOnPage mercuryToursSignOnPage = new MercuryToursSignOnPage(base.driver);
        mercuryToursSignOnPage.clickOnConfirmationButton();
    }

    @Then("^Flight options are displayed$")
    public void flightOptionsAreDisplayed() {
        MercuryToursSignOnPage mercuryToursSignOnPage = new MercuryToursSignOnPage(base.driver);
        assertThat(base.driver.getTitle(), is(equalTo("Select a Flight: Mercury Tours")));
    }

    @And("^On the Flight Selection page I click on the Continue button$")
    public void onTheFlightSelectionPageIClickOnTheContinueButton() {
        MercuryToursSignOnPage mercuryToursSignOnPage = new MercuryToursSignOnPage(base.driver);
        mercuryToursSignOnPage.clickOnReservationButton();
    }

    @Then("^Booking page is displayed$")
    public void bookingPageIsDisplayed() {
        MercuryToursSignOnPage mercuryToursSignOnPage = new MercuryToursSignOnPage(base.driver);
        assertThat(base.driver.getTitle(), is(equalTo("Book a Flight: Mercury Tours")));
    }

    @And("^enter details as follows \"([^\"]*)\", \"([^\"]*)\" and \"([^\"]*)\"$")
    public void enterDetailsAsFollowsAnd(String firstname, String lastname, String cardNumber) throws Throwable {
        MercuryToursSignOnPage mercuryToursSignOnPage = new MercuryToursSignOnPage(base.driver);
        mercuryToursSignOnPage.enterFirstName(firstname);
        mercuryToursSignOnPage.enterLastName(lastname);
        mercuryToursSignOnPage.enterCardNumber(cardNumber);
    }

    @And("^I click on Secure Payment button$")
    public void iClickOnSecurePaymentButton() {
        MercuryToursSignOnPage mercuryToursSignOnPage = new MercuryToursSignOnPage(base.driver);
        mercuryToursSignOnPage.clickOnSecurePurchaseButton();
    }

    @Then("^Confirmation page is displayed$")
    public void confirmationPageIsDisplayed() {
        MercuryToursSignOnPage mercuryToursSignOnPage = new MercuryToursSignOnPage(base.driver);
        assertThat(base.driver.getTitle(), is(equalTo("Flight Confirmation: Mercury Tours")));
    }

    @And("^select flight details as follows \"([^\"]*)\", \"([^\"]*)\" and \"([^\"]*)\"$")
    public void selectFlightDetailsAsFollowsAnd(String departFrom, String arriveIn, String airline) throws Throwable {
        MercuryToursSignOnPage mercuryToursSignOnPage = new MercuryToursSignOnPage(base.driver);
        mercuryToursSignOnPage.selectDeaparture(departFrom);
        mercuryToursSignOnPage.selectArrival(arriveIn);
        mercuryToursSignOnPage.selectAirline(airline);
    }

    @And("^I click on Logout button$")
    public void iClickOnLogoutButton() {
        MercuryToursSignOnPage mercuryToursSignOnPage = new MercuryToursSignOnPage(base.driver);
        mercuryToursSignOnPage.clickOnSignOffLink();
    }
}

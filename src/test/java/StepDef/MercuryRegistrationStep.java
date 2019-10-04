package StepDef;

import base.BaseUtil;
import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pages.MercuryToursRegisterConfirmationPage;
import pages.MercuryToursRegisterPage;
import pages.Utilities.Utility;
import sun.security.x509.RFC822Name;

import java.util.Random;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

public class MercuryRegistrationStep extends BaseUtil {
    private BaseUtil base;
    private static int fourNumbers;

    public MercuryRegistrationStep(BaseUtil base) {
        this.base = base;
    }
    @Given("^I am on the Mercury website$")
    public void i_am_on_the_Mercury_website() throws Throwable {
        base.driver.navigate().to("http://newtours.demoaut.com/");
    }

    @When("^I click on the Register button$")
    public void i_click_on_the_Register_button() throws Throwable {
        MercuryToursRegisterPage mercuryToursRegisterPage = new MercuryToursRegisterPage(base.driver);
        mercuryToursRegisterPage.clickOnRegisterLink();
    }

    //@When("^enter details as follows firstname as \"([^\"]*)\", lastname as \"([^\"]*)\", email as \"([^\"]*)\", username as \"([^\"]*)\" and password as \"([^\"]*)\"$")
    //@When("^enter details as follows firstname as \"([^\"]*)\", lastname as \"([^\"]*)\", email as \"([^\"]*)\", country as \"([^\"]*)\", username as \"([^\"]*)\" and password as \"([^\"]*)\"$")
    //@When("^enter details as follows firstname as \"([^\"]*)\", lastname as \"([^\"]*)\", phone as \"([^\"]*)\", email as \"([^\"]*)\", country as \"([^\"]*)\", username as \"([^\"]*)\" and password as \"([^\"]*)\"$")
    @When("^enter details as follows firstname as \"([^\"]*)\", lastname as \"([^\"]*)\", phone as \"([^\"]*)\", addressA as \"([^\"]*)\", addressB as \"([^\"]*)\", city as \"([^\"]*)\", postalcode as \"([^\"]*)\", email as \"([^\"]*)\", country as \"([^\"]*)\", username as \"([^\"]*)\" and password as \"([^\"]*)\"$")
    public void enter_details_as_follows_firstname_as_lastname_as_email_as_country_as_phone_as_addressA_as_addressB_as_city_as_postalcode_as_username_and_password_as(String fName, String lName, String phone, String address1, String address2, String city, String postalCode, String eMail, String country, String uName, String pWord) throws Throwable {
        MercuryToursRegisterPage mercuryToursRegisterPage = new MercuryToursRegisterPage(base.driver);
        mercuryToursRegisterPage.enterFirstName(fName);
        mercuryToursRegisterPage.enterLastName(lName);
        mercuryToursRegisterPage.enterPhone(phone);
        mercuryToursRegisterPage.enterAddress1(address1);
        mercuryToursRegisterPage.enterAddress2(address2);
        mercuryToursRegisterPage.enterCity(city);
        mercuryToursRegisterPage.enterPostcode(postalCode);
        mercuryToursRegisterPage.enterEmail(eMail);
        mercuryToursRegisterPage.selectCountry(country);
        mercuryToursRegisterPage.enterUsername(uName);
        mercuryToursRegisterPage.enterPassword(pWord);
        mercuryToursRegisterPage.confirmPassword(pWord);
    }

    @When("^click Submit$")
    public void click_Submit() throws Throwable {
        MercuryToursRegisterPage mercuryToursRegisterPage = new MercuryToursRegisterPage(base.driver);
        mercuryToursRegisterPage.clickOnSubmitButton();
    }

    @Then("^\"([^\"]*)\", \"([^\"]*)\" and \"([^\"]*)\" are displayed$")
    public void and_are_displayed(String fName, String lName, String userName) throws Throwable {
        MercuryToursRegisterConfirmationPage mercuryToursRegisterConfirmationPage = new MercuryToursRegisterConfirmationPage(base.driver);
        assertThat(mercuryToursRegisterConfirmationPage.getDearTexts(), is (equalTo("Dear " + fName + " " + lName + ",")));
        assertThat(mercuryToursRegisterConfirmationPage.getNoteTexts(), is (equalTo("Note: Your user name is " + Utility.getRandomAmount()+userName + ".")));
        assertThat(mercuryToursRegisterConfirmationPage.getUsingTexts(),is (equalTo("Thank you for registering. You may now sign-in using the user name and password you've just entered.")));
    }

    //@And("^enter details as follows \"([^\"]*)\", \"([^\"]*)\", \"([^\"]*)\", \"([^\"]*)\" and \"([^\"]*)\"$")
    @And("^enter details as follows \"([^\"]*)\", \"([^\"]*)\", \"([^\"]*)\", \"([^\"]*)\", \"([^\"]*)\" and \"([^\"]*)\"$")
    //@And("^enter details as follows firstname as \"([^\"]*)\", lastname as \"([^\"]*)\", phone as \"([^\"]*)\", email as \"([^\"]*)\", country as \"([^\"]*)\", username as \"([^\"]*)\" and password as \"([^\"]*)\"$")
    public void enterDetailsAsFollowsAnd(String fName, String lName, String emailAddress, String country, String userName, String pWord) throws Throwable {
        MercuryToursRegisterPage mercuryToursRegisterPage = new MercuryToursRegisterPage(base.driver);
        Utility.setRandomAmount(String.valueOf(getRandomNumbers()));
        mercuryToursRegisterPage.enterFirstName(fName);
        mercuryToursRegisterPage.enterLastName(lName);
        mercuryToursRegisterPage.enterEmail(Utility.getRandomAmount() + emailAddress);
        mercuryToursRegisterPage.selectCountry(country);
        mercuryToursRegisterPage.enterUsername(Utility.getRandomAmount() + userName);
        mercuryToursRegisterPage.enterPassword(pWord);
    }

    private int getRandomNumbers() {
        Random rand = new Random();
        int ran_integer = rand.nextInt(9999);
        fourNumbers = ran_integer;
        return ran_integer;
    }
}

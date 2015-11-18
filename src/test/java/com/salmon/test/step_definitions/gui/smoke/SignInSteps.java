package com.salmon.test.step_definitions.gui.smoke;

import com.salmon.test.page_objects.SignInPage;
import cucumber.api.java.en.And;
import cucumber.api.java.en.When;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

/**
 * Created by tfasoyiro on 24/06/2015.
 */
public class SignInSteps {

    private SignInPage signInPage;  // create an object from POM class

    // Constructor with variable from POM class(imported) object
    // Constructor is using variables from imported class
    public SignInSteps(SignInPage signInPage){
        this.signInPage = signInPage;
    }

    @When("^i fill in registered customers logon fields$")
    public void i_fill_in_registered_customers_logon_fields() throws Throwable {
        signInPage.emailAddressLogon().sendKeys("tfasoyiro@salmon.com");
        signInPage.passwordLogon().sendKeys("salmon01");
            }

    @When("^i click \"([^\"]*)\" button$")
    public void i_click_button() throws Throwable {
            signInPage.clickSignInButton();
        }

    @When("^i click Selfridges SIGN_IN button$")
    public void i_click_Selfridges_SIGN_IN_button() throws Throwable {
        signInPage.clickSignInButton();
    }

    @When("^User Complete Registration$")
    public void User_Complete_Registration() throws Throwable {
      //  assertEquals(signInPage.getCurrentPageTitle(),signInPage.stringSignInPageTitle());
        //signInPage.clickSignInLink(); //work around due to Firefox Account Head Defect

        signInPage.clickCreateAnAccountButton();
        signInPage.selectTitle();
        signInPage.fillFirstName();
        signInPage.fillLastName();
        signInPage.fillEmailAddress();
        signInPage.fillConfirmPassword();
        signInPage.fillPassword();
        signInPage.clickCreateAnAccountButton();
    }

    @And("^User Enter title \"([^\"]*)\" firstname \"([^\"]*)\" lastname \"([^\"]*)\" emailaddress \"([^\"]*)\" password \"([^\"]*)\"$")
    public void User_Enter_title_firstname_lastname_emailaddress_password(String title, String firstname, String lastname, String emailaddress, String password) throws Throwable {
        //assertEquals(signInPage.getCurrentPageTitle(),signInPage.stringSignInPageTitle());
        signInPage.clickCreateAnAccountButton();
        signInPage.titleText().sendKeys(title);
        signInPage.firstNameText().sendKeys(firstname);
        signInPage.lastNameText().sendKeys(lastname);
        signInPage.emailAddressText().sendKeys(emailaddress);
        signInPage.passwordText().sendKeys(password);
        signInPage.confirmPasswordText().sendKeys(password);
        signInPage.clickCreateAnAccountButton();
    }

    @And("^User Enters Username and Password$")
    public void User_Enters_Username_and_Password() throws Throwable {
        assertTrue(signInPage.getCurrentPageTitle().contains("Selfridges"));
        signInPage.visibleAvatar();
       // signInPage.clickSignInLink(); //work around due to Firefox Account Head Defect
        signInPage.emailAddressLogon().sendKeys("master1001@salmon.com");
        signInPage.passwordLogon().sendKeys("salmon01");
        signInPage.clickSignInButton();
    }

    @And("^PreviousEnter emailaddress \"([^\"]*)\" and password \"([^\"]*)\"$")
    public void Enter_emailaddress_and_password(String emailaddress, String password) throws Throwable {
        signInPage.emailAddressLogon().sendKeys(emailaddress);
        signInPage.passwordLogon().sendKeys(password);
        signInPage.clickSignInButton();
    }
}

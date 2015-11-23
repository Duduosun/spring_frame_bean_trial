package com.salmon.test.step_definitions.gui.smoke;

import com.salmon.test.page_objects.CustomerLoginPage;
import com.salmon.test.page_objects.NewCustomerPage;
import com.salmon.test.page_objects.SignInPage;
import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.When;
import org.openqa.selenium.Keys;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

/**
 * Created by tfasoyiro on 24/06/2015.
 */
public class NewCustomerSteps {

    private NewCustomerPage newCustomerPage;
    private CustomerLoginPage customerLoginPage;
    private SignInPage signInPage;  // create an object from POM class


    // Constructor with variable from POM class(imported) object
    // Constructor is using variables from imported class
    public NewCustomerSteps(NewCustomerPage newCustomerPage, CustomerLoginPage customerLoginPage, SignInPage signInPage){
        this.newCustomerPage = newCustomerPage;
        this.customerLoginPage = customerLoginPage;
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

        customerLoginPage.clickCreateAnAccount();
        signInPage.selectTitle();
        signInPage.fillFirstName();
        signInPage.fillLastName();
        signInPage.fillEmailAddress();
        signInPage.fillConfirmPassword();
        signInPage.fillPassword();
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

    @And("^User Enter title \"([^\"]*)\" firstname \"([^\"]*)\" lastname \"([^\"]*)\" emailaddress \"([^\"]*)\" password \"([^\"]*)\" mobile \"([^\"]*)\"$")
    public void User_Enter_title_firstname_lastname_emailaddress_password_mobile(String title, String firstname, String lastname, String emailaddress, String password, String mobile) throws Throwable {
        customerLoginPage.clickCreateAnAccount();
        newCustomerPage.titleText().sendKeys(title);
        newCustomerPage.firstNameText().sendKeys(firstname);
        newCustomerPage.lastNameText().sendKeys(lastname);
        newCustomerPage.emailAddressText().sendKeys(emailaddress);
        newCustomerPage.mobileText().sendKeys(mobile);
        newCustomerPage.passwordText().sendKeys(password);
        newCustomerPage.confirmPasswordText().sendKeys(password);
        newCustomerPage.preferredStoreText().sendKeys(Keys.ARROW_DOWN);
        newCustomerPage.acceptNewsletter(true);
        newCustomerPage.registerNewCustomer();


    }
}

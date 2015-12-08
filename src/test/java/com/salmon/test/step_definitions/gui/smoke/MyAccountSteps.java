package com.salmon.test.step_definitions.gui.smoke;

import com.salmon.test.page_objects.CustomerLoginPage;
import com.salmon.test.page_objects.MyAccountPage;
import com.salmon.test.page_objects.HabitatCommonPage;
import com.salmon.test.page_objects.NewCustomerPage;
import com.salmon.test.models.TestDataConstant;

import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

import static org.testng.Assert.*;

/**
 * Created by tfasoyiro on 24/06/2015.
 */
public class MyAccountSteps {

    private MyAccountPage myAccountPage; //MINE
    private HabitatCommonPage habitatCommonPage;
    private NewCustomerPage newCustomerPage;
    private TestDataConstant testDataConstant;

    public MyAccountSteps(MyAccountPage myAccountPage, HabitatCommonPage habitatCommonPage, NewCustomerPage newCustomerPage, TestDataConstant testDataConstant){ //INCOMING
        this.myAccountPage = myAccountPage; //this tells compiler to reference INCOMING and not MINE
        this.habitatCommonPage = habitatCommonPage;
        this.newCustomerPage = newCustomerPage;
        this.testDataConstant = testDataConstant;
    }

    @Then("^My Account Page$")
    public void My_Account_Page() throws Throwable {
        habitatCommonPage.defaultAvatar();
        assertEquals(myAccountPage.getCurrentPageTitle(), myAccountPage.stringMyAccountPageTitle());
        habitatCommonPage.defaultAvatar();
    }

    @Then("^User Successfully Access My Account$")
    public void User_Successfully_Access_My_Account() throws Throwable {
        habitatCommonPage.registeredUserSession();
        assertEquals(myAccountPage.getCurrentPageTitle(), myAccountPage.stringMyAccountPageTitle());
        assertTrue(habitatCommonPage.visibleRegisteredUser(), "True");
        assertFalse(habitatCommonPage.visibleGuestUser(), "False");
    }

    @When("^User Click Sign Out Option$")
    public void User_Click_Sign_Out_Option() throws Throwable {
        habitatCommonPage.registeredUserSession();
        habitatCommonPage.mouseOverRegUser();
        habitatCommonPage.clickSignOut();
        habitatCommonPage.guestUserSession();
        habitatCommonPage.defaultAvatar();
        habitatCommonPage.deleteFirefoxCookies();
    }

    @And("^More Users are Registered$")
    public void More_Users_are_Registered() throws Throwable {

    }

    @And("^User Session \"([^\"]*)\" is active$")
    public void User_Session_is_active(String firstname) throws Throwable {
        String $firstname = firstname.toUpperCase();
        assertTrue(habitatCommonPage.stringRegisteredUser().contains($firstname));
        habitatCommonPage.registeredUserSession();
        assertTrue(habitatCommonPage.visibleRegisteredUser(), "True");
        assertFalse(habitatCommonPage.visibleGuestUser(), "False");
        assertTrue(myAccountPage.stringUserDashboard().contains(firstname));
        habitatCommonPage.clickLogo();
        myAccountPage.deleteFirefoxCookies();
    }

    @Then("^User \"([^\"]*)\" Successfully Access My Account$")
    public void User_Successfully_Access_My_Account(String user) throws Throwable {
        habitatCommonPage.registeredUserSession();
        myAccountPage.myAccountPageCheck("accountDashboard");
        assertEquals(myAccountPage.getCurrentPageTitle(), myAccountPage.stringMyAccountPageTitle());
        assertTrue(habitatCommonPage.visibleRegisteredUser(), "True");
        assertFalse(habitatCommonPage.visibleGuestUser(), "False");
        assertTrue(myAccountPage.stringUserDashboard().contains(user));
        //habitatCommonPage.clickLogo();
    }

    @When("^User Click Account Information$")
    public void User_Click_Account_Information() throws Throwable {
        myAccountPage.clickMyAccount("accountInformation");
        assertEquals(myAccountPage.getCurrentPageTitle(), testDataConstant.accountInformationSENTENCE);
        assertNotSame(myAccountPage.getCurrentPageTitle(), testDataConstant.myAccountPageTitle);
        assertNotSame(myAccountPage.getCurrentPageTitle(), myAccountPage.stringMyAccountPageTitle());
        assertTrue(myAccountPage.stringMyAccountInformation().contains(testDataConstant.editInformationCAPS));
        assertTrue(myAccountPage.stringMyAccountRHS().contains(testDataConstant.accountInformationCAPS));
        assertTrue(myAccountPage.stringMyAccountRHS().contains(testDataConstant.editInformationCAPS));
        assertTrue(myAccountPage.stringMyAccountRHS().contains(testDataConstant.signUpMarketing));
        //assertTrue(myAccountPage.webElementMyAccountRHS().getCssValue(".button").contains("Save"));
    }

    @Then("^User Can Edit Account Fields title \"([^\"]*)\" firstname \"([^\"]*)\" lastname \"([^\"]*)\" mobile \"([^\"]*)\"$")
    public void User_Can_Edit_Account_Fields_title_firstname_lastname_mobile(String title, String firstname, String lastname, String mobile) throws Throwable {
        newCustomerPage.titleText().sendKeys(title); //Customer Registration Functions reused for Edit Customer Information
        newCustomerPage.firstNameText().clear();
        newCustomerPage.firstNameText().sendKeys(firstname);
        newCustomerPage.lastNameText().clear();
        newCustomerPage.lastNameText().sendKeys(lastname);
        newCustomerPage.mobileText().clear();
        newCustomerPage.mobileText().sendKeys(mobile);
        newCustomerPage.registerNewCustomer();
        myAccountPage.myAccountPageCheck("accountDashboard");
        assertNotSame(myAccountPage.getCurrentPageTitle(), testDataConstant.accountInformationSENTENCE);
        assertEquals(myAccountPage.getCurrentPageTitle(), testDataConstant.myAccountPageTitle);
        assertEquals(myAccountPage.getCurrentPageTitle(), myAccountPage.stringMyAccountPageTitle());
        assertTrue(myAccountPage.stringMyAccountRHS().contains(testDataConstant.accountInformationSaved));
    }

    @Then("^User Successfully Change Current Password \"([^\"]*)\" to New Password \"([^\"]*)\"$")
    public void User_Successfully_Change_Current_Password_to_New_Password(String currentpw, String newpw) throws Throwable {
        myAccountPage.clickChangePassword();
        assertTrue(myAccountPage.stringMyAccountRHS().contains(testDataConstant.changePasswordCAPS));
        myAccountPage.changeUserPassword(currentpw, newpw);
        newCustomerPage.registerNewCustomer();
        myAccountPage.myAccountPageCheck("accountDashboard");
        assertTrue(myAccountPage.stringMyAccountRHS().contains(testDataConstant.accountInformationSaved));

        //recovery scenario
        myAccountPage.clickMyAccount("accountInformation");
        myAccountPage.clickChangePassword();
        myAccountPage.changeUserPassword(newpw, currentpw);
        newCustomerPage.registerNewCustomer();
        myAccountPage.myAccountPageCheck("accountDashboard");
        assertTrue(myAccountPage.stringMyAccountRHS().contains(testDataConstant.accountInformationSaved));
    }

    @And("^User \"([^\"]*)\" Can View Defaults on Account Dashboard \"([^\"]*)\"$")
    public void User_Can_View_Defaults_on_Account_Dashboard(String fullname, String emailaddress) throws Throwable {
        assertTrue(myAccountPage.stringMyAccountRHS().contains(testDataConstant.myDashboardCAPS));
        assertTrue(myAccountPage.stringUserDashboard().contains(fullname));
        assertTrue(myAccountPage.stringMyAccountRHS().contains(testDataConstant.myDashboardSENTENCE));
        assertTrue(myAccountPage.stringMyAccountRHS().contains(testDataConstant.accountInformationCAPS));
        assertTrue(myAccountPage.webElementContactInformation().isDisplayed());
        assertTrue(myAccountPage.webElementContactInformation().getText().contains(fullname));
        assertTrue(myAccountPage.webElementContactInformation().getText().contains(emailaddress));
        assertTrue(myAccountPage.stringMyAccountRHS().contains(testDataConstant.addressBookCAPS));
        assertTrue(myAccountPage.webElementManageAddresses().isDisplayed());
        assertTrue(myAccountPage.stringMyAccountRHS().contains(testDataConstant.defaultBillingAddressCAPS));
        assertTrue(myAccountPage.stringMyAccountRHS().contains(testDataConstant.defaultShippingAddressCAPS));
        assertTrue(myAccountPage.stringMyAccountRHS().contains(testDataConstant.noDefaultAddressSENTENCE + testDataConstant.defaultBillingAddressCAPS.toLowerCase()));
        assertTrue(myAccountPage.stringMyAccountRHS().contains(testDataConstant.noDefaultAddressSENTENCE + testDataConstant.defaultShippingAddressCAPS.toLowerCase()));


    }

    @When("^User Click Address Book$")
    public void User_Click_Address_Book() throws Throwable {

    }
}

package com.salmon.test.step_definitions.gui.smoke;

import com.salmon.test.page_objects.MyAccountPage;
import com.salmon.test.page_objects.HabitatCommonPage;
import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertFalse;
import static org.testng.Assert.assertTrue;

/**
 * Created by tfasoyiro on 24/06/2015.
 */
public class MyAccountSteps {

    private MyAccountPage myAccountPage; //MINE
    private HabitatCommonPage habitatCommonPage;

    public MyAccountSteps(MyAccountPage myAccountPage, HabitatCommonPage habitatCommonPage){ //INCOMING
        this.myAccountPage = myAccountPage; //this tells compiler to reference INCOMING and not MINE
        this.habitatCommonPage = habitatCommonPage;
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
        assertTrue(habitatCommonPage.visibleGuestUser(), "False");
        habitatCommonPage.clickLogo();
        //assertEquals(habitatCommonPage.getCurrentPageTitle(), habitatCommonPage.stringHomePageTitle() );

    }

    @When("^User Click Sign Out Option$")
    public void User_Click_Sign_Out_Option() throws Throwable {
        //assertEquals(myAccountPage.getCurrentPageTitle(),myAccountPage.stringMyDetailsPageTitle());
        //assertEquals(habitatCommonPage.getCurrentPageTitle(), habitatCommonPage.stringHomePageTitle());
        habitatCommonPage.registeredUserSession();
        habitatCommonPage.clickSignOut();
        //habitatCommonPage.wait(10);
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
        assertEquals(habitatCommonPage.stringRegisteredUser(), $firstname);
        myAccountPage.deleteFirefoxCookies();
    }

    @Then("^User \"([^\"]*)\" Successfully Access My Account$")
    public void User_Successfully_Access_My_Account(String user) throws Throwable {
        habitatCommonPage.registeredUserSession();
        assertEquals(myAccountPage.getCurrentPageTitle(), myAccountPage.stringMyAccountPageTitle());
        assertTrue(habitatCommonPage.visibleRegisteredUser(), "True");
        assertFalse(habitatCommonPage.visibleGuestUser(), "False");
        assertTrue(myAccountPage.stringUserDashboard().contains(user));
        habitatCommonPage.clickLogo();
    }
}

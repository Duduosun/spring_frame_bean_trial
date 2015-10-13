package com.salmon.test.step_definitions.gui.smoke;

import com.salmon.test.page_objects.MyDetailsPage;
import com.salmon.test.page_objects.SelfridgesCommonPage;
import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

/**
 * Created by tfasoyiro on 24/06/2015.
 */
public class MyDetailsSteps {

    private MyDetailsPage myDetailsPage; //MINE
    private SelfridgesCommonPage selfridgesCommonPage;

    public MyDetailsSteps(MyDetailsPage myDetailsPage, SelfridgesCommonPage selfridgesCommonPage){ //INCOMING
        this.myDetailsPage = myDetailsPage; //this tells compiler to reference INCOMING and not MINE
        this.selfridgesCommonPage = selfridgesCommonPage;
    }

    @Then("^My Details Page$")
    public void My_Details_Page() throws Throwable {
        myDetailsPage.visibleAvatar();
        assertEquals(myDetailsPage.getCurrentPageTitle(), myDetailsPage.stringMyDetailsPageTitle());
        myDetailsPage.clickAccountHead();
    }

    @Then("^User Successfully Access My Account$")
    public void User_Successfully_Access_My_Account() throws Throwable {
        myDetailsPage.visibleAvatar();
        assertEquals(myDetailsPage.getCurrentPageTitle(), myDetailsPage.stringMyDetailsPageTitle());
        selfridgesCommonPage.clickLogo();
        assertEquals(selfridgesCommonPage.getCurrentPageTitle(), selfridgesCommonPage.stringHomePageTitle() );

    }

    @When("^User Click Sign Out Option$")
    public void User_Click_Sign_Out_Option() throws Throwable {
        //assertEquals(myDetailsPage.getCurrentPageTitle(),myDetailsPage.stringMyDetailsPageTitle());
        assertEquals(selfridgesCommonPage.getCurrentPageTitle(), selfridgesCommonPage.stringHomePageTitle());
        myDetailsPage.visibleAvatar();
        myDetailsPage.clickAccountHead();
        myDetailsPage.clickSignOutButton();
        myDetailsPage.deleteFirefoxCookies();
    }

    @And("^More Users are Registered$")
    public void More_Users_are_Registered() throws Throwable {

    }

    @And("^User Session \"([^\"]*)\" is active$")
    public void User_Session_is_active(String firstname) throws Throwable {
        String $firstname = firstname.toUpperCase();
        assertTrue(selfridgesCommonPage.stringRegisteredUser().contains($firstname));
        assertEquals(selfridgesCommonPage.stringRegisteredUser(), $firstname);
        myDetailsPage.deleteFirefoxCookies();
    }
}

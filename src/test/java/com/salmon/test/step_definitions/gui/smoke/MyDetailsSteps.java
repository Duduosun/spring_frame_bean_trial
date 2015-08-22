package com.salmon.test.step_definitions.gui.smoke;

import com.salmon.test.page_objects.MyDetailsPage;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

import static org.testng.Assert.assertEquals;

/**
 * Created by tfasoyiro on 24/06/2015.
 */
public class MyDetailsSteps {

    private MyDetailsPage myDetailsPage; //MINE

    public MyDetailsSteps(MyDetailsPage myDetailsPage){ //INCOMING
        this.myDetailsPage = myDetailsPage; //this tells compiler to reference INCOMING and not MINE
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
        assertEquals(myDetailsPage.getCurrentPageTitle(),myDetailsPage.stringMyDetailsPageTitle());
        //myDetailsPage.deleteFirefoxCookies();
    }

    @When("^User Click Sign Out Option$")
    public void User_Click_Sign_Out_Option() throws Throwable {
        assertEquals(myDetailsPage.getCurrentPageTitle(),myDetailsPage.stringMyDetailsPageTitle());
        myDetailsPage.visibleAvatar();
        myDetailsPage.clickAccountHead();
        myDetailsPage.clickSignOutButton();
        //place a wait method here
        myDetailsPage.deleteFirefoxCookies();
    }
}

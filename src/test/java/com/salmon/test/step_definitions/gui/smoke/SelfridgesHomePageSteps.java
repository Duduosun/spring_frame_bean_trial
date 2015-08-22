package com.salmon.test.step_definitions.gui.smoke;


import com.salmon.test.page_objects.SelfridgesHomePage;
import com.salmon.test.page_objects.SignInPage;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

public class SelfridgesHomePageSteps {

    private SelfridgesHomePage selfridgesHomePage;
    private SignInPage signInPage;

    public SelfridgesHomePageSteps(SelfridgesHomePage selfridgesHomePage, SignInPage signInPage) {
        this.selfridgesHomePage = selfridgesHomePage;
        this.signInPage = signInPage;
    }


    @Given("^i click \"(.*?)\" on the Home Page$")
    public void i_click_on_the_Home_Page(String pageToNavigate) throws Throwable {
        if (pageToNavigate.equals("SIGN_IN")) {
            selfridgesHomePage.clickSignInLink();
        } else if (pageToNavigate.equals("SIGN_OUT")) {
            selfridgesHomePage.clickSignOutLink();
        }
    }

    @And("^i click Selfridges \"([^\"]*)\" on the Home page$")
    public void i_click_Selfridges_on_the_Home_page(String pageToNavigate) throws Throwable {

        if (pageToNavigate.equals("ACCOUNT_HEAD")) {
            selfridgesHomePage.clickAccountHead();
        }
    }

    @And("^i click Selfridges ACCOUNT_HEAD on the Home page$")
    public void i_click_Selfridges_ACCOUNT_HEAD_on_the_Home_page() throws Throwable {
        selfridgesHomePage.clickAccountHead();
    }



    @When("^User Click Account Head$")
    public void User_Click_Account_Head() throws Throwable {
        assertEquals(selfridgesHomePage.getCurrentPageTitle(), selfridgesHomePage.stringHomePageTitle());
        selfridgesHomePage.visibleAvatar();
        selfridgesHomePage.clickAccountHead();
        assertEquals(signInPage.getCurrentPageTitle(),signInPage.stringSignInPageTitle());
        signInPage.visibleAvatar();
    }

    @Then("^User is Successfuly Signed Out of My Account$")
    public void User_is_Successfuly_Signed_Out_of_My_Account() throws Throwable {
        selfridgesHomePage.visibleAvatar();
        //place a wait method here
        //click Selfridges logo temporarily
        selfridgesHomePage.clickLogo();
        assertEquals(selfridgesHomePage.getCurrentPageTitle(), selfridgesHomePage.stringHomePageTitle());
    }

    @When("^User Navigates Home Page$")
    public void User_Navigates_Home_Page() throws Throwable {
        selfridgesHomePage.clickLogo();
        selfridgesHomePage.visibleAvatar();
    }

    @Then("^User Can Interact with UI$")
    public void User_Can_Interact_with_UI() throws Throwable {
        selfridgesHomePage.homePageHeader();
        selfridgesHomePage.visibleAvatar();
        selfridgesHomePage.homePageBody();
        selfridgesHomePage.homePageFooter();
        assertTrue(selfridgesHomePage.stringWelcome().equals("WELCOME"));
        assertTrue(selfridgesHomePage.stringTopCategory().contains("TECHNOLOGY"));
        assertTrue(selfridgesHomePage.stringTopCategory().contains("BEAUTY"));
        assertTrue(selfridgesHomePage.stringTopCategory().contains("KIDS"));
    }

    @Then("^User Can Interact with Header \"([^\"]*)\" and Footer \"([^\"]*)\" entries$")
    public void User_Can_Interact_with_Header_and_Footer_entries(String header, String footer) throws Throwable {
        selfridgesHomePage.homePageHeader();
        selfridgesHomePage.visibleAvatar();
        selfridgesHomePage.homePageBody();
        selfridgesHomePage.homePageFooter();
        assertTrue(selfridgesHomePage.stringWelcome().equals("WELCOME"));

        assertTrue(selfridgesHomePage.stringTopCategory().contains(header));
        assertTrue(selfridgesHomePage.stringFooter().contains(footer));


    }
}
package com.salmon.test.step_definitions.gui.smoke;


import com.salmon.test.page_objects.HabitatHomePage;
import com.salmon.test.page_objects.SignInPage;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

public class HabitatHomePageSteps {

    private HabitatHomePage habitatHomePage;
    private SignInPage signInPage;

    public HabitatHomePageSteps(HabitatHomePage habitatHomePage, SignInPage signInPage) {
        this.habitatHomePage = habitatHomePage;
        this.signInPage = signInPage;
    }

    @When("^User Click Account Head$")
    public void User_Click_Account_Head() throws Throwable {
        assertEquals(habitatHomePage.getCurrentPageTitle(), habitatHomePage.stringHomePageTitle());
        //habitatHomePage.dialogBoxHandler();
        habitatHomePage.visibleAvatar();
        habitatHomePage.clickAccountHead();
        assertEquals(signInPage.getCurrentPageTitle(),signInPage.stringSignInPageTitle());
        //signInPage.visibleAvatar();
    }

    @Then("^User is Successfuly Signed Out of My Account$")
    public void User_is_Successfuly_Signed_Out_of_My_Account() throws Throwable {
        // place Common Page Assertion here
        habitatHomePage.clickLogo();
        assertEquals(habitatHomePage.getCurrentPageTitle(), habitatHomePage.stringHomePageTitle());
    }

    @When("^User Navigates Home Page$")
    public void User_Navigates_Home_Page() throws Throwable {
        habitatHomePage.clickLogo();
        habitatHomePage.visibleAvatar();
    }

    @Then("^User Can Interact with UI$")
    public void User_Can_Interact_with_UI() throws Throwable {

        habitatHomePage.visibleAvatar();

        //assertTrue(habitatHomePage.stringWelcome().equals("WELCOME"));
        //assertTrue(habitatHomePage.stringTopCategory().contains("TECHNOLOGY"));
        //assertTrue(habitatHomePage.stringTopCategory().contains("BEAUTY"));
        //assertTrue(habitatHomePage.stringTopCategory().contains("KIDS"));
    }

    @Then("^User Can Interact with Header \"([^\"]*)\" and Footer \"([^\"]*)\" entries$")
    public void User_Can_Interact_with_Header_and_Footer_entries(String header, String footer) throws Throwable {

        habitatHomePage.visibleAvatar();
;
        //assertTrue(habitatHomePage.stringWelcome().equals("WELCOME"));
        //assertTrue(habitatHomePage.stringTopCategory().contains(header));
        //assertTrue(habitatHomePage.stringFooter().contains(footer));
    }

    @When("^User Click Country Tab$")
    public void User_Click_Country_Tab() throws Throwable {
        //habitatHomePage.clickCurrency();
    }

    @Then("^Shopping Location is Switched to Selected \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\"$")
    public void Shopping_Location_is_Switched_to_Selected(String countrycode, String currency, String url) throws Throwable {
        habitatHomePage.visibleAvatar();

        assertTrue(habitatHomePage.checkPageUrlContains(url));
        assertEquals(habitatHomePage.getCurrentUrl(), url);
    }

    @When("^User Search Selfridges \"([^\"]*)\"$")
    public void User_Search_Selfridges(String search) throws Throwable {
        //habitatHomePage.clickSearch();
        //habitatHomePage.searchString(search);
    }
}
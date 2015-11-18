package com.salmon.test.step_definitions.gui.smoke;


import com.salmon.test.page_objects.HabitatHomePage;
import com.salmon.test.page_objects.LocationSelectPage;
import com.salmon.test.page_objects.HabitatCommonPage;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import org.testng.Assert;

import static com.thoughtworks.selenium.SeleneseTestBase.assertTrue;
import static com.thoughtworks.selenium.SeleneseTestNgHelper.assertEquals;

/**
 * Created by tfasoyiro on 20/09/2015.
 */
public class LocationSelectSteps {
    private LocationSelectPage locationSelectPage;
    private HabitatCommonPage habitatCommonPage;
    private HabitatHomePage habitatHomePage;

    public LocationSelectSteps(LocationSelectPage locationSelectPage, HabitatCommonPage habitatCommonPage,
                               HabitatHomePage habitatHomePage){
        this.locationSelectPage = locationSelectPage;
        this.habitatCommonPage = habitatCommonPage;
        this.habitatHomePage = habitatHomePage;
    }

    @Then("^User is taken to Location Preference Module$")
    public void User_is_taken_to_Location_Preference_Module() throws Throwable {
        habitatCommonPage.defaultAvatar();
        locationSelectPage.vpCountrySelect();

        Assert.assertEquals(locationSelectPage.getCurrentPageTitle(), locationSelectPage.stringLocationPageTitle());
    }

    @And("^User Can Interact with Location Preference Module \"([^\"]*)\"$")
    public void User_Can_Interact_with_Location_Preference_Module(String module) throws Throwable {
        locationSelectPage.clickRegion(module);
    }

    @And("^User Can Interact with Location Preference Module \"([^\"]*)\" and \"([^\"]*)\"$")
    public void User_Can_Interact_with_Location_Preference_Module_and(String region, String regiontext) throws Throwable {
        locationSelectPage.clickRegion(region);
        assertEquals(locationSelectPage.returnRegion(region), regiontext);
        assertTrue(locationSelectPage.returnRegion(region).equals(regiontext));
    }

    @And("^User Can View Shopping Location \"([^\"]*)\" and \"([^\"]*)\"$")
    public void User_Can_View_Shopping_Location_and(String region, String country) throws Throwable {
        locationSelectPage.clickRegion(region);
        //assertEquals(locationSelectPage.returnCountry(region), country);
        assertTrue(locationSelectPage.returnCountry(region).contains(country));
    }

    @And("^User Enter \"([^\"]*)\"$")
    public void User_Enter(String country) throws Throwable {
        locationSelectPage.enterCountry(country);
        locationSelectPage.clickContinue();
    }

    @And("^User Click \"([^\"]*)\" and \"([^\"]*)\"$")
    public void User_Click_and(String region, String country) throws Throwable {
        locationSelectPage.clickRegion(region);
        locationSelectPage.clickCountry(country);
        locationSelectPage.clickContinue();
    }
}
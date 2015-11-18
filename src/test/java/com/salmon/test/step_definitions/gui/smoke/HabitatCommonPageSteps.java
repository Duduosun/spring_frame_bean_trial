package com.salmon.test.step_definitions.gui.smoke;


import com.salmon.test.page_objects.HabitatCommonPage;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

import static org.testng.Assert.assertTrue;

/**
 * Created by Tola on 17/08/2015
 */
public class HabitatCommonPageSteps {

    private HabitatCommonPage habitatCommonPage;

    public HabitatCommonPageSteps(HabitatCommonPage habitatCommonPage){
        this.habitatCommonPage = habitatCommonPage;
    }

    @When("^User Navigate Mega Menu \"([^\"]*)\"$")
    public void User_Navigate_Mega_Menu(String megamenu) throws Throwable {
        habitatCommonPage.clickMegaMenu(megamenu);
        habitatCommonPage.defaultAvatar();
    }

    @Then("^Search Result contains \"([^\"]*)\" and \"([^\"]*)\"$")
    public void Search_Result_contains_and(String word, String phrase) throws Throwable {
        habitatCommonPage.defaultAvatar();
        assertTrue(habitatCommonPage.returnPLPSearchResult().contains(word));
        assertTrue(habitatCommonPage.returnPLPSearchResult().contains(phrase));
    }
}

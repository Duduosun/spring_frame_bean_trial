package com.salmon.test.step_definitions.gui.smoke;


import com.salmon.test.page_objects.HabitatCommonPage;
import cucumber.api.PendingException;
import cucumber.api.java.en.And;
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

    @And("^Guest User Navigate Mega Menu \"([^\"]*)\"$")
    public void Guest_User_Navigate_Mega_Menu(String megamenu) throws Throwable {
        habitatCommonPage.pageHeaderCheck();
        habitatCommonPage.pageFooterCheck();
        habitatCommonPage.guestUserSession();
        habitatCommonPage.guestUserMouseOverCheck();
        habitatCommonPage.clickMegaMenu(megamenu);
        habitatCommonPage.defaultAvatar();
    }

    @Then("^Search Result contains \"([^\"]*)\" and \"([^\"]*)\"$")
    public void Search_Result_contains_and(String word, String phrase) throws Throwable {
        String homeLabel = "Home";
        String label = "Search results for";
        habitatCommonPage.defaultAvatar();
        assertTrue(habitatCommonPage.getCurrentPageTitle().contains(label));
        assertTrue(habitatCommonPage.returnPLPSearchResult().contains(word));
        assertTrue(habitatCommonPage.returnPLPSearchResult().contains(phrase));
        assertTrue(habitatCommonPage.stringBreadcrumbs().contains(label));
        assertTrue(habitatCommonPage.stringBreadcrumbs().contains(homeLabel));
    }

    @And("^Registered User Navigate Mega Menu \"([^\"]*)\"$")
    public void Registered_User_Navigate_Mega_Menu(String megamenu) throws Throwable {
        habitatCommonPage.pageHeaderCheck();
        habitatCommonPage.pageFooterCheck();
        habitatCommonPage.registeredUserSession();
        habitatCommonPage.regUserMouseOverCheck();
        habitatCommonPage.clickLogo();
        habitatCommonPage.clickMegaMenu(megamenu);
    }
}

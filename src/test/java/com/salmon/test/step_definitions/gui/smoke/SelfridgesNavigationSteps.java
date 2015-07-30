package com.salmon.test.step_definitions.gui.smoke;


import com.salmon.test.framework.helpers.UrlBuilder;
import com.salmon.test.page_objects.HomePage;
import cucumber.api.java.en.Given;

public class SelfridgesNavigationSteps {

    private HomePage homePage;

    @Given("^i navigate to the Lloydspharmacy \"(.*?)\" page$")
    public void i_navigate_to_the_Lloydspharmacy_page(String pageName) throws Throwable {

        if (pageName.equals("HOME")) {
            UrlBuilder.startAtHomePage();
        }
    }

    @Given("^i navigate to Selfridges \"([^\"]*)\" page$")
    public void i_navigate_to_Selfridges_page(String pageName) throws Throwable {

        if (pageName.equals("HOME")) {
            UrlBuilder.startAtHomePage();
        }
    }

    @Given("^Selfridges Home Page$")
    public void Selfridges_Home_Page() throws Throwable {

        UrlBuilder.startAtHomePage();
        //assertEquals(homePage.getCurrentPageTitle(),"Designer Fashion, Accessories & More - Shop Online at Selfridges");
        //assertTrue(homePage.getCurrentPageTitle().contains("Selfridges"));
        //homePage.visibleAvatar();
    }
}
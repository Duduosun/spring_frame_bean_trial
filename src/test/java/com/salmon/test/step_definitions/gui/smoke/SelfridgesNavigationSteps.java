package com.salmon.test.step_definitions.gui.smoke;


import com.salmon.test.framework.helpers.UrlBuilder;
import com.salmon.test.page_objects.SelfridgesHomePage;
import cucumber.api.java.en.Given;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

public class SelfridgesNavigationSteps {

    private SelfridgesHomePage selfridgesHomePage;

    @Given("^i navigate to Selfridges \"([^\"]*)\" page$")
    public void i_navigate_to_Selfridges_page(String pageName) throws Throwable {

        if (pageName.equals("HOME")) {
            UrlBuilder.startAtHomePage();
        }
    }

    @Given("^Selfridges Home Page$")
    public void Selfridges_Home_Page() throws Throwable {

        UrlBuilder.startAtHomePage();
        //assertEquals(selfridgesHomePage.getCurrentPageTitle(),"Designer Fashion, Accessories & More - Shop Online at Selfridges");
        //assertTrue(selfridgesHomePage.getCurrentPageTitle().contains("Selfridges"));
        //homePage.visibleAvatar();
    }
}
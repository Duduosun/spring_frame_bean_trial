package com.salmon.test.step_definitions.gui.smoke;


import com.salmon.test.framework.helpers.UrlBuilder;
import cucumber.api.java.en.Given;


public class SelfridgesNavigationSteps {

    // this is Navigation Class used to trigger entry into AUT
    @Given("^i navigate to Selfridges \"([^\"]*)\" page$")
    public void i_navigate_to_Selfridges_page(String pageName) throws Throwable {

        if (pageName.equals("HOME")) {
            UrlBuilder.startAtHomePage();
        }
    }

    @Given("^Selfridges Home Page$")
    public void Selfridges_Home_Page() throws Throwable {

        UrlBuilder.startAtHomePage();
    }
}
package com.salmon.test.step_definitions.gui.smoke;


import com.salmon.test.framework.helpers.UrlBuilder;
import cucumber.api.java.en.Given;
import org.springframework.test.context.ContextConfiguration;

@ContextConfiguration("classpath:cucumber.xml")
public class HabitatNavigationSteps {

    // this is Navigation Class used to trigger entry into AUT
    @Given("^Habitat Home Page$")
    public void Habitat_Home_Page() throws Throwable {
        UrlBuilder.startAtHomePage();
    }


    @Given("^AUDI Ecommerce Page$")
    public void AUDI_Ecommerce_Page() throws Throwable {
        UrlBuilder.startAtHomePage();
    }
}
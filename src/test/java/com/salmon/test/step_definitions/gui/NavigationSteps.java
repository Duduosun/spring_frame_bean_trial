package com.salmon.test.step_definitions.gui;


import com.salmon.test.framework.PageObject;
import com.salmon.test.framework.helpers.UrlBuilder;
import cucumber.api.java.en.Given;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;

public class NavigationSteps {


    @Given("^i navigate to the Lloydspharmacy \"(.*?)\" page$")
    public void i_navigate_to_the_Lloydspharmacy_page(String pageName) throws Throwable {


        if (pageName.equals("HOME")) {
            UrlBuilder.startAtHomePage();
        }
    }
}
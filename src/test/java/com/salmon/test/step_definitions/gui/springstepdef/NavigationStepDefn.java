package com.salmon.test.step_definitions.gui.springstepdef;

import com.salmon.test.page_objects.spring_pom.AudiEcomPage;
import com.salmon.test.page_objects.spring_pom.AudiProductPage;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;

import static org.testng.Assert.assertTrue;

/**
 * Created by tfasoyiro on 20/06/2016.
 */

@ContextConfiguration("classpath:cucumber.xml")
public class NavigationStepDefn {

    @Autowired
    private AudiEcomPage audiEcomPage;

    @Autowired
    private AudiProductPage audiProductPage;

    @When("^User Click Top Level \"([^\"]*)\" CTA$")
    public void User_Click_Top_Level_CTA(String tcat) throws Throwable {
        audiEcomPage.clickFirstCAT(tcat);
    }

    @And("^User Click Simple Product \"([^\"]*)\"$")
    public void User_Click_Simple_Product(String eproduct) throws Throwable {
        audiProductPage.clickOneOfManyProducts(eproduct);
    }

    @Then("^Audi PDP is Displayed with \"([^\"]*)\"$")
    public void Audi_PDP_is_Displayed_with(String eproduct) throws Throwable {
        audiProductPage.PDPView();
        assertTrue(audiProductPage.checkPageTitleContains(eproduct));
        assertTrue(audiProductPage.stringBreadcrumbs().contains(eproduct));
        assertTrue(audiProductPage.stringPageName().equals(eproduct));
    }
}

package com.salmon.test.step_definitions.gui.smoke;

import com.salmon.test.page_objects.ProductDetailsPage;
import com.salmon.test.page_objects.SelfridgesCommonPage;
import cucumber.api.PendingException;
import cucumber.api.java.en.Then;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

/**
 * Created by Tola on 17/08/2015
 */
public class ProductDetailsPageStep {

    private ProductDetailsPage productDetailsPage;
    private SelfridgesCommonPage selfridgesCommonPage;

    public ProductDetailsPageStep(ProductDetailsPage productDetailsPage, SelfridgesCommonPage selfridgesCommonPage){
        this.productDetailsPage = productDetailsPage;
        this.selfridgesCommonPage = selfridgesCommonPage;
    }

    @Then("^PDP Feature is displayed with Productname \"([^\"]*)\"$")
    public void PDP_Feature_is_displayed_with_Productname(String productname) throws Throwable {
        productDetailsPage.verifyPDP();
        selfridgesCommonPage.visibleAvatar();
        //assertTrue(productDetailsPage.getProductName().contains(productname));
        assertEquals(productDetailsPage.getProductName(),productname);
    }

    @Then("^Bundle Feature is displayed with Bundle X \"([^\"]*)\" and Bundle Y \"([^\"]*)\"$")
    public void Bundle_Feature_is_displayed_with_Bundle_X_and_Bundle_Y(String bundlex, String bundley) throws Throwable {
        productDetailsPage.verifyBundle();
        selfridgesCommonPage.visibleAvatar();
        assertEquals(productDetailsPage.getBundleNameX(),bundlex);
        assertEquals(productDetailsPage.getBundleNameY(), bundley);
    }
}
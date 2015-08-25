package com.salmon.test.step_definitions.gui.smoke;

import com.salmon.test.page_objects.ProductDetailsPage;
import com.salmon.test.page_objects.SelfridgesCommonPage;
import cucumber.api.PendingException;
import cucumber.api.java.en.Then;

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
        productDetailsPage.verifyProductName(productname);
        //assertTrue(productDetailsPage.verifyProductName().contains(productname));



    }
}
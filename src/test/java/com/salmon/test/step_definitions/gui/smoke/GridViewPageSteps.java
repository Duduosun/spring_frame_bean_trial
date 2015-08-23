package com.salmon.test.step_definitions.gui.smoke;

import cucumber.api.PendingException;
import cucumber.api.java.en.And;

import com.salmon.test.page_objects.GridViewPage;
/**
 * Created by Tola on 17/08/2015
 */
public class GridViewPageSteps {

    private GridViewPage gridViewPage;

    public GridViewPageSteps(GridViewPage gridViewPage){
        this.gridViewPage = gridViewPage;
    }

    @And("^User Click Product \"([^\"]*)\"$")
    public void User_Click_Product(String product) throws Throwable {
        gridViewPage.clickProduct(product);
    }
}



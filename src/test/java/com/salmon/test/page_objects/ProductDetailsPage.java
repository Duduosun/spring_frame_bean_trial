package com.salmon.test.page_objects;

import com.salmon.test.framework.PageObject;
import org.openqa.selenium.By;

/**
 * Created by Tola on 17/08/2015
 */
public class ProductDetailsPage extends PageObject {

    private String pdpTitle = "| Selfridges.com";
    private By pdpBody = By.id("pdp");

    private By cBreadCrumb = By.className("breadcrumb");
    private By xProductName = By.xpath(".//*[@id='masterContent']/div/aside[2]/div/p/a");
    private By xProductDescription = By.xpath(".//*[@id='masterContent']/div/aside[2]/div");
    private By addToBag = By.name("addToBagButton");
    private By xProductImage = By.xpath(".//*[@id='masterContent']/div/div[1]/div/img");
    private By addToWishList = By.className("addToWishlist");
    private By cPlus = By.className("plus");
    private By cMinus = By.className("minus");
    private By cMinusDisabled = By.className("minus disabled");


    public void verifyPDP(){
        waitForExpectedElement(pdpBody);
    }

    public void verifyProductName(String productname){
        productname = waitForExpectedElement(xProductName).getText();
    }
}
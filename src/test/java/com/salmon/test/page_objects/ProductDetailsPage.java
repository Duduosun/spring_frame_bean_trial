package com.salmon.test.page_objects;

import com.salmon.test.framework.PageObject;
import org.openqa.selenium.By;

/**
 * Created by Tola on 17/08/2015
 */
public class ProductDetailsPage extends PageObject {

    private String pdpTitle = "| Selfridges.com";
    private By pdpBody = By.id("pdp");

    private By breadCrumb = By.id("breadcrumb");
    private By xProductName = By.xpath(".//*[@id='masterContent']/div/aside[2]/div/p/a");
    private By xProductDescription = By.xpath(".//*[@id='masterContent']/div/aside[2]/div");
    private By addToBag = By.name("addToBagButton");
    private By xProductImage = By.xpath(".//*[@id='masterContent']/div/div[1]/div/img");
    private By addToWishList = By.className("addToWishlist");
    private By xMinus = By.xpath(".//*[@id='masterContent']/div/aside[2]/div/div[3]/form/fieldset/div[1]/span[1]");
    private By xPlus = By.xpath(".//*[@id='masterContent']/div/aside[2]/div/div[3]/form/fieldset/div[1]/span[2]");
    private By cMinusDisabled = By.className("minus disabled");

    //Bundle Specific
    private By xBundleName = By.xpath(".//*[@id='main']/div[1]/aside[2]/div/p[1]/a");
    private By xBundleImage = By.xpath(".//*[@id='main']/div[1]/div[1]/div/img");
    private By bundleNameX = By.xpath(".//*[@id='main']/div[2]/div[1]/div/div/p[1]/a");
    private By bundleNameY = By.xpath(".//*[@id='main']/div[2]/div[2]/div/div/p[1]/a");
    private By bundleDescriptionX = By.xpath(".//*[@id='main']/div[2]/div[1]");
    private By bundleDescriptionY = By.xpath(".//*[@id='main']/div[2]/div[2]");
    private By bundleToBagX = By.xpath(".//*[@id='main']/div[2]/div[1]/div/div/div[2]/button");
    private By bundleToBagY = By.xpath(".//*[@id='main']/div[2]/div[2]/div/div/div[2]/button");
    private By xMinusX = By.xpath(".//*[@id='main']/div[2]/div[1]/div/div/fieldset[1]/div[1]/span[1]");
    private By xPlusX = By.xpath(".//*[@id='main']/div[2]/div[1]/div/div/fieldset[1]/div[1]/span[2]");
    private By xMinusY = By.xpath(".//*[@id='main']/div[2]/div[2]/div/div/fieldset[1]/div[1]/span[1]");
    private By xPlusY = By.xpath(".//*[@id='main']/div[2]/div[2]/div/div/fieldset[1]/div[1]/span[2]");



    public void verifyPDP(){
        waitForExpectedElement(pdpBody);
    }
    public String getProductName(){
        return waitForExpectedElement(xProductName).getText();
    }

    public void verifyBundle(){
        waitForExpectedElement(xBundleName);
        waitForExpectedElement(xBundleImage);
        waitForExpectedElement(bundleDescriptionX);
        waitForExpectedElement(bundleDescriptionY);
    }

    public String getBundleNameX(){
        return waitForExpectedElement(bundleNameX).getText();
    }

    public String getBundleNameY(){
        return waitForExpectedElement(bundleNameY).getText();
    }
}
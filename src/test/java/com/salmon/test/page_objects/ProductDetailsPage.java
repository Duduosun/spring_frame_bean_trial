package com.salmon.test.page_objects;

import com.salmon.test.framework.PageObject;
import com.salmon.test.framework.helpers.WebDriverHelper;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;

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

    //private By cssObjectCaptureTest = By.cssSelector(document.querySelector("#main > div.itemScopeMain > div.infoBlock > ul.infoBlockTabs"));

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

    private By cssSelfridgesSays = By.cssSelector(".infoBlockTabs");
    private By cssAddToBag = By.cssSelector(".addToBag.btnN.btnN2L");
    private By cssProductDescription = By.cssSelector(".prodDescInnerWrap");
    private By cssProductImage = By.cssSelector(".initialized>img");
    private By cssBundledProducts = By.cssSelector(".collectionItems");
    private By cssPopUpBag = By.cssSelector("#miniInner");
    private By cssBundleX = By.cssSelector(".description>a");
    private By cssContinueToCheckout = By.cssSelector(".checkout.btnN.btnN2L");
    private By cssViewBag = By.cssSelector(".viewBag.btnN.btnNL");


    public void verifyPDP(){
        waitForExpectedElement(pdpBody);
        waitForExpectedElement(cssProductDescription);
        waitForExpectedElement(cssProductImage);
    }
    public void verifyBundle(){
        waitForExpectedElement(xBundleName);
        waitForExpectedElement(xBundleImage);
        waitForExpectedElement(bundleDescriptionX);
        waitForExpectedElement(bundleDescriptionY);
        waitForExpectedElement(cssBundledProducts);
    }

    public void clickAddToBag(){
        waitForExpectedElement(cssAddToBag).click();
    }

    public String getProductName(){
        return waitForExpectedElement(xProductName).getText();
    }
    public String getBundleNameX(){
        return waitForExpectedElement(bundleNameX).getText();
    }
    public String getBundleNameY(){
        return waitForExpectedElement(bundleNameY).getText();
    }

    public WebElement verifyPopUpBag(){
        return waitForExpectedElement(cssPopUpBag);
    }


    //working with one of many elements
    private By cssAllQuickView = By.cssSelector(".quicklook");
    public void clickOneOfMany(int position){
        List<WebElement> plpProducts = WebDriverHelper.getWebDriver().findElements(cssAllQuickView);
        for(WebElement element: plpProducts){
            element.click();
        }
        plpProducts.get(position).click();
    }


}
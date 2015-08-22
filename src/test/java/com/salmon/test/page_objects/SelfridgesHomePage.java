package com.salmon.test.page_objects;

import com.salmon.test.framework.PageObject;
import org.openqa.selenium.By;

/**
 * Sample page object class which defines all the elements for a specific page.
 * Every  Class which contains page objects should extend "PageObject" class
 * This gives access to the webdriver object and utility methods
 * USE CSS,ID,NAME,CLASSNAME selectors instead of xpath
 */
public class SelfridgesHomePage extends PageObject {

    private String homePageTitle = "Designer Fashion, Accessories & More - Shop Online at Selfridges";

    private By headerSignInLink = By.cssSelector("#headerSignInLink a");
    private By headerLogoutLink = By.id("headerLogout");
    private By homeBody = By.id("homepage");
    private By bodyClass = By.className("reachedTop");
    private By topBar = By.id("globalNav");
    private By cTopBar = By.className("wrapper");
    private By xTopBar = By.xpath(".//*[@id='globalNav']");
    private By nationalFlag = By.className("translateFlag");
    private By xCurrency = By.xpath(".//*[@id='globalNav']/div/div/div/a/span");
    private By logo = By.id("logo");
    private By welcome = By.className("em");
    private By xWelcome = By.xpath(".//*[@id='xhrUncachedNav']/ul/li[1]/span");
    private By accountHead = By.className("accountnavlink");
    private By wishList = By.className("wishlist topLevel");
    private By xWishList = By.xpath(".//*[@id='xhrUncachedNav']/ul/li[2]/a");
    private By shoppingBag = By.className("icon");
    private By searchIcon = By.className("searchIcon");
    private By topLevelCategory = By.id("megaMenu");
    private By xTopLevelCategory = By.xpath(".//*[@id='megaMenu']");
    private By footerTop = By.id("footerTop");
    private By footerBody = By.id("footerBody");
    private By footerBottom = By.id("footerBottom");
    private By xMEGAONE = By.xpath(".//*[@id='megaMenu']/nav/ul/li[1]/a");
    private By xMEGATWO = By.xpath(".//*[@id='megaMenu']/nav/ul/li[2]/a");
    private By xMEGATHREE = By.xpath(".//*[@id='megaMenu']/nav/ul/li[3]/a");
    private By xMEGAFOUR = By.xpath(".//*[@id='megaMenu']/nav/ul/li[4]/a");
    private By xMEGAFIVE = By.xpath(".//*[@id='megaMenu']/nav/ul/li[5]/a");
    private By xMEGASIX = By.xpath(".//*[@id='megaMenu']/nav/ul/li[6]/a");
    private By xMEGASEVEN = By.xpath(".//*[@id='megaMenu']/nav/ul/li[7]/a");
    private By xMEGAEIGHT = By.xpath(".//*[@id='megaMenu']/nav/ul/li[8]/a");
    private By xMEGANINE = By.xpath(".//*[@id='megaMenu']/nav/ul/li[9]/a");


    public String stringHomePageTitle(){
        return  homePageTitle;
    }
    public String stringWelcome(){
        return waitForExpectedElement(welcome).getText();
    }
    public String stringTopCategory(){
        return waitForExpectedElement(topLevelCategory).getText();
    }
    public String stringFooter(){
        return waitForExpectedElement(footerBody).getText();
    }

    public void clickSignInLink() {
        waitForExpectedElement(headerSignInLink).click();
    }
    public void clickSignOutLink() {
        waitForExpectedElement(headerLogoutLink).click();
    }
    public void clickAccountHead(){
        waitForExpectedElement(accountHead).click();
    }
    public void clickLogo(){
        waitForExpectedElement(logo).click();
    }

    public void visibleAvatar(){
        waitForExpectedElement(logo);
        waitForExpectedElement(accountHead);
        waitForExpectedElement(xWishList);
        waitForExpectedElement(shoppingBag);
    }
    public boolean visibleBooleanAvatar(){
        return isElementPresent(logo);
    }

    public void homePageHeader(){
        waitForExpectedElement(topBar);
        waitForExpectedElement(nationalFlag);
        waitForExpectedElement(xCurrency);
        waitForExpectedElement(topLevelCategory);
    }
    public void homePageBody(){
        waitForExpectedElement(homeBody);
    }
    public void homePageFooter(){
        waitForExpectedElement(footerTop);
        waitForExpectedElement(footerBody);
        waitForExpectedElement(footerBottom);
    }
}
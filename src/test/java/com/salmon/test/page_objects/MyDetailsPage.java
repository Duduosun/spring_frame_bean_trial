package com.salmon.test.page_objects;

import com.salmon.test.framework.PageObject;
import org.openqa.selenium.By;

/**
 * Created by tfasoyiro on 24/06/2015.
 */
public class MyDetailsPage extends PageObject {

    private String myDetailsPageTitle = "My Details - Selfridges | Shop Online";

    private By myDetailsBody = By.id("pgmydetails");
    private By signOutButton = By.className("logoff");
    private By xSignOutButton = By.xpath(".//*[@id='myaccountnavInner']/ul/li[5]/a");
    private By topBar = By.className("wrapper");
    private By topLevelCategory = By.id("megaMenu");
    private By xTopLevelCategory = By.xpath(".//*[@id='megaMenu']");
    private By nationalFlag = By.className("translateFlag");
    private By xCurrency = By.xpath(".//*[@id='globalNav']/div/div/div/a/span");
    private By logo = By.id("logo");
    private By accountHead = By.className("accountnavlink");
    private By wishList = By.className("wishlist topLevel");
    private By xWishList = By.xpath(".//*[@id='xhrUncachedNav']/ul/li[3]/a");
    private By shoppingBag = By.className("icon");
    private By searchIcon = By.className("searchIcon");

    public String stringMyDetailsPageTitle() {

        return myDetailsPageTitle;
    }

    public void clickAccountHead(){
        waitForExpectedElement(accountHead).click();
    }
    public void clickSignOutButton(){waitForExpectedElement(signOutButton).click();}
    public void deleteFirefoxCookies(){
        webDriver.manage().deleteAllCookies();
    }
    public void visibleAvatar(){
        waitForExpectedElement(accountHead);
        waitForExpectedElement(xWishList);
        waitForExpectedElement(shoppingBag);
        waitForExpectedElement(searchIcon);
    }

}

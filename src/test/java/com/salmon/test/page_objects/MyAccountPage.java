package com.salmon.test.page_objects;

import com.salmon.test.framework.PageObject;
import org.openqa.selenium.By;

/**
 * Created by tfasoyiro on 24/06/2015.
 */
public class MyAccountPage extends PageObject {

    private String myAccountPageTitle = "My Account";

    private By myAccountBody = By.cssSelector(".customer-account-index.customer-account");
    private By myAccountLHS = By.cssSelector(".block.block-account");
    private By helloDashboard = By.cssSelector(".hello>strong");
    private By myDashboard = By.cssSelector(".col-main");

    public String stringMyAccountPageTitle() {

        return myAccountPageTitle;
    }
    public String stringUserDashboard(){
        return waitForExpectedElement(helloDashboard).getText();
    }

    public void verifyMyAccountModule (){
        waitForExpectedElement(myAccountBody).isDisplayed();
        waitForExpectedElement(myAccountLHS).isDisplayed();
        waitForExpectedElement(myDashboard).isDisplayed();
    }
    public void deleteFirefoxCookies(){
        webDriver.manage().deleteAllCookies();
    }

}

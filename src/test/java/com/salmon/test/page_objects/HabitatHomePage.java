package com.salmon.test.page_objects;

import com.salmon.test.framework.PageObject;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;

/**
 * Sample page object class which defines all the elements for a specific page.
 * Every  Class which contains page objects should extend "PageObject" class
 * This gives access to the webdriver object and utility methods
 * USE CSS,ID,NAME,CLASSNAME selectors instead of xpath
 */
public class HabitatHomePage extends PageObject {

    private String homePageTitle = "Home page";

    private By homeBody = By.cssSelector(".cms-index-index.cms-home");
    private By shoppingBag = By.cssSelector(".hbt-bag-icon.icon-HABITAT_BAG_ICON_01");
    private By searchMiniForm = By.cssSelector("#search_mini_form");
    private By habitatDialogBox = By.className("dialog");
    private By closeHomeDialog = By.className("habitat-dialog_close");
    private By habitatStartPage = By.cssSelector("#habitat-custom-wrapper");
    private By logo = By.cssSelector(".logo>img");
    private By accountHead = By.cssSelector(".hbt-account-icon.icon-HABITAT_ACCOUNT_ICON_01");



    public String stringHomePageTitle(){
        return  homePageTitle;
    }

    public boolean visibleBooleanAvatar(){
        return isElementPresent(logo);
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
        waitForExpectedElement(searchMiniForm);
        waitForExpectedElement(shoppingBag);
    }
    public void dialogBoxHandler(){
        waitForExpectedElement(habitatDialogBox);
        waitForExpectedElement(closeHomeDialog).click();
    }
}
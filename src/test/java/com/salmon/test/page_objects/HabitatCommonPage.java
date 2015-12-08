package com.salmon.test.page_objects;

import com.salmon.test.framework.PageObject;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;


/**
 * Created by tfasoyiro on 14/08/2015.
 */

public class HabitatCommonPage extends PageObject {

    private String commonPageTitle = "";

    private By pageGUI = By.cssSelector(".page");
    private By searchResultPage = By.cssSelector(".catalogsearch-result-index");
    private By searchResultHeader = By.cssSelector(".main .page-title>h1");
    private By plpSearch = By.cssSelector(".main");
    private By signOut = By.cssSelector("#header-account .links .last>a[title=\"Sign Out\"]");
    private By habitatDialogBox = By.className("dialog");
    private By closeHomeDialog = By.className("habitat-dialog_close");
    private By helloAccountUser = By.cssSelector(".hbt-account.skip-link.skip-account.logged-in");
    private By accountMenu = By.cssSelector("#header-account");
    private By breadcrumbs = By.cssSelector(".breadcrumbs");

    //Header
    private By pageHeaderContainer = By.cssSelector(".page-header-container");
    private By topRHS = By.cssSelector(".loc-help-links");
    private By logo = By.cssSelector(".logo>img");
    private By search = By.cssSelector("#hbt-search");
    private By searchButton = By.cssSelector(".search-button");
    private By searchMiniForm = By.cssSelector("#search_mini_form");
    private By accountBagContainer = By.cssSelector(".account-cart-wrapper");
    private By emptyShoppingBag = By.cssSelector(".hbt-bag-icon.icon-HABITAT_BAG_ICON_01");
    private By nonEmptyShoppingBag = By.cssSelector(".hbt-bag-icon.icon-HABITAT_BAG_ICON_02");
    private By guestUserHead = By.cssSelector(".hbt-account-icon.icon-HABITAT_ACCOUNT_ICON_01");
    private By regUserHead = By.cssSelector(".hbt-account-icon.icon-HABITAT_ACCOUNT_ICON_02");
    private By megaMenuBar = By.cssSelector("#header-nav");
    private By advertBanner = By.cssSelector(".sitewide-top-banner");

    //Footer
    private By pageFooterContainer = By.cssSelector(".footer-container");
    private By footerLinks = By.cssSelector(".footer-common-links");
    private By newsletterForm = By.cssSelector("#newsletter-validate-detail");

    //Megamenu
    private By megaONE = By.cssSelector("a[class^=level0][title='Sofas & Armchairs']");
    private By megaTWO = By.cssSelector("a[class^=level0][title='Furniture']");
    private By megaTHREE = By.cssSelector("a[class^=level0][title='Sale']");
    private By megaFOUR = By.cssSelector("a[class^=level0][title='Accessories']");
    private By megaFIVE = By.cssSelector("a[class^=level0][title='Lighting']");
    private By megaSIX = By.cssSelector("a[class^=level0][title='Kitchen']");
    private By megaSEVEN = By.cssSelector("a[class^=level0][title='Soft Furnishing']");
    private By megaEIGHT = By.cssSelector("a[class^=level0][title='Our Habitat']");

    //actions
    public void clickGuestUser(){waitForExpectedElement(guestUserHead).click();}
    public void clickRegisteredUser(){waitForExpectedElement(regUserHead).click();}
    public void clickSignOut(){ waitForExpectedElement(signOut).click();}
    public void defaultAvatar(){
        waitForExpectedElement(logo);
        waitForExpectedElement(guestUserHead);
        waitForExpectedElement(searchMiniForm);
        waitForExpectedElement(emptyShoppingBag);
    }

    public void goToSearch(){
        waitForExpectedElement(search).isDisplayed();
    }
    public void registeredUserSession(){
        waitForExpectedElement(regUserHead).isDisplayed();
    }
    public void guestUserSession(){waitForExpectedElement(guestUserHead).isDisplayed();}
    public void mouseOverRegUser() {
        mouseOverExpectedElement(webElementRegUser());
    }
    public void mouseOverGuestUser(){
        mouseOverExpectedElement(webElementGuestUser());
    }
    public void deleteFirefoxCookies(){
        webDriver.manage().deleteAllCookies();
    }
    public void clickMegaMenu(String menu) {

        switch (menu) {
            case "MegaMenuOne": {
                waitForExpectedElement(megaONE).click();
                mouseOverExpectedElement(waitForExpectedElement(pageHeaderContainer));
                break;
            }
            case "MegaMenuTwo": {
                waitForExpectedElement(megaTWO).click();
                mouseOverExpectedElement(waitForExpectedElement(pageHeaderContainer));
                break;
            }
            case "MegaMenuThree": {
                waitForExpectedElement(megaTHREE).click();
                mouseOverExpectedElement(waitForExpectedElement(pageHeaderContainer));
                break;
            }
            case "MegaMenuFour": {
                waitForExpectedElement(megaFOUR).click();
                mouseOverExpectedElement(waitForExpectedElement(pageHeaderContainer));
                break;
            }
            case "MegaMenuFive": {
                waitForExpectedElement(megaFIVE).click();
                mouseOverExpectedElement(waitForExpectedElement(pageHeaderContainer));
                break;
            }
            case "MegaMenuSix": {
                waitForExpectedElement(megaSIX).click();
                mouseOverExpectedElement(waitForExpectedElement(pageHeaderContainer));
                break;
            }
            case "MegaMenuSeven": {
                waitForExpectedElement(megaSEVEN).click();
                mouseOverExpectedElement(waitForExpectedElement(pageHeaderContainer));
                break;
            }
            case "MegaMenuEight": {
                waitForExpectedElement(megaEIGHT).click();
                mouseOverExpectedElement(waitForExpectedElement(pageHeaderContainer));
                break;
            }
            case "MegaMenuNine": {
                waitForExpectedElement(megaEIGHT).click();
                mouseOverExpectedElement(waitForExpectedElement(pageHeaderContainer));
                break;
            }
        }
    }
    public void clickLogo(){
        waitForExpectedElement(logo).click();
    }
    public void pageHeaderCheck(){
        waitForExpectedElement(pageHeaderContainer).isDisplayed();
        waitForExpectedElement(topRHS).isDisplayed();
        waitForExpectedElement(logo).isDisplayed();
        waitForExpectedElement(searchMiniForm).isDisplayed();
        waitForExpectedElement(accountBagContainer).isDisplayed();
        waitForExpectedElement(megaMenuBar).isDisplayed();
        waitForExpectedElement(advertBanner).isDisplayed();
    }
    public void pageFooterCheck(){
        waitForExpectedElement(pageFooterContainer).isDisplayed();
        waitForExpectedElement(footerLinks).isDisplayed();
        waitForExpectedElement(newsletterForm).isDisplayed();
    }
    public void guestUserMouseOverCheck(){
        mouseOverGuestUser();
        waitForExpectedElement(accountMenu).isDisplayed();
    }
    public void regUserMouseOverCheck() {
        mouseOverRegUser();
        waitForExpectedElement(accountMenu).isDisplayed();
    }
    public void clickSearchButton(){
        waitForExpectedElement(searchButton).click();
    }

    public WebElement webElementRegUser(){
        return waitForExpectedElement(regUserHead);
    }
    public WebElement webElementGuestUser(){
        return waitForExpectedElement(guestUserHead);
    }
    public WebElement searchInput(){
        return waitForExpectedElement(search);
    }

    public String searchResultHeading( ){
        return waitForExpectedElement(searchResultHeader).getText();
    }
    public String stringCheckPageHeader(){
        return waitForExpectedElement(pageHeaderContainer).getText(); }
    public String stringCheckPageFooter(){
        return waitForExpectedElement(pageFooterContainer).getText();
    }
    public String stringBreadcrumbs(){
        return waitForExpectedElement(breadcrumbs).getText();
    }
    public String stringFooterLinks(){return waitForExpectedElement(footerLinks).getText();}
    public String returnPLPSearchResult (){
        return waitForExpectedElement(searchResultPage).getText();
    }
    public String stringRegisteredUser(){
        return waitForExpectedElement(helloAccountUser).getText();
    }

    public boolean visibleRegisteredUser(){
        return isElementPresent(regUserHead);
    }
    public boolean visibleGuestUser(){return  isElementPresent(guestUserHead);
    }
}
package com.salmon.test.page_objects;

import com.salmon.test.framework.PageObject;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

/**
 * Created by tfasoyiro on 14/08/2015.
 */

public class HabitatCommonPage extends PageObject {

    private String commonPageTitle = "";

    private By pageGUI = By.cssSelector(".page");
    private By signOut = By.cssSelector("#header-account .links .last>a[title=\"Sign Out\"]");
    private By emptyShoppingBag = By.cssSelector(".hbt-bag-icon.icon-HABITAT_BAG_ICON_01");
    private By nonEmptyShoppingBag = By.cssSelector(".hbt-bag-icon.icon-HABITAT_BAG_ICON_02");
    private By search = By.cssSelector("#search");
    private By searchMiniForm = By.cssSelector("#search_mini_form");
    private By habitatDialogBox = By.className("dialog");
    private By closeHomeDialog = By.className("habitat-dialog_close");
    private By logo = By.cssSelector(".logo>img");
    private By guestUserHead = By.cssSelector(".hbt-account-icon.icon-HABITAT_ACCOUNT_ICON_01");
    private By regUserHead = By.cssSelector(".hbt-account-icon.icon-HABITAT_ACCOUNT_ICON_02");
    private By helloAccountUser = By.cssSelector(".hbt-account.skip-link.skip-account.logged-in");

    //Megamenu
    private By megaMenuHeader = By.cssSelector("#header-nav");
    private By megaONE = By.cssSelector(".level0.nav-1.parent");
    private By megaTWO = By.cssSelector(".level0.nav-2.parent");
    private By megaTHREE = By.cssSelector(".level0.nav-3.parent");
    private By megaFOUR = By.cssSelector(".level0.nav-4.parent");
    private By megaFIVE = By.cssSelector(".level0.nav-5.parent");
    private By megaSIX = By.cssSelector(".level0.nav-6.parent");
    private By megaSEVEN = By.cssSelector(".level0.nav-7.parent");
    private By megaEIGHT = By.cssSelector(".level0.nav-8.parent");

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
        waitForExpectedElement(regUserHead);
    }
    public void guestUserSession(){waitForExpectedElement(guestUserHead);}
    public void mouseOverRegUser(){
        mouseOverExpectedElement(webElementRegUser());
    }
    public void deleteFirefoxCookies(){
        webDriver.manage().deleteAllCookies();
    }

    public WebElement webElementRegUser(){
        return waitForExpectedElement(regUserHead);
    }

    public boolean visibleRegisteredUser(){
        return isElementPresent(regUserHead);
    }
    public boolean visibleGuestUser(){return  isElementPresent(guestUserHead);}

    //Header
    private By plpBody = By.xpath(".//*[@id='screenR']");
    private By plpSearch = By.xpath(".//*[@id='plp-search']");

    private By topBar = By.id("globalNav");
    private By xTopBar = By.xpath(".//*[@id='globalNav']");
    private By cTopBar = By.className("wrapper");
    private By nationalFlag = By.className("translateFlag");
    private By xCurrency = By.xpath(".//*[@id='globalNav']/div/div/div/a/span");

    private By welcome = By.className("em");
    private By xWelcome = By.xpath(".//*[@id='xhrUncachedNav']/ul/li[1]/span");

    //Avatar
    private By wishList = By.className("wishlist topLevel");
    private By xWishList = By.xpath(".//*[@id='xhrUncachedNav']/ul/li[2]/a");
    private By searchIcon = By.className("searchIcon");

    //Category Title
    private By categoryTitle = By.xpath(".//*[@id='main']/div[1]/h1");

    //Footer
    private By footerTop = By.id("footerTop");
    private By footerBody = By.id("footerBody");
    private By footerBottom = By.id("footerBottom");

    public void clickMegaMenu(String menu) {

        switch (menu) {
            case "MegaMenuOne": {
                waitForExpectedElement(megaONE).click();
                waitForExpectedElement(megaONE).sendKeys(Keys.RETURN);
                break;
            }
            case "MegaMenuTwo": {
                waitForExpectedElement(megaTWO).click();
                waitForExpectedElement(megaTWO).sendKeys(Keys.RETURN);
                break;
            }
            case "MegaMenuThree": {
                waitForExpectedElement(megaTHREE).click();
                waitForExpectedElement(megaTHREE).sendKeys(Keys.RETURN);
                break;
            }
            case "MegaMenuFour": {
                waitForExpectedElement(megaFOUR).click();
                waitForExpectedElement(megaFOUR).sendKeys(Keys.RETURN);
                break;
            }
            case "MegaMenuFive": {
                waitForExpectedElement(megaFIVE).click();
                waitForExpectedElement(megaFIVE).sendKeys(Keys.RETURN);
                break;
            }
            case "MegaMenuSix": {
                waitForExpectedElement(megaSIX).click();
                waitForExpectedElement(megaSIX).sendKeys(Keys.RETURN);
                break;
            }
            case "MegaMenuSeven": {
                waitForExpectedElement(megaSEVEN).click();
                waitForExpectedElement(megaSEVEN).sendKeys(Keys.RETURN);
                break;
            }
            case "MegaMenuEight": {
                waitForExpectedElement(megaEIGHT).click();
                waitForExpectedElement(megaEIGHT).sendKeys(Keys.RETURN);
                break;
            }
            case "MegaMenuNine": {
                waitForExpectedElement(megaEIGHT).click();
                waitForExpectedElement(megaEIGHT).sendKeys(Keys.RETURN);
                break;
            }
        }
    }

    public void clickLogo(){
        waitForExpectedElement(logo).click();
    }
    public void verifyCategoryHeading(String category){
        waitForExpectedElement(categoryTitle);
        category = waitForExpectedElement(categoryTitle).getText();
    }

    public String returnPLPSearchResult (){
       return waitForExpectedElement(plpSearch) .getText();
    }
    public String stringRegisteredUser(){
        return waitForExpectedElement(helloAccountUser).getText();
    }
}

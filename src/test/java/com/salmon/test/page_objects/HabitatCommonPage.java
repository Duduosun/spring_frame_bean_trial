package com.salmon.test.page_objects;

import com.salmon.test.framework.PageObject;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.assertj.core.api.Assertions.*;

/**
 * Created by tfasoyiro on 14/08/2015.
 */

public class HabitatCommonPage extends PageObject {

    private String commonPageTitle = "";

    private By pageGUI = By.cssSelector(".page");
    private By signOut = By.cssSelector("#header-account .links .last>a[title=\"Sign Out\"]");
    private By habitatDialogBox = By.className("dialog");
    private By closeHomeDialog = By.className("habitat-dialog_close");
    private By helloAccountUser = By.cssSelector(".hbt-account.skip-link.skip-account.logged-in");
    private By accountMenu = By.cssSelector("#header-account");

    //Header
    private By pageHeaderContainer = By.cssSelector(".page-header-container");
    private By topRHS = By.cssSelector(".loc-help-links");
    private By logo = By.cssSelector(".logo>img");
    private By search = By.cssSelector("#search");
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
    private By megaONE = By.cssSelector(".level0.nav-1.parent");
    private By megaTWO = By.cssSelector(".level0.nav-2.parent");
    private By megaTHREE = By.cssSelector(".level0.nav-3.parent");
    private By megaFOUR = By.cssSelector(".level0.nav-4.parent");
    private By megaFIVE = By.cssSelector(".level0.nav-5.parent");
    private By megaSIX = By.cssSelector(".level0.nav-6.parent");
    private By megaSEVEN = By.cssSelector(".level0.nav-7.parent");
    private By megaEIGHT = By.cssSelector(".level0.nav-8.parent");

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
                mouseOverExpectedElement(waitForExpectedElement(megaONE));
                break;
            }
            case "MegaMenuTwo": {
                waitForExpectedElement(megaTWO).click();
                //waitForExpectedElement(megaTWO).sendKeys(Keys.RETURN);
                break;
            }
            case "MegaMenuThree": {
                waitForExpectedElement(megaTHREE).click();
                //waitForExpectedElement(megaTHREE).sendKeys(Keys.RETURN);
                break;
            }
            case "MegaMenuFour": {
                waitForExpectedElement(megaFOUR).click();
                //waitForExpectedElement(megaFOUR).sendKeys(Keys.RETURN);
                break;
            }
            case "MegaMenuFive": {
                waitForExpectedElement(megaFIVE).click();
                //waitForExpectedElement(megaFIVE).sendKeys(Keys.RETURN);
                break;
            }
            case "MegaMenuSix": {
                waitForExpectedElement(megaSIX).click();
                //waitForExpectedElement(megaSIX).sendKeys(Keys.RETURN);
                break;
            }
            case "MegaMenuSeven": {
                waitForExpectedElement(megaSEVEN).click();
                waitForExpectedElement(megaSEVEN).sendKeys(Keys.RETURN);
                break;
            }
            case "MegaMenuEight": {
                waitForExpectedElement(megaEIGHT).click();
                //waitForExpectedElement(megaEIGHT).sendKeys(Keys.RETURN);
                break;
            }
            case "MegaMenuNine": {
                waitForExpectedElement(megaEIGHT).click();
                //waitForExpectedElement(megaEIGHT).sendKeys(Keys.RETURN);
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
    public void regUserMouseOverCheck(){
        mouseOverRegUser();
        waitForExpectedElement(accountMenu).isDisplayed();
    }

    public WebElement webElementRegUser(){
        return waitForExpectedElement(regUserHead);
    }
    public WebElement webElementGuestUser(){
        return waitForExpectedElement(guestUserHead);
    }

    public String stringCheckPageHeader(){
        return waitForExpectedElement(pageHeaderContainer).getText(); }
    public String stringCheckPageFooter(){
        return waitForExpectedElement(pageFooterContainer).getText();
    }
    public String stringFooterLinks(){return waitForExpectedElement(footerLinks).getText();}

    public String elementCheck(){
        return waitForExpectedElement(footerLinks).getAttribute("value");
    }

    public boolean visibleRegisteredUser(){
        return isElementPresent(regUserHead);
    }
    public boolean visibleGuestUser(){return  isElementPresent(guestUserHead);
    }

    //Header
    private By plpBody = By.xpath(".//*[@id='screenR']");
    private By plpSearch = By.xpath(".//*[@id='plp-search']");

    public String returnPLPSearchResult (){
       return waitForExpectedElement(plpSearch) .getText();
    }
    public String stringRegisteredUser(){
        return waitForExpectedElement(helloAccountUser).getText();
    }
}

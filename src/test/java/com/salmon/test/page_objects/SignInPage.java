package com.salmon.test.page_objects;

import com.salmon.test.framework.PageObject;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;


/**
 * Created by tfasoyiro on 23/06/2015.
 */
public class SignInPage extends PageObject {

    private String signInPageTitle = "Sign in - Selfridges | Shop Online";

    private By signInBody = By.id("signin");
    private By accountHead = By.className("accountnavlink");
    private By wishList = By.className("wishlist topLevel");
    private By xWishList = By.xpath(".//*[@id='xhrUncachedNav']/ul/li[3]/a");
    private By shoppingBag = By.className("icon");
    private By logo = By.id("logo");
    private By emailAddressLogon = By.id("logonId");
    private By passwordLogon = By.id("logonPassword");
    private By signInButton = By.className("btnN btnN3");
    private By xSignInButton = By.xpath("//*[@id='sign_in']/div[2]/div/div/form/fieldset/button");
    private By signOutButton = By.className("logoff");
    private By xSignOutButton = By.xpath(".//*[@id='myaccountnavInner']/ul/li[5]/a");
    private By xCreateAnAccount = By.xpath(".//*[@id='Register']/button");
    private By xSignInLink = By.xpath(".//*[@id='myaccountnavInner']/ul/li/a");
    private By errorMessage = By.id("rowErrorMsg");
    private By ddlTitle = By.id("dk_container_personTitle");
    private By firstName = By.id("firstName");
    private By lastName = By.id("lastName");
    private By emailAddress = By.id("registerLogonId");
    private By passWord = By.id("registerLogonPassword");
    private By confirmPassword = By.id("logonPasswordVerify");

    public String stringSignInPageTitle(){
        return signInPageTitle;
    }
    public String getErrorMessage(){
        return waitForExpectedElement(errorMessage).getText();
    }

    public WebElement emailAddressLogon(){
        return waitForExpectedElement(emailAddressLogon);
    }
    public WebElement passwordLogon(){
        return waitForExpectedElement(passwordLogon);
    }
    public WebElement titleText(){
        return waitForExpectedElement(ddlTitle);
    }
    public WebElement firstNameText(){
        return waitForExpectedElement(firstName);
    }
    public WebElement lastNameText(){
        return waitForExpectedElement(lastName);
    }
    public WebElement emailAddressText(){
        return waitForExpectedElement(emailAddress);
    }
    public WebElement passwordText(){
        return waitForExpectedElement(passWord);
    }
    public WebElement confirmPasswordText(){
        return waitForExpectedElement(confirmPassword);
    }

    public void clickSignInButton(){
        waitForExpectedElement(xSignInButton).click();
    }
    public void clickSignOutButton(){waitForExpectedElement(signOutButton).click();}
    public void clickCreateAnAccountButton(){
        waitForExpectedElement(xCreateAnAccount).click();
    }
    public void clickSignInLink(){waitForExpectedElement(xSignInLink).click();}
    public void selectTitle(){
        webDriver.findElement(ddlTitle).sendKeys("Mrs");
    }
    public void fillFirstName(){
        webDriver.findElement(firstName).sendKeys("master1001");
    }
    public void fillLastName(){
        webDriver.findElement(lastName).sendKeys("Salmon");
    }
    public void fillEmailAddress(){
        webDriver.findElement(emailAddress).sendKeys("master1001@salmon.com");
    }
    public void fillConfirmPassword(){
        webDriver.findElement(confirmPassword).sendKeys("salmon01");
    }
    public void fillPassword(){
        webDriver.findElement(passWord).sendKeys("salmon01");
    }

    public void visibleAvatar() {
        waitForExpectedElement(logo);
        waitForExpectedElement(accountHead);
        //waitForExpectedElement(xWishList);
        waitForExpectedElement(shoppingBag);
    }
}

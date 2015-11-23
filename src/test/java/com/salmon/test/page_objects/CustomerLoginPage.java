package com.salmon.test.page_objects;

import com.salmon.test.framework.PageObject;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;

/**
 * Created by tfasoyiro on 16/11/2015.
 */
public class CustomerLoginPage extends PageObject {

    private String customerLoginPageTitle = "Customer Login";

    private By emailAddress = By.cssSelector(".main #email");
    private By password = By.cssSelector(".main #pass");
    private By login = By.cssSelector(".main #send2");
    private By createAnAccount = By.cssSelector(".main .button>span>span");

    public String stringCustomerLoginPageTitle(){
        return customerLoginPageTitle;
    }

    public WebElement emailAddressText(){
        return waitForExpectedElement(emailAddress);
    }
    public WebElement passwordText(){return waitForExpectedElement(password);}
    public void clickLogin(){
        waitForExpectedElement(login).click();
    }
    public void clickCreateAnAccount(){waitForExpectedElement(createAnAccount).click();}
}

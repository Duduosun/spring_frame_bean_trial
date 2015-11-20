package com.salmon.test.page_objects;

import com.salmon.test.framework.PageObject;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

/**
 * Sample page object class which defines all the elements for a specific page.
 * Every  page object class should extend "PageObject" class
 */


public class NewCustomerPage extends PageObject {

    private String newCustomerPageTitle = "Create New Customer Account";

    private By createAccountForm = By.cssSelector(".account-create");
    private By createAnAccountLabel = By.cssSelector("#checkout-welcome");

    private By title = By.cssSelector("#prefix");
    private By firstName = By.cssSelector("#firstname");
    private By lastName = By.cssSelector("#lastname");
    private By emailAddress = By.cssSelector("#email_address");
    private By mobile = By.cssSelector("#mobile_number");
    private By password = By.cssSelector("#password");
    private By confirmPassword = By.cssSelector("#confirmation");
    private By preferredStore = By.cssSelector("#preferred_store");
    private By newsletterCheckBox = By.cssSelector("#is_subscribed");
    private By registerButton = By.cssSelector(".button");
    private By phoneSuggestLink = By.cssSelector(".telephone-reveal.suggestion");
    private By telephone = By.cssSelector("#telephone");
    private By backLink = By.cssSelector(".back-link");

    public String stringNewCustomerPageTitle(){
        return newCustomerPageTitle;
    }

    public WebElement titleText(){return waitForExpectedElement(title);}
    public WebElement firstNameText() {
        return waitForExpectedElement(firstName);
    }
    public WebElement lastNameText() {
        return waitForExpectedElement(lastName);
    }
    public WebElement emailAddressText() {
        return waitForExpectedElement(emailAddress);
    }
    public WebElement mobileText(){return waitForExpectedElement(mobile);}
    public WebElement passwordText() {
        return waitForExpectedElement(password);
    }
    public WebElement confirmPasswordText() {
        return waitForExpectedElement(confirmPassword);
    }
    public WebElement preferredStoreText(){return waitForExpectedElement(preferredStore);}




    public boolean checkCreateAccountForm() {
        return waitForExpectedElement(createAccountForm).isDisplayed();
    }
    public void acceptNewsletter(boolean yesOrNo) {
        WebElement newsletterWebElement = getWebDriver().findElement(newsletterCheckBox);
        boolean selected = newsletterWebElement.isSelected();
        if (yesOrNo && !selected) {
            newsletterWebElement.click();
        } else if (!yesOrNo && selected) {
            newsletterWebElement.click();
        }
    }
    public void registerNewCustomer() {
        waitForExpectedElement(registerButton).click();
    }
}

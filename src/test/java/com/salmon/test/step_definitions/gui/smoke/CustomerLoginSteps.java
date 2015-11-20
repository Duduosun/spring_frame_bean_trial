package com.salmon.test.step_definitions.gui.smoke;

import com.salmon.test.framework.helpers.WebDriverHelper;
import com.salmon.test.page_objects.CustomerLoginPage;
import com.salmon.test.page_objects.HabitatCommonPage;
import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

/**
 * Created by tfasoyiro on 16/11/2015.
 */
public class CustomerLoginSteps {

    private CustomerLoginPage customerLoginPage;
    private HabitatCommonPage habitatCommonPage;

    public CustomerLoginSteps(CustomerLoginPage customerLoginPage, HabitatCommonPage habitatCommonPage) {
        this.customerLoginPage = customerLoginPage;
        this.habitatCommonPage = habitatCommonPage;
    }


    @And("^Enter emailaddress \"([^\"]*)\" and password \"([^\"]*)\"$")
    public void Enter_emailaddress_and_password(String emailaddress, String password) throws Throwable {
        habitatCommonPage.defaultAvatar();
        habitatCommonPage.goToSearch();
        customerLoginPage.emailAddressText().sendKeys(emailaddress);
        customerLoginPage.passwordText().sendKeys(password);
        customerLoginPage.clickLogin();
    }

    @And("^Click Create An Account$")
    public void Click_Create_An_Account() throws Throwable {
        customerLoginPage.clickCreateAnAccount();
    }
}

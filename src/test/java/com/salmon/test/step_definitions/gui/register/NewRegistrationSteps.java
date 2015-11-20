package com.salmon.test.step_definitions.gui.register;


import com.salmon.test.framework.helpers.utils.RandomGenerator;
import com.salmon.test.page_objects.NewCustomerPage;
import cucumber.api.java.en.When;
import lombok.Getter;
import org.testng.Assert;

import static com.salmon.test.enums.PermittedCharacters.ALPHABETS;
import static com.salmon.test.enums.PermittedCharacters.ALPHANUMERIC;
import static com.salmon.test.framework.helpers.utils.RandomGenerator.random;

@Getter
public class NewRegistrationSteps {

    private NewCustomerPage newCustomerPage;

    private String loginIdData = random(6, ALPHANUMERIC);
    private String passwordData = random(6, ALPHANUMERIC);
    private String titleData = "Dr.";
    private String firstNameData = random(6, ALPHABETS);
    private String lastNameData = random(6, ALPHABETS);
    private String postCodeData = "UB10 9DW";
    private String address1Data = random(6, ALPHABETS);
    private String townOrCityData = random(6, ALPHABETS);
    private String emailAddressData = RandomGenerator.randomEmailAddress(6);
    private String birthDateData = "1";
    private String birthMonthData = "1";
    private String birthYearData = "1982";


    public NewRegistrationSteps(NewCustomerPage newCustomerPage) {
        this.newCustomerPage = newCustomerPage;
    }


    @When("^i fill in the registration form on New Registration page$")
    public void i_fill_in_the_registration_form_on_New_Registration_page() throws Throwable {
        Assert.assertTrue(newCustomerPage.checkNewRegistrationForm(), "New Registration Form is Displayed");
        enterUserRegistrationDetails();

    }


    public void enterUserRegistrationDetails() {

        newCustomerPage.loginIdText().sendKeys(loginIdData);
        newCustomerPage.passwordText().sendKeys(passwordData);
        newCustomerPage.verifyPasswordText().sendKeys(passwordData);

        newCustomerPage.selectTitle().selectByVisibleText(titleData);
        newCustomerPage.firstNameText().sendKeys(firstNameData);
        newCustomerPage.lastNameText().sendKeys(lastNameData);

        newCustomerPage.postCodeText().sendKeys(postCodeData);
        newCustomerPage.address1Text().sendKeys(address1Data);
        newCustomerPage.townOrCityText().sendKeys(townOrCityData);

        newCustomerPage.emailAddressText().sendKeys(emailAddressData);
        newCustomerPage.confirmEmailAddressText().sendKeys(emailAddressData);

        newCustomerPage.birthDayText().selectByVisibleText(birthDateData);
        newCustomerPage.birthMonthText().selectByVisibleText(birthMonthData);
        newCustomerPage.birthYearText().selectByVisibleText(birthYearData);

        newCustomerPage.acceptTermsAndConditions(true);

        newCustomerPage.submitRegistration();

    }


}
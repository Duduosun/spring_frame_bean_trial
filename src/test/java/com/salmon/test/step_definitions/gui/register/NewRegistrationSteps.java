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

        //newCustomerPage.acceptTermsAndConditions(true);




}
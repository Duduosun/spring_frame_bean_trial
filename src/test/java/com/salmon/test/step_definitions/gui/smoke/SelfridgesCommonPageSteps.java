package com.salmon.test.step_definitions.gui.smoke;


import com.salmon.test.page_objects.SelfridgesCommonPage;
import cucumber.api.java.en.When;

/**
 * Created by Tola on 17/08/2015
 */
public class SelfridgesCommonPageSteps {

    private SelfridgesCommonPage selfridgesCommonPage;

    public SelfridgesCommonPageSteps(SelfridgesCommonPage selfridgesCommonPage){
        this.selfridgesCommonPage = selfridgesCommonPage;
    }


    @When("^User Navigate Mega Menu \"([^\"]*)\"$")
    public void User_Navigate_Mega_Menu(String megamenu) throws Throwable {
        selfridgesCommonPage.clickMegaMenu(megamenu);

    }
}

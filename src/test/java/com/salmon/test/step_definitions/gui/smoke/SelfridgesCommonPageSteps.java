package com.salmon.test.step_definitions.gui.smoke;


import com.salmon.test.page_objects.*;
import cucumber.api.java.en.When;

/**
 * Created by Tola on 17/08/2015
 */
public class SelfridgesCommonPageSteps {
    private GridViewPage gridViewPage;
    private MyDetailsPage myDetailsPage;
    private SelfridgesCommonPage selfridgesCommonPage;
    private SelfridgesHomePage selfridgesHomePage;
    private SignInPage signInPage;

    public SelfridgesCommonPageSteps(GridViewPage gridViewPage, MyDetailsPage myDetailsPage,
                                 SelfridgesCommonPageSteps selfridgesCommonPageSteps,SelfridgesHomePage selfridgesHomePage,
                                 SignInPage signInPage){
        this.gridViewPage = gridViewPage;
        this.myDetailsPage = myDetailsPage;
        this.selfridgesCommonPage = selfridgesCommonPage;
        this.selfridgesHomePage = selfridgesHomePage;
        this.signInPage = signInPage;
    }


    @When("^User Navigate Mega Menu \"([^\"]*)\"$")
    public void User_Navigate_Mega_Menu(String megamenu) throws Throwable {
        selfridgesCommonPage.clickMegaMenu(megamenu);

    }
}

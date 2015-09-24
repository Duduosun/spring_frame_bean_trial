package com.salmon.test.page_objects;

import com.salmon.test.framework.PageObject;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;

/**
 * Created by tfasoyiro on 18/09/2015.
 */
public class LocationSelectPage extends PageObject {

    //private String locationPageTitle = "Location Select - Selfridges | Shop Online";
    private String locationPageTitle = "Country Select - Selfridges | Shop Online";

    private By countrySelectBody = By.id("pgcountryselectdesktop");
    private By countryFlagWrapper = By.className("country-flag-wrapper");
    private By countrySearch = By.className("countrysearch");
    private By continueButton = By.className("js-continueButton btnN btnN3");
    private By deliveryInformation = By.className("deliverySnippet");
    private By regionOne = By.xpath(".//*[@id='main']/div[1]/ul/li[1]/h4/span");
    private By regionTwo = By.xpath(".//*[@id='main']/div[1]/ul/li[2]/h4/span");
    private By regionThree = By.xpath(".//*[@id='main']/div[1]/ul/li[3]/h4/span");
    private By regionFour = By.xpath(".//*[@id='main']/div[1]/ul/li[4]/h4/span");
    private By regionFive = By.xpath(".//*[@id='main']/div[1]/ul/li[5]/h4/span");
    //private By regionOneCountries = By.className("countrylist.*");
    private By regionOneCountries = By.xpath(".//*[@id='main']/div[1]/ul/li[1]");
    private By regionTwoCountries = By.xpath(".//*[@id='main']/div[1]/ul/li[2]");
    private By regionThreeCountries = By.xpath(".//*[@id='main']/div[1]/ul/li[3]");
    private By regionFourCountries = By.xpath(".//*[@id='main']/div[1]/ul/li[4]");
    private By regionFiveCountries = By.xpath(".//*[@id='main']/div[1]/ul/li[5]");

    public void enterCountry(String country){
        waitForExpectedElement(countrySearch).sendKeys(country);
        waitForExpectedElement(countrySearch).sendKeys(Keys.RETURN);
    }
    public void clickContinue(){
        waitForExpectedElement(continueButton).click();
    }
    public void clickRegion(String region){

        switch (region){
            case "Region One": {
                waitForExpectedElement(regionOne).click();
                break;
            }
            case "Region Two": {
                waitForExpectedElement(regionTwo).click();
                break;
            }
            case "Region Three": {
                waitForExpectedElement(regionThree).click();
                break;
            }
            case "Region Four": {
                waitForExpectedElement(regionFour).click();
                break;
            }
            case "Region Five": {
                waitForExpectedElement(regionFive).click();
                break;
            }
        }
    }
    public void clickCountry(String country){}
    public void vpCountrySelect(){
        waitForExpectedElement(countrySelectBody).isDisplayed();
        waitForExpectedElement(countryFlagWrapper).isDisplayed();
        waitForExpectedElement(deliveryInformation).isDisplayed();
    }

    public String stringLocationPageTitle (){
        return locationPageTitle;
    }
    public String returnRegion(String region){
        String retval = "";

        switch (region){
            case "Region One": {
                retval = waitForExpectedElement(regionOne).getText();
                break;
            }
            case "Region Two": {
                retval = waitForExpectedElement(regionTwo).getText();
                break;
            }
            case "Region Three": {
                retval = waitForExpectedElement(regionThree).getText();
                break;
            }
            case "Region Four": {
                retval = waitForExpectedElement(regionFour).getText();
                break;
            }
            case "Region Five": {
                retval = waitForExpectedElement(regionFive).getText();
                break;
            }
        }
        return retval;
    }
    public String returnCountry(String region) {

        String retval = "";

        switch (region) {
            case "Region One": {
                retval = waitForExpectedElement(regionOneCountries).getText();
                break;
            }
            case "Region Two": {
                retval = waitForExpectedElement(regionTwoCountries).getText();
                break;
            }
            case "Region Three": {
                retval = waitForExpectedElement(regionThreeCountries).getText();
                break;
            }
            case "Region Four": {
                retval = waitForExpectedElement(regionFourCountries).getText();
                break;
            }
            case "Region Five": {
                retval = waitForExpectedElement(regionFiveCountries).getText();
                break;
            }
        }
        return retval;
    }

}

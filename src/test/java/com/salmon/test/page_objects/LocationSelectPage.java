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
    private By continueButton = By.className("js-continueButton btnN btnN3 proceed"); //js-continueButton btnN btnN3
    private By xContinueButton = By.xpath(".//*[@id='main']/div[1]/div[2]/a");
    private By deliveryInformation = By.className("deliverySnippet");
    private By regionOne = By.xpath(".//*[@id='main']/div[1]/ul/li[1]/h4/span");
    private By regionTwo = By.xpath(".//*[@id='main']/div[1]/ul/li[2]/h4/span");
    private By regionThree = By.xpath(".//*[@id='main']/div[1]/ul/li[3]/h4/span");
    private By regionFour = By.xpath(".//*[@id='main']/div[1]/ul/li[4]/h4/span");
    private By regionFive = By.xpath(".//*[@id='main']/div[1]/ul/li[5]/h4/span");

    private By regionOneCountries = By.xpath(".//*[@id='main']/div[1]/ul/li[1]");
    private By regionTwoCountries = By.xpath(".//*[@id='main']/div[1]/ul/li[2]");
    private By regionThreeCountries = By.xpath(".//*[@id='main']/div[1]/ul/li[3]");
    private By regionFourCountries = By.xpath(".//*[@id='main']/div[1]/ul/li[4]");
    private By regionFiveCountries = By.xpath(".//*[@id='main']/div[1]/ul/li[5]");

    private By countryOneRegionOne = By.xpath(".//*[@id='main']/div[1]/ul/li[1]/ul/li[1]/a");
    private By countryTwoRegionOne = By.xpath(".//*[@id='main']/div[1]/ul/li[1]/ul/li[2]/a");
    private By countryThreeRegionOne = By.xpath(".//*[@id='main']/div[1]/ul/li[1]/ul/li[3]/a");

    private By countryOneRegionTwo = By.xpath(".//*[@id='main']/div[1]/ul/li[2]/ul/li[1]/a");
    private By countryTwoRegionTwo = By.xpath(".//*[@id='main']/div[1]/ul/li[2]/ul/li[2]/a");

    private By countryOneRegionThree = By.xpath(".//*[@id='main']/div[1]/ul/li[3]/ul/li[1]/a");
    private By countryTwoRegionThree = By.xpath(".//*[@id='main']/div[1]/ul/li[3]/ul/li[2]/a");
    private By countryThreeRegionThree = By.xpath(".//*[@id='main']/div[1]/ul/li[3]/ul/li[3]/a");
    private By countryFourRegionThree = By.xpath(".//*[@id='main']/div[1]/ul/li[3]/ul/li[4]/a");

    //redundant
    private By countryTwoRegionFour = By.xpath(".//*[@id='main']/div[1]/ul/li[4]/ul/li[2]/a");
    private By countrySixRegionFour = By.xpath(".//*[@id='main']/div[1]/ul/li[4]/ul/li[6]/a");
    private By countryFourteenRegionFour = By.xpath(".//*[@id='main']/div[1]/ul/li[4]/ul/li[14]/a");
    private By countryEighteenRegionFour = By.xpath(".//*[@id='main']/div[1]/ul/li[4]/ul/li[18]/a");

    private By countryOneRegionFive = By.xpath(".//*[@id='main']/div[1]/ul/li[5]/ul/li[1]/a");
    private By countryTwoRegionFive = By.xpath(".//*[@id='main']/div[1]/ul/li[5]/ul/li[2]/a");
    private By countryThreeRegionFive = By.xpath(".//*[@id='main']/div[1]/ul/li[5]/ul/li[3]/a");
    private By countryFourRegionFive = By.xpath(".//*[@id='main']/div[1]/ul/li[5]/ul/li[4]/a");

    public void enterCountry(String country){
        waitForExpectedElement(countrySearch).sendKeys(country);
        waitForExpectedElement(countrySearch).sendKeys(Keys.RETURN);
    }
    public void clickContinue(){
        waitForExpectedElement(xContinueButton).click();
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
    public void clickCountry(String country){
        switch (country) {
            case "Country One Region One" : {
                waitForExpectedElement(countryOneRegionOne).click();
                break;
            }
            case "Country Two Region One" : {
                waitForExpectedElement(countryTwoRegionOne).click();
                break;
            }
            case "Country Three Region One" : {
                waitForExpectedElement(countryThreeRegionOne).click();
                break;
            }


            case "Country One Region Two" : {
                waitForExpectedElement(countryOneRegionTwo).click();
                break;
            }
            case "Country Two Region Two" : {
                waitForExpectedElement(countryTwoRegionTwo).click();
                break;
            }


            case "Country One Region Three" : {
                waitForExpectedElement(countryOneRegionThree).click();
                break;
            }
            case "Country Two Region Three" : {
                waitForExpectedElement(countryTwoRegionThree).click();
                break;
            }
            case "Country Three Region Three" : {
                waitForExpectedElement(countryThreeRegionThree).click();
                break;
            }
            case "Country Four Region Three" : {
                waitForExpectedElement(countryFourRegionThree).click();
                break;
            }
        }
    }
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

package com.salmon.test.page_objects;

import com.salmon.test.framework.PageObject;
import org.openqa.selenium.By;

/**
 * Created by tfasoyiro on 18/09/2015.
 */
public class CountrySelectPage extends PageObject {

    private String CountrySelectPageTitle = "Country Select - Selfridges | Shop Online";

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
    private By regionOneCountries = By.xpath(".//*[@id='main']/div[1]/ul/li[1]");
    private By regionTwoCountries = By.xpath(".//*[@id='main']/div[2]/ul/li[2]");
    private By regionThreeCountries = By.xpath(".//*[@id='main']/div[3]/ul/li[3]");
    private By regionFourCountries = By.xpath(".//*[@id='main']/div[4]/ul/li[4]");
    private By regionFiveCountries = By.xpath(".//*[@id='main']/div[5]/ul/li[5]");

    public void enterCountry(){

    }
    public void selectRegion(String region){

        switch (region){
            case "RegionOne": {
                waitForExpectedElement(regionOne).click();
                break;
            }
            case "RegionTwo": {
                waitForExpectedElement(regionTwo).click();
                break;
            }
            case "RegionThree": {
                waitForExpectedElement(regionThree).click();
                break;
            }
            case "RegionFour": {
                waitForExpectedElement(regionFour).click();
                break;
            }
            case "RegionFive": {
                waitForExpectedElement(regionFive).click();
                break;
            }
        }
    }



}

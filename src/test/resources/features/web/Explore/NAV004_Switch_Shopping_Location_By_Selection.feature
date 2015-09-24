@Explore
Feature: SWITCH SHOPPING LOCATION BY SELECTION - As a Selfridges website user,
  I want to switch my shopping location from on Country to another
  Scenario Outline: Select and Switch Shopping Location
    Given Selfridges Home Page
    When User Click Country Tab
    And User is taken to Location Preference Module
    And User Click "<Region>" and "<Country>"
    Then Shopping Location is Switched to Selected "<CountryCode>" "<Currency>" "<URL>"


    Examples:
      | Region | Country | CountryCode | Currency | URL |
      | Region One |Nigeria | NG | GBP | http://www.slfst2p.selfridges.com/NG/en/ |
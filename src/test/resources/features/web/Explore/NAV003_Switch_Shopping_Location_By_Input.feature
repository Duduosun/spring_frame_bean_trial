@Explore
Feature: SWITCH SHOPPING LOCATION BY INPUT - As a Selfridges website user,
  I want to switch my shopping location from on Country to another
  Scenario Outline: Select and Switch Shopping Location
    Given Selfridges Home Page
    When User Click Country Tab
    And User is taken to Location Preference Module
    And User Enter "<Country>"
    Then Shopping Location is Switched to Selected "<CountryCode>" "<Currency>" "<URL>"

    Examples:
      | Country | CountryCode | Currency | URL |
      | Nigeria | NG | GBP | http://www.slfst2p.selfridges.com/NG/en/ |











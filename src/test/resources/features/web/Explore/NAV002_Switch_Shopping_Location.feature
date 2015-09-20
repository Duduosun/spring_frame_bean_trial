@Explore
Feature: SWITCH SHOPPING LOCATION - As a Selfridges website user,
  I want to switch my shopping location from on Country to another
  Scenario Outline: Select and Switch Shopping Location
    Given Selfridges Home Page
    When User Click Country Tab
    And User is taken to Location Preference Module
    And Change to "<Country>"
    Then Shopping Location is Switched to Selected "<Country>" and "<Currency>" and "<URL>"

    Examples:
      | Country | Currency | URL |








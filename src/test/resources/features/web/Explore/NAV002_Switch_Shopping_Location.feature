@Explore
Feature: SWITCH SHOPPING LOCATION - As a Selfridges website user,
  I want to switch my shopping location from on Country to another
  Scenario Outline: Select and Switch Shopping Location
    Given Selfridges Home Page
    When User Navigate Country Tab
    And Navigate to Location Preference Module
    And Change to "<Country>"
    Then Country Tab is switched to "<Country>" and "<Currency>"

    Examples:
      | Country | Currency |






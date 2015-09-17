@Explore
  Feature: NAVIGATE COUNTRY - As a user of Selfridges website, I want access shopping from different Country
    Scenario Outline: Go to Location Module
      Given Selfridges Home Page
      When User Click Country Tab
      Then User is taken to Location Preference Module
      And User Can Interact with Location Preference Module "<Module>"

      Examples:
        | Module |



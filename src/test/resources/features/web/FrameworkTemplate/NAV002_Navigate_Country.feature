@FrameworkSmoke
  Feature: NAVIGATE COUNTRY - As a user of Selfridges website, I want to navigate to different Shopping Locations
    Scenario Outline: Selfridges Shopping Locations - Countries
      Given Selfridges Home Page
      When User Click Country Tab
      Then User is taken to Location Preference Module
      And User Can View Shopping Location "<Region>" and "<Country>"

      Examples:
        | Region | Country |
        | Region One | France |
        | Region Two | Canada |
#        | Region Three | Bahrain |
        | Region Three | Australia |
#        | Region Five | Mexico |
        | Region One | Germany |
        | Region Two | United States |
#        | Region Three | United Arab Emirates |
        | Region Three | Hong Kong |
#        | Region Five | Nigeria |

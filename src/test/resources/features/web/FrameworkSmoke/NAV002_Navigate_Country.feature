@FrameworkSmoke
  Feature: NAVIGATE COUNTRY - As a user of Selfridges website, I want to navigate to different Shopping Locations
    Scenario Outline: Selfridges Shopping Locations - Countries
      Given Selfridges Home Page
      When User Click Country Tab
      Then User is taken to Location Preference Module
      And User Can View Shopping Location "<Region>" and "<Country>"

      Examples:
        | Region | Country |
        | Region One | Austria |
        | Region Two | Canada |
        | Region Three | Bahrain |
        | Region Four | Australia |
        | Region Five | Mexico |
        | Region One | Sweden |
        | Region Two | United States |
        | Region Three | United Arab Emirates |
        | Region Four | Vietnam |
        | Region Five | Nigeria |

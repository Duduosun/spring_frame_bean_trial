@Desktop
  Feature: HOMEPAGE:- As a user of Selfridges website, I want to bulk navigate Selfridges home page UI
    Scenario Outline: Bulk Homepage Cosmetics Header and Footer RT060
      Given Selfridges Home Page
      When User Navigates Home Page
      Then User Can Interact with Header "<header>" and Footer "<footer>" entries

      Examples:
        |header  |footer|
        |HOME   ||
        |BEAUTY ||
        |MENS   ||
        |WOMENS ||
        |FOOD   ||
        |KIDS   ||
        |TECHNOLOGY ||
        |WHAT'S ON  ||

       # |HOME   |CUSTOMER SERVICES|
       # |BEAUTY |ABOUT SELFRIDGES|
       # |MENS   |STORE INFORMATION|
       # |WOMENS |HOW TO CONTACT US|
       # |FOOD   |How to shop|
       # |KIDS   |Our heritage|
       # |TECHNOLOGY |Manchester Trafford|
       # |CHRISTMAS  |How to contact our buyers|
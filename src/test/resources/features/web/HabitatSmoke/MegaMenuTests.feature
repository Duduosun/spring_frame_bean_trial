@FrameworkSmoke
  Feature: Verify if the megamenu and submenu exists on homepage
    Scenario Outline: Navigate Mega Menu Levels
      Given Habitat Home Page
      When User Navigates Home Page
      And User Navigate Mega Menu "<megamenu>"
      Then User Can Interact with Header "<header>" and Footer "<footer>" entries

      Examples:
        | megamenu | header | footer |
        |header  |footer| footer |
        |HOME   || footer |
        |BEAUTY || footer |
        |MENS   || footer |
        |WOMENS || footer |
        |FOOD   || footer |
        |KIDS   || footer |
        |TECHNOLOGY || footer |
        |WHAT'S ON  || footer |

       # |HOME   |CUSTOMER SERVICES|
       # |BEAUTY |ABOUT SELFRIDGES|
       # |MENS   |STORE INFORMATION|
       # |WOMENS |HOW TO CONTACT US|
       # |FOOD   |How to shop|
       # |KIDS   |Our heritage|
       # |TECHNOLOGY |Manchester Trafford|
       # |CHRISTMAS  |How to contact our buyers|

  Feature: Navigates to login page logs in and verifies if megamenu and submenu exists
    Scenario Outline: Login and Navigate Mega Menu Levels
        Given Habitat Home Page
        When User Click Account Head
        And Enter emailaddress "<emailaddress>" and password "<password>"
        And User Navigate Mega Menu "<megamenu>"
        Then User Can Interact with Header "<header>" and Footer "<footer>" entries

      Examples:
        | emailaddress | password | megamenu | header | footer |

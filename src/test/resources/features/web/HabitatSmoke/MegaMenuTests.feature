@FrameworkSmoke
  Feature: Verify if the megamenu and submenu exists on homepage
    Scenario Outline: Navigate Mega Menu Levels
      Given Habitat Home Page
      When User Navigates Home Page
      And Guest User Navigate Mega Menu "<megamenu>"
      Then User Can Interact with Header "<header>" and Footer "<footer>" entries

      Examples:
        | megamenu | header | footer |
        | MegaMenuOne |SIGN IN/REGISTER | Terms & Conditions |
        #|HOME   || footer |
        #|BEAUTY || footer |
        #|MENS   || footer |
        #|WOMENS || footer |
        #|FOOD   || footer |
        #|KIDS   || footer |
        #|TECHNOLOGY || footer |
        #|WHAT'S ON  || footer |

       # |HOME   |CUSTOMER SERVICES|
       # |BEAUTY |ABOUT SELFRIDGES|
       # |MENS   |STORE INFORMATION|
       # |WOMENS |HOW TO CONTACT US|
       # |FOOD   |How to shop|
       # |KIDS   |Our heritage|
       # |TECHNOLOGY |Manchester Trafford|
       # |CHRISTMAS  |How to contact our buyers|



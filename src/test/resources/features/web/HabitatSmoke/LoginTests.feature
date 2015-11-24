@HabitatSmoke
  Feature: To test if login works as expected. Navigates to login page, enters credentials, and logs in
  Scenario Outline: Sign In and Sign Out
  Given Habitat Home Page
    When User Click Account Head
    And Enter emailaddress "<emailaddress>" and password "<password>"
    Then User "<registereduser>" Successfully Access My Account
    When User Click Sign Out Option
    Then User is Successfuly Signed Out of My Account

    Examples:
      | emailaddress | password | registereduser |
      | reg1001@salmon.com | salmon01  | reg1001 |
      | reg1002@salmon.com | salmon02  | reg1002 |
      | reg1003@salmon.com | salmon03  | reg1003 |
      #| reg1004@salmon.com | salmon04  | reg1004 |
      | reg1005@salmon.com | salmon05  | reg1005 |


  @FrameworkSmoke
  Feature: Navigates to login page logs in and verifies if megamenu and submenu exists
    Scenario Outline: Login and Navigate Mega Menu Levels
      Given Habitat Home Page
      When User Click Account Head
      And Enter emailaddress "<emailaddress>" and password "<password>"
      And User Navigate Mega Menu "<megamenu>"
      Then User Can Interact with Header "<header>" and Footer "<footer>" entries

      Examples:
        | emailaddress | password | megamenu | header | footer |
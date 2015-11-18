@HabitatSmoke
  Feature: To test if login works as expected. Navigates to login page, enters credentials, and logs in
  Scenario Outline: Sign In and Sign Out
  Given Habitat Home Page
    When User Click Account Head
    And Enter emailaddress "<emailaddress>" and password "<password>"
    Then User Successfully Access My Account
    When User Click Sign Out Option
    Then User is Successfuly Signed Out of My Account

    Examples:
      | emailaddress | password |
      | reg1001@salmon.com | salmon01  |
      #| reg1002@salmon.com | salmon02  |
      #| reg1003@salmon.com | salmon03  |
      #| reg1004@salmon.com | salmon04  |
      #| reg1005@salmon.com | salmon05  |

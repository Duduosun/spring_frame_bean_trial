@FrameworkSmoke
  Feature: As a Selfridges Website User, I want to bulk Sign In and Sign Out
    Scenario Outline: Bulk Sign In and Sign Out RT002 and RT003
      Given Selfridges Home Page
      When User Click Account Head
      And Enter emailaddress "<emailaddress>" and password "<password>"
      Then User Successfully Access My Account
      When User Click Sign Out Option
      Then User is Successfuly Signed Out of My Account

  Examples:
        | emailaddress           | password  |
        | regauto1001@salmon.com | salmon01  |
        | regauto1002@salmon.com | salmon02  |
        | regauto1003@salmon.com | salmon03  |
        | regauto1004@salmon.com | salmon04  |
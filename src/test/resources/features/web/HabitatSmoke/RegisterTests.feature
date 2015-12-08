@HabitatSmoke
Feature: Test if registration works as expected by navigating to homepage, clicking on registration,
         filling form, signing up newsletters and registering. Use the registered email and verify login.
Scenario Outline: testRegister - Register New Users
  Given Habitat Home Page
  When User Click Account Head
  And Click Create An Account
  And User Enter title "<title>" firstname "<firstname>" lastname "<lastname>" emailaddress "<emailaddress>" password "<password>" mobile "<mobile>"
  Then User Successfully Access My Account
  And User Session "<firstname>" is active

  Examples:
    | title | firstname | lastname | emailaddress | password | mobile |
    #| Mr    | regauto1001 | Salmon   | regauto1001@salmon.com | salmon01 |01001001001 |
    #| Miss  | regauto1002 | Salmon   | regauto1002@salmon.com | salmon02 |01002001002 |
    #| Mrs   | regauto1003 | Salmon   | regauto1003@salmon.com | salmon03 |01003001003 |
    | Ms    | regauto1004 | Salmon   | regauto1004@salmon.com | salmon04 |01004001004 |
    | Mr    | regauto1005 | Salmon   | regauto1005@salmon.com | salmon05 |01005001005 |
    | Miss  | regauto1006 | Salmon   | regauto1006@salmon.com | salmon06 |01006001006 |
    #| Mrs   | regauto1007 | Salmon   | regauto1007@salmon.com | salmon07 |01007001007 |
    #| Ms    | regauto1008 | Salmon   | regauto1008@salmon.com | salmon08 |01008001008 |
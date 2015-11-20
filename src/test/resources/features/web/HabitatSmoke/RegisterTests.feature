@HabitatSmoke
Feature: Test if registration works as expected by navigating to homepage, clicking on registration,
         filling form, signing up newsletters and registering. Use the registered email and verify login.
Scenario Outline: Register New Users
  Given Habitat Home Page
  When User Click Account Head
  And Click Create An Account
  And User Enter title "<title>" firstname "<firstname>" lastname "<lastname>" emailaddress "<emailaddress>" password "<password>"
  Then User Successfully Access My Account
  And User Session "<firstname>" is active

Examples:
| title | firstname   | lastname | emailaddress 		| password |
#| Mr    | regauto1001 | Salmon   | regauto1001@salmon.com | salmon01 |
#| Mr    | regauto1002 | Salmon   | regauto1002@salmon.com | salmon02 |
#| Mr    | regauto1003 | Salmon   | regauto1003@salmon.com | salmon03 |
#| Mr    | regauto1004 | Salmon   | regauto1004@salmon.com | salmon04 |
#| Ms    | fmo2706 | Salmon   | fmo2706@salmon.com | salmon06 |
#| Miss  | fmo2707 | Salmon   | fmo2707@salmon.com | salmon07 |
#| Dr    | fmo2708 | Salmon   | fmo2708@salmon.com | salmon08 |
#| Mr    | fmo2709 | Salmon   | fmo2709@salmon.com | salmon09 |
#| Mrs   | fmo2710 | Salmon   | fmo2710@salmon.com | salmon10 |
#| Ms    | regauto1020 | Salmon   | regauto1020@salmon.com | salmon20 |

#| Mrs   | fmo2701 | Salmon   | fmo2701@salmon.com | salmon01 |
#| Ms    | fmo2702 | Salmon   | fmo2702@salmon.com | salmon02 |
#| Miss  | fmo2703 | Salmon   | fmo2703@salmon.com | salmon03 |
#| Mrs   | fmo2704 | Salmon   | fmo2704@salmon.com | salmon04 |
#| Mrs   | fmo2705 | Salmon   | fmo2705@salmon.com | salmon05 |
#| Mr    | fmo2706 | Salmon   | fmo2706@salmon.com | salmon06 |
#| Miss  | fmo2707 | Salmon   | fmo2707@salmon.com | salmon07 |
#| Dr    | fmo2708 | Salmon   | fmo2708@salmon.com | salmon08 |
#| Mr    | fmo2709 | Salmon   | fmo2709@salmon.com | salmon09 |

| Mrs   | fmo2710 | Salmon   | fmo2710@salmon.com | salmon10 |
| Mrs   | fmo2711 | Salmon   | fmo2711@salmon.com | salmon11 |
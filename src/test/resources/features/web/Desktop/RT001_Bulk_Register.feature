@Desktop
Feature: BULK REGISTER:- As Selfridges website user, I want to bulk register from Selfridges home page
Scenario Outline: Bulk Register new users from homepage RT001
  Given Selfridges Home Page
  When User Click Account Head
  And User Enter title "<title>" firstname "<firstname>" lastname "<lastname>" emailaddress "<emailaddress>" password "<password>"
  Then User Successfully Access My Account

Examples:
| title | firstname   | lastname | emailaddress 		| password |
#| Mr    | fmo2704 | Salmon   | fmo2704@salmon.com | salmon04 |
#| Mrs   | fmo2705 | Salmon   | fmo2705@salmon.com | salmon05 |
| Ms    | fmo2706 | Salmon   | fmo2706@salmon.com | salmon06 |
#| Miss  | fmo2707 | Salmon   | fmo2707@salmon.com | salmon07 |
#| Dr    | fmo2708 | Salmon   | fmo2708@salmon.com | salmon08 |
#| Mr    | fmo2709 | Salmon   | fmo2709@salmon.com | salmon09 |
#| Mrs   | fmo2710 | Salmon   | fmo2710@salmon.com | salmon10 |
#| Ms    | regauto1020 | Salmon   | regauto1020@salmon.com | salmon20 |
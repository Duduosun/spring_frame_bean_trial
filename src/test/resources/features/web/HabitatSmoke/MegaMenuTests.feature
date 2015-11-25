@FrameworkSmoke
  Feature: Verify if the megamenu and submenu exists on homepage,
           Navigates to login page logs in and verifies if megamenu and submenu exists
    Scenario Outline: Navigate Mega Menu Levels
      Given Habitat Home Page
      When User Navigates Home Page
      And Guest User Navigate Mega Menu "<megamenu>"
      Then User Can Interact with Header "<header>" and Footer "<footer>" entries

      Examples:
        | megamenu | header | footer |
        | MegaMenuOne | Sofas & Armchairs | Terms & Conditions |
        | MegaMenuTwo | Furniture| Buying Guides |
        | MegaMenuThree | Sale | Delivery & Returns |
        #|MegaMenuFour | Accessories | How Can We Help |
        #|MegaMenuFive | Lighting | Sign Up for Habitat news |
        #|MegaMenuSix | Kitchen | Soft Furnishing |
        #|MegaMenuSeven | Soft Furnishing | Careers |
        #|MegaMenuEight | Our Habitat | Follow Us |

    #Feature:
    Scenario Outline: Login and Navigate Mega Menu Levels
      Given Habitat Home Page
      When User Click Account Head
      And Enter emailaddress "<emailaddress>" and password "<password>"
      And Registered User Navigate Mega Menu "<megamenu>"
      Then User Can Interact with Header "<header>" and Footer "<footer>" entries

      Examples:
        | emailaddress | password | megamenu | header | footer |
        | regauto1001@salmon.com | salmon01 | MegaMenuOne | Sofas & Armchairs | Store Locator |
        | regauto1002@salmon.com | salmon02 | MegaMenuTwo | Furniture | FAQ |
        | regauto1003@salmon.com | salmon03 | MegaMenuThree | Sale | Press Centre |

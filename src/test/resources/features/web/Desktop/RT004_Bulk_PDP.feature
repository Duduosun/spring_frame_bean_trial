@FrameworkSmoke
  Feature: BULK PDP:- As Selfridges Customer, I want to navigate multiple PDP Pages
    Scenario Outline: PDP RT004
      Given Selfridges Home Page
      When User Navigate Mega Menu "<megamenu>"
      And User Click Product "<product>"
      Then PDP Feature is displayed with Productname "<productname>"

      Examples:
        | megamenu | product | productname |
        | MegaMenuOne | ProductOne | CHRISTMAS |
        | MegaMenuTwo | ProductTwo | DIOR |
       # | MegaMenuThree | ProductThree  |  | # MEN Category is empty
       # | MegaMenuFour | ProductFour  |  |   # WOMEN Category is empty
        | MegaMenuFive |ProductFive  | JELLY BELLY |
        | MegaMenuSix | ProductTen | RUARK AUDIO |
        | MegaMenuSeven | ProductTwelve  | APPLE |
       # | MegaMenuEight | ProductTwentySeven |  |  # WHAT'S ON Category is empty
       # | MegaMenuNine | ProductThirty |  |


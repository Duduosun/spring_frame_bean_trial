@FrameworkSmoke
  Feature: SEARCH BUNDLE VIA PRODUCT - As a Selfridges website user, I want to search bundled products
    Scenario Outline: : Search and Return PLP then Bundled Page
      Given Selfridges Home Page
      When User Search Selfridges "<searchstring>"
      And User Click Product "<product>"
      Then Bundle Feature is displayed with Bundle X "<bundlex>" and Bundle Y "<bundley>"

      Examples:
        | searchstring | product | bundlex | bundley |
        | juicy couture tracksuit | ProductOne | JUICY COUTURE | JUICY COUTURE |
        | bikini | ProductFive | MELISSA ODABASH | MELISSA ODABASH |
        | kids couture | ProductThree | JUICY COUTURE  | JUICY COUTURE |
        | Fantasie | ProductOne | FANTASIE  | FANTASIE |

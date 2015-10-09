@FrameworkSmoke
  Feature: SEARCH BUNDLE DIRECT - As a Selfridges website user, I want to search bundled products
    Scenario Outline: : Search and Return Bundle Page
      Given Selfridges Home Page
      When User Search Selfridges "<searchstring>"
      Then Bundle Feature is displayed with Bundle X "<bundlex>" and Bundle Y "<bundley>"

      Examples:
        | searchstring | bundlex | bundley |
        | Costa Rica | HEIDI KLEIN | HEIDI KLEIN |
        | rainbow couture | JUICY COUTURE | JUICY COUTURE |
@ExploreSmokeREM
  Feature: SEARCH BUNDLE - As a Selfridges website user, I want to search bundled products
    Scenario Outline: : Search for Bundled Products
      Given Selfridges Home Page
      When User Search Selfridges "<searchstring>"
      And User Click Product "<product>"
      Then Bundle Feature is displayed with Bundle X "<bundlex>" and Bundle Y "<bundley>"

      Examples:
        | searchstring | product | bundlex | bundley |



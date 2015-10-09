@InProgress
  Feature: ADD TO BAG - As a Selfridges website user, I want to populate my shopping bag
    Scenario Outline: Add to Bag via Top Level Navigation
      Given Selfridges Home Page
      When User Navigate Mega Menu "<megamenu>"
      And User Click Product "<product>"
      And User Click Add To Bag
      Then Shopping Bag is Populated with Product"<productname>"

      Examples:
        | megamenu | product | productname |

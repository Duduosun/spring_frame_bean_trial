@ExploreSmokeREM
Feature: SEARCH PRODUCT - As a Selfridges website user, I want to search products
  Scenario Outline: : Search for Products
    Given Selfridges Home Page
    When User Search Selfridges "<searchstring>"
    And User Click Product "<product>"
    Then PDP Feature is displayed with Productname "<productname>"

    Examples:
      | searchstring | product | productname |


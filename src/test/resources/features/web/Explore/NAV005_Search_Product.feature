@ExploreSmoke
Feature: SEARCH PRODUCT - As a Selfridges website user, I want to search products
  Scenario Outline: : Search and Return PLP then PDP
    Given Selfridges Home Page
    When User Search Selfridges "<searchstring>"
    And User Click Product "<product>"
    Then PDP Feature is displayed with Productname "<productname>"

    Examples:
      | searchstring | product | productname |
      | Coffee | ProductOne | EDINBURGH TEA & COFFEE COMPANY |
      | IPHONE | ProductTwo | TED BAKER |
      | georg jensen | ProductTwelve | GEORG JENSEN |


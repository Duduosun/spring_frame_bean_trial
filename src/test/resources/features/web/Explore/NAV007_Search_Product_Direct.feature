@ExploreSmoke
Feature: SEARCH PRODUCT - As a Selfridges website user, I want to search products directly by SKU/BRAND
  Scenario Outline: : Search and Return PDP
    Given Selfridges Home Page
    When User Search Selfridges "<searchstring>"
    Then PDP Feature is displayed with Productname "<productname>"

    Examples:
      | searchstring | productname |
      | 67903894 | LONGCHAMP |
      | 12690787 | MULBERRY |
      | VICTORIA BECKHAM | NAILS INC |

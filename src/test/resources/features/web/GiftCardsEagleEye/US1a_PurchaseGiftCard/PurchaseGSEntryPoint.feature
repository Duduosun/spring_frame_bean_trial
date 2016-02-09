@EagleEye
  Feature: As a customer I want to be able to purchase a Habitat digital gift card, so I can give a present to family,
    friends, or to myself, to buy Habitat goods online
  Scenario: Gift Card Purchase Entry Point
    Given Habitat Home Page
    Then User can see Eagle Eye Link in Footer
    When User click Eagle Eye Link
    Then New Tab Window is open with Eagle Eye white label site


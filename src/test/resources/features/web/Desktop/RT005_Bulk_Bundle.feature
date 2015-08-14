@Desktop
  Feature: BULK Bundle:- As Selfridges Customer, I want to navigate multiple Bundle Pages
    Scenario Outline: Bundle RT005
      Given Selfridges Home Page
      When User Navigate Mega Menu "<megamenu>"
      And User Click Product "<product>"
      Then Bundle Feature is displayed with Bundle X "<bundlex>" and Bundle Y "<bundley>"


      Examples:
        | megamenu | product | bundlex | bundley |
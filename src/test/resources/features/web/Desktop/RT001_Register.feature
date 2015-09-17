@Desktop
Feature: REGISTER:- As a new user of Selfridges website, I want to register from Selfridges home page
  Scenario: Register as new user from homepage RT001
    Given Selfridges Home Page
    When User Click Account Head
    And User Complete Registration
    Then User Successfully Access My Account
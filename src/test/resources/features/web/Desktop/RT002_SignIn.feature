@Desktop
Feature: SIGN IN:- As a registered user of Selfridges, I want to sign in from Selfridges home page
  Scenario: Sign in from homepage RT002
    Given Selfridges Home Page
    When User Click Account Head
    And User Enters Username and Password
    Then User Successfully Access My Account
@sproduct
Feature: Audi Product Details Page - Category and Search
  As a customer
  I want to see the details for the product I am interested in
  So that I can decide whether it is the product I want

  Background:
    Given AUDI Ecommerce Page

  Scenario Outline: Navigate Simple Product
    When User Click Top Level "<tcat>" CTA
    And User Click Simple Product "<eproduct>"
    Then Audi PDP is Displayed with "<eproduct>"

    Examples:
      | tcat | eproduct |
      | Accessories | Audi mini quattro, red |
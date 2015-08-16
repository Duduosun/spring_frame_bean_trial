@Explore
  Feature: REGISTRATION VALIDATION:- As a user, I want to assert validation of the User Registration Form
    Scenario Outline: Customer Registration Form Validation
      Given Selfridges Home Page
      When User Click Account Head
      And User Enter title "<title>" firstname "<firstname>" lastname "<lastname>" emailaddress "<emailaddress>" password "<password>"
      Then Validation message "<validation_message>" is displayed

      Examples:
        | title | firstname | lastname | emailaddress | password | validation_message |
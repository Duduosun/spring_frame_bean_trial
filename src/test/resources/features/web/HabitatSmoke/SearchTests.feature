@FrameworkSmoke
Feature: SEARCH WORD AND PHRASE - As a Habitat website user, I want to search
  Scenario Outline: Search Word and Phrase
    Given Habitat Home Page
    When User Search Habitat "<searchstring>"
    Then Search Result contains "<word>" and "<phrase>"

    Examples:
      | searchstring | word | phrase |
      | TV | stand | AV unit |
      | COFFEE | cafetiere | coffee table |
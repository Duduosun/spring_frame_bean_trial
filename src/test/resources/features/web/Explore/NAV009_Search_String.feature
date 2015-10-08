@ExploreSmoke
Feature: SEARCH WORD AND PHRASE - As a Selfridges website user, I want to search
  Scenario Outline: Search Word and Phrase
    Given Selfridges Home Page
    When User Search Selfridges "<searchstring>"
    Then Search Result contain "<word>" and "<phrase>"

    Examples:
      | searchstring | word | phrase |
      | tv | connect | full hd |
      | coffee | capuccino | ground coffee |
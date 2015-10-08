@ExploreSmokeREM
Feature: SEARCH WORD AND PHRASE - As a Selfridges website user, I want to search
  Scenario Outline: Search Word and Phrase
    Given Selfridges Home Page
    When User Search Selfridges "<searchstring>"
    Then Search Result contain "<word>" and "<phrase>"

    Examples:
      | searchstring | word | phrase |
      | coffee | espresso | coffee grinder |
      | coffee | capuccino | ground coffee |
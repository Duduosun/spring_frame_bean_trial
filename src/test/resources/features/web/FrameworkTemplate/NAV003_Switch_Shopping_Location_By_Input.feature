@FrameworkSmoke
Feature: SWITCH SHOPPING LOCATION BY INPUT - As a Selfridges website user,
  I want to switch my shopping location from on Country to another
  Scenario Outline: Select and Switch Shopping Location
    Given Selfridges Home Page
    When User Click Country Tab
    And User is taken to Location Preference Module
    And User Enter "<Country>"
    Then Shopping Location is Switched to Selected "<CountryCode>" "<Currency>" "<URL>"

    Examples:
      | Country | CountryCode | Currency | URL |
      | France | FR | EUR | http://www.slfst2p.selfridges.com/FR/en/ |
      | Germany | DE | EUR | http://www.slfst2p.selfridges.com/DE/en/ |
      | United Kingdom | GB | GBP | http://www.slfst2p.selfridges.com/GB/en/ |
      | Canada | CA | CAD | http://www.slfst2p.selfridges.com/CA/en/ |
      | United States | US | USD | http://www.slfst2p.selfridges.com/US/en/ |
      | Australia | AU | AUD | http://www.slfst2p.selfridges.com/AU/en/ |
      | China | CN | CNY | http://www.slfst2p.selfridges.com/CN/en/ |
      | Hong Kong | HK | HKD | http://www.slfst2p.selfridges.com/HK/en/ |
      | Singapore | SG | SGD | http://www.slfst2p.selfridges.com/SG/en/ |
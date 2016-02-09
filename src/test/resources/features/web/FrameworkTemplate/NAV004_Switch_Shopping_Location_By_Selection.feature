@FrameworkSmoke
Feature: SWITCH SHOPPING LOCATION BY SELECTION - As a Selfridges website user,
  I want to switch my shopping location from on Country to another
  Scenario Outline: Select and Switch Shopping Location
    Given Selfridges Home Page
    When User Click Country Tab
    And User is taken to Location Preference Module
    And User Click "<Region>" and "<Country>"
    Then Shopping Location is Switched to Selected "<CountryCode>" "<Currency>" "<URL>"


    Examples:
      | Region | Country | CountryCode | Currency | URL |
      | Region One |Country One Region One | FR | EUR | http://www.slfst2p.selfridges.com/FR/en/ |
      | Region One |Country Two Region One | DE | EUR | http://www.slfst2p.selfridges.com/DE/en/ |
      | Region One |Country Three Region One | GB | GBP | http://www.slfst2p.selfridges.com/GB/en/ |

      | Region Two | Country One Region Two | CA | CAD | http://www.slfst2p.selfridges.com/CA/en/ |
      | Region Two | Country Two Region Two | US | USD | http://www.slfst2p.selfridges.com/US/en/ |

      | Region Three | Country One Region Three | AU | AUD | http://www.slfst2p.selfridges.com/AU/en/ |
      | Region Three | Country Two Region Three | CN | CNY | http://www.slfst2p.selfridges.com/CN/en/ |
      | Region Three | Country Three Region Three | HK | HKD | http://www.slfst2p.selfridges.com/HK/en/ |
      | Region Three | Country Four Region Three | SG | SGD | http://www.slfst2p.selfridges.com/SG/en/ |
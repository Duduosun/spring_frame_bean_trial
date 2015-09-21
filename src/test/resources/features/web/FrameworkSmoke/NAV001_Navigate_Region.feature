@FrameworkSmoke
  Feature: NAVIGATE REGION - As a user of Selfridges website, I want navigate to all shopping Regions
    Scenario Outline: Selfridges Shopping Regions
      Given Selfridges Home Page
      When User Click Country Tab
      Then User is taken to Location Preference Module
      And User Can Interact with Location Preference Module "<Region>" and "<RegionText>"

      Examples:
        | Region | RegionText |
        | Region One | UK & Europe |
        | Region Two | United States & Canada |
        | Region Three | Middle East |
        | Region Four | Asia Pacific |
        | Region Five | Rest of the World |


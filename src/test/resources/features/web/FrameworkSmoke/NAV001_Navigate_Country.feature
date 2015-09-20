@FrameworkSmoke
  Feature: NAVIGATE COUNTRY - As a user of Selfridges website, I want access shopping from different Country
    Scenario Outline: Go to Location Module
      Given Selfridges Home Page
      When User Click Country Tab
      Then User is taken to Location Preference Module
      And User Can Interact with Location Preference Module "<Module>" and "<ModuleText>"

      Examples:
        | Module | ModuleText |
        | Region One | UK & Europe |
        | Region Two | United States & Canada |
        | Region Three | Middle East |
        | Region Four | Asia Pacific |
        | Region Five | Rest of the World |


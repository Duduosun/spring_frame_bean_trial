@Explore
Feature: SWITCH SHOPPING LOCATION - As a Selfridges website user,
  I want to switch my shopping location from on Country to another
Given Selfridges Home Page
When User Navigates Country
And Change Location Preference
Then New Country Flag and Currency is applied
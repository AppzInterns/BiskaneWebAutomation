Feature: Biskane Home Page
  
Scenario: Validate Home Page
Given I verify homepage is visible
Then  I verify homepage title is as expected
Then I verify logo is visible


Scenario: Validate shop feature
Given user is on homepage of biskane
When I hover on the shop link
Feature: practice automation form

Scenario: Free form

Given user is already on Page
When title form page is free form
Then user enters "<username>" and "<password>"
Then user clicks on simple button
Then Close the browser




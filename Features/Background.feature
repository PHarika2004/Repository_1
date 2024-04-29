Feature: Test Background Feature
DEscription: The purpose of the feature is to test the Background keyword.

Background: User is Logged In
Given I navigate to the login page
When I submit username and password
Then I should be Logged in

Scenario: Search a product and the first product to the basket
Given User search for Lenevo Laptop
When Add the first laptop that appears in the search result to the basket
Then User basket should display with added items
 
  
  Scenario: Navigate to a product and the same to the user basket
  Given User navigate for Lenevo Laptop
  When Add the Laptop to the basket
  Then User basket should dispaly with added item
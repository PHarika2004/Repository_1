
Feature: Tag example Demo
@Smoke
Scenario: Example 1
    Given user opens login page
    When user enters valid data
    And click on login 
    Then user login successfully
    
@Sanity
    |Scenario: Example 2
    Given user opens login page
    When user enters valid data
    And click on login 
    Then user login successfully
    
    @Smoke
   Scenario: Example 3
    Given user opens login page
    When user enters valid data
    And click on login 
    Then user login successfully
    
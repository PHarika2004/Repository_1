
Feature: to Test the login Functionality

  Scenario: to Test hte Functionality with valid data
    Given user is on login page
    When user enters username and password
    And Click on login button
    Then user should navigate to homepage   
  
  
  Scenario Outline: to Test the Functionality with valid data
    Given user is on login page
    When user enters username as "<un>" and password as "<pass>"
    And Click on login button
    Then user should navigate to homepage  
    
    
    Scenario: To test logout functionality
    Given user is on home page
    When Click on profile
    And Click on logout
    Then user should navigate to the login page
  
  Examples:
  |un|pass|
  |Admin|admin123|
  |abc@gmail.com|abc@123|
  |def@gmail.com|def123|
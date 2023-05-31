@login
Feature: Login Validation

  Scenario: Validate whether user can able to Login With proper credentials 
    Given Initialize the Browser
    And Launches the Appication 
    When User Tries to Login with proper credentials
    And validate user is presented in home page

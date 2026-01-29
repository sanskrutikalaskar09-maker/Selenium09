Feature: Swag Labs Login Functionality

Background:
  Given chrome browser is open
  And user is on login page

@validCredentials
Scenario: Login is successful with valid credentials
  When user enters "standard_user" and "secret_sauce"
  And user clicks on login
  Then user is navigated to home page

@missingUser
Scenario: Login fails with missing username
  When user enters "" and "secret_sauce"
  And user clicks on login
  Then error message is displayed

@web
Feature: Test Automation Web UI

  @valid-sign-up
  Scenario: Sign up with input the same username and password
    Given user is on home page
    When user click Sign Up menu
    Then user see sign up form
    And user input username in sign up form
    And user input password in sign up form
    When user click Sign Up button
    Then user get alert "Sign up successful."

  @invalid-sign-up
  Scenario: Sign up with username and password registered
    Given user is on home page
    When user click Sign Up menu
    Then user see sign up form
    And user input username with "new" in sign up form
    And user input password with "new" in sign up form
    When user click Sign Up button
    Then user get alert "This user already exist."
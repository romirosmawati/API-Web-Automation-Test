@web
Feature: Test Automation Web UI

  @valid-login
  Scenario: Log in using valid username and password
    Given user is on home page
    When user click Log In menu
    Then user see login form
    And user input username with "tes" in login form
    And user input password with "tes" in login form
    When user click Log in button
    Then user is logged in with name "tes"

  @invalid-login
  Scenario: Log in using username and invalid password
    Given user is on home page
    When user click Log In menu
    Then user see login form
    And user input username with "tes" in login form
    And user input password with "pass" in login form
    When user click Log in button
    Then user get alert "Wrong password."
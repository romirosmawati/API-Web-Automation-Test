@web
Feature: Test Automation Web UI

  @logout
  Scenario: Logout User
    Given user is on home page
    When user click Log In menu
    Then user see login form
    And user input username with "tes" in login form
    And user input password with "tes" in login form
    When user click Log in button
    Then user is logged in with name "tes"
    Then user click Log Out menu
    Then user is logged out
@web
Feature: Test Automation Web UI

  @about
  Scenario: About Us Menu
    Given user is on home page
    When user click About us menu
    Then user see About us modal
    And user play the video
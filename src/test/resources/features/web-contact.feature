@web
Feature: Test Automation Web UI

  @contact
  Scenario: Contact Menu
    Given user is on home page
    Then user click Contact menu
    And user input contact email with "this is email"
    And user input contact name with "this is name"
    And user input contact message with "this is message"
    When user click Send Message button
    Then user get alert "Thanks for the message!!"
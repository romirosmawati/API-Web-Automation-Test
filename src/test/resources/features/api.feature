@api
Feature: Test Automation Rest API

  @api
  Scenario: Test Get All Users
    Given prepare url
    And hit api to get all users
    Then validation status code is equal to 200
    Then validation response json with JSONSchema "allUsers.json"

  @api
  Scenario: Test get user by id normal
    Given prepare url
    And hit api post create new user
    Then validation status code is equal to 201
    Then validation response body post for get user ID
    Then prepare url for get user by ID
    And hit api get user by id
    Then validation status code is equal to 200
    Then validation response json with JSONSchema "users.json"

  @api
  Scenario: Test Create User
    Given prepare url
    And hit api post create new user
    Then validation status code is equal to 201
    Then validation response json with JSONSchema "users.json"

  @api
  Scenario: Test Update User
    Given prepare url
    And hit api post create new user
    Then validation status code is equal to 201
    Then validation response body post for get user ID
    Then prepare url for get user by ID
    And hit api to update data user by user ID
    Then validation status code is equal to 200
    Then validation response json with JSONSchema "users.json"

  @api
  Scenario: test Patch User
    Given prepare url
    And hit api post create new user
    Then validation status code is equal to 201
    Then validation response body post for get user ID
    Then prepare url for get user by ID
    And hit api to patch data user by user ID
    Then validation status code is equal to 200
    Then validation response json with JSONSchema "users.json"

  @api
  Scenario: Test Delete User
    Given prepare url
    And hit api post create new user
    Then validation status code is equal to 201
    Then validation response body post for get user ID
    Then prepare url for get user by ID
    And hit api delete user
    Then validation status code is equal to 204


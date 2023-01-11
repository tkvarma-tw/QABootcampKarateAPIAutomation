@createUser
Feature: Create multiple users

  Scenario Outline: Verify CreateUsers api for multiple users
    Given url "https://reqres.in/api/users"
    And request read('<payloadFileName>')
    When method POST
    Then status 201
    And print "user id is "+response.id

    Examples:
      | payloadFileName                            |
      | classpath:resources/jsons/createUserPayload.json |
      | classpath:resources/jsons/createUserPayloadTwo.json                  |
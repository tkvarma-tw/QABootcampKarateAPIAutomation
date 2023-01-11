Feature: Test API
  Scenario: test API
    Given url "https://reqres.in/api/users?page=2"
    When method GET
    Then status 200
    And print response.data[0].email
    And assert response.data[0].email == "michael.lawson@reqres.in"
Feature: hello world

  Background:
    * url baseUrl
    * def endpoint = '/hello-world'

  Scenario: Get 'hello world'

    Given path endpoint
    When method GET
    Then status 200
    Then match response == 'Hello, World!'

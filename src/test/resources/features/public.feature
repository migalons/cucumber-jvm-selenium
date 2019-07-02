Feature: Public site


  Scenario: Login
    Given a user at public page
    When he introduces wrong credentials
    Then he gets an alert message





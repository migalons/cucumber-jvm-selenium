Feature: Public site


  Scenario: Login
    Given a user at public page
    When he introduces wrong credentials
    Then he gets an alert message


  Scenario: Recover credentials
    Given a user who wants to recover her credentials
    When she introduces wrong credentials
    Then she gets an alert message







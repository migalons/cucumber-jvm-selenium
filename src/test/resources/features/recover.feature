Feature:


  Scenario: Recover credentials
    Given a user who wants to recover her credentials
    When she introduces wrong credentials
    Then she gets an alert message
Feature: AddEmployee Functionality

  @addemployee
  Scenario: Adding employee from admin account
    Given user is on login page
    Then user login in with username "nikhil.pachipala@optimworks.com" and password "12345678"
    And verify user is landed on to the urBuddi dashboard
    And user click on employee and Add new employee details
    Then user log out and redirected back to Login page.



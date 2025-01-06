Feature: Add Employee Details
@AddemployeeUsingDataTables
  Scenario: Adding valid Employee details
    Given user logs in with username "nikhil.pachipala@optimworks.com" and password "12345678"
    Then verify that the application navigates to the dashboard
    When user click to add the employee details with the following data:
      | key           | value                           |
      | firstName     | Test                            |
      | empLastName   | User                            |
      | employeeid    | OW6ht                           |
      | emailId       | MHAt@mail.com                   |
      | EmpRole       | Employee                        |
      | password      | Chandu@0513                     |
      | dob           | 13-05-2000                      |
      | JOD           | 13-11-2023                      |
      | Qualification | B.Tech                          |
      | department    | Testing                         |
      | gender        | Male                            |
      | PhoneNo       |                      1234567890 |
      | BloodGroup    | B-                              |
      | designation   | Employee                        |
      | salary        |                           10000 |
      | location      | Hyderabad                       |
      | reportingTo   | nikhil.pachipala@optimworks.com |
      | certification | #Checkboxes handled in code     |
    And user click on submit details
    Then verify the user can search the added employee with the employeeid "OW6ht"

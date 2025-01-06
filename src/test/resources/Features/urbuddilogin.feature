Feature: Feature to test the urBuddi Login Page

  @smoke
  Scenario: Successful login with valid credentials
    Given user is on the login page
    When user enters a valid username "nikhil.pachipala@optimworks.com" and password "12345678"
    And clicks the login button
    Then user is navigated to the home page
    And user close the browser
    
   
  Scenario: Unsuccessful login with invalid credentials
    Given user is on the login page
    When user enters a invalid username "nikhil.pachipala@optiworks.com" and password "1234678"
    And clicks the login button
    Then user should see an error message 
    And user close the browser
    
    
    
    
    
    
  

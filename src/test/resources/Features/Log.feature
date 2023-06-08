
Feature: Validation of facebook login
 
  Scenario: validate the login using credentials
    And Open the Application 
    When enter the username and valid password
    |karthikeyan|123685649|
    |8015191938|karthikeyan|
    Then TakeScreenshot "Attempt1"
    And close the window
    
    
 		
   Scenario: validate the login using credentials
    And Open the Application 
    When enter the username and valid password
    |8015191938|karthikeyan|
    |karthikeyan|karthikeyan|
    Then TakeScreenshot "Attempt2"
    And close the window
   

 
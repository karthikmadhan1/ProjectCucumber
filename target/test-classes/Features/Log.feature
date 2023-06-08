
Feature: Validation of facebook login
 
  Scenario: validate the login using credentials
    And Open the Application 
    When enter the username and valid password
    |karthikeyan|123685649|
    |8015191938|karthikeyan|
    Then TakeScreenshot "Attempt1"
    
    
 		
   Scenario: validate the login using credentials
    And Open the Application 
    When enter the username and valid password
    |123685649|karthikeyan|
    |karthikeyan|8015191938|
    Then TakeScreenshot "Attempt2"
   

 
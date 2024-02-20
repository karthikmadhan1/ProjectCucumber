Feature: Validation of facebook login

Background:
 Given  Open the Application 
 @smoke
  Scenario: validate the login using valid credentials
   
    When enter the valid username and valid password
    |karthikeyan|123685649|
    |8015191938|karthikeyan|
    Then TakeScreenshot "Attempt1"
   	And close the browser
   
   @reg
   Scenario: validate the login using invalid credentials
    When enter the valid username and invalid password
    |8015191938|karthikeyan|
    |karthikeyan|karthikeyan|
    Then TakeScreenshot "Attempt2"
   	And close the browser

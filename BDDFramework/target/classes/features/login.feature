Feature: Test Login feature
Scenario: Verify login with invalid credentials
Given Launch application url  
When user enters the 100 and 200
And click on login button
Then user will be able to login to the application 
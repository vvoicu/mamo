Feature: Verify login functionality 

@login 
Scenario: Login to matches fashion iOS app with invalid credentials and invalid message
	Given I allow application Notifications 
	Given I submit default settings 
	When I go to the Sign In page 
	And I perform the login with 'mfautotest+3001@gmail.com' and 'Testing89' 
	Then the login warning message should be 'Please enter a valid email address.' 
	
@login 
Scenario: Login to matches fashion iOS app with invalid credentials 
	Given I allow application Notifications 
	Given I submit default settings 
	When I go to the Sign In page 
	And I perform the login with 'mfautotest+3001@gmail.com' and 'Testing89' 
	Then the login warning message should be 'You have entered incorrect details for email address or password, or both.' 
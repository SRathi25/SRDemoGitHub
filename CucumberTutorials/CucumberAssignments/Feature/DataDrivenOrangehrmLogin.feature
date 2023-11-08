Feature: Test Orangehrm login

Scenario Outline: Data drivern testing for login
	Given Open Orangehrm Application
	When User enter valid "<username>" and valid "<password>"
	And User click on Login button
	Then User should get access of Application
	
	Examples:
		| username | password |
		| Admin    | admin123 |
		| Pooja    | test123  |
		| Admin    | admin123 |
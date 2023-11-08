Feature: Test Facebook application

Background:
	Given Open Facebook application

Scenario: Test facebook login with valid credentials
	When I enter valid "test123@gmail.com" and valid "test123"
	And I click on Login button
	Then I should get access of application
	
	
Scenario: Test Facebook login with invalid credentials
	When I enter invalid "test1111@gmail.com" and invalid "test123"
	And click on button
	Then I should not get access of application

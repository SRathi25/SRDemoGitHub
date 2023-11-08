Feature: Test User Registration

Scenario: Test for User registration
	Given User is on registration page
	When User enters following details
		| Priyanka | Nigade | piyu1818@gmail.com | 9552671595 | Pune |
		| Sumit | Shinde | sumit@gmail.com | 95526767695 | Mumbai |
	Then User registration should be successful
		
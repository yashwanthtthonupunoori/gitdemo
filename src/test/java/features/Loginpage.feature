Feature: application login feature 

Scenario: verify successfully 
	Given user logonto application 
	When user provides "yash" and "1234"  andclicks on signin 
	Then user view expected page 
	
Scenario: verify  unsuccessfully 
	Given user logonto application 
	When user provides "yash1" credntails "4321"andclicks on signin 
	Then views error message 
	
	Scenario outline: verify successfully 
	Given   user hits on different <URLS>
	When   user provides correct <username> and <Password> clicks on signin 
	Then   user view expected page 
	Examples: 
	|URL|	|
	||
	
	
	
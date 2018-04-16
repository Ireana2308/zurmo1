Feature: Project creation 
@createPro
Scenario Outline: Creating a Project 
	Given User logged into the Zurmo 
	And User clicks on Project on the menu bar 
	And User needs to provide following information to create a project "<name>" "<Description>" 
	Then User clicks save to create a project 
	Examples: 
		|name|Description|
		|American eagle| Final project|
######
@CheckPro
Scenario: Check Created Project 
	Given User logged into the Zurmo 
	Then User searchs project by project "American eagle" name 
	And User will see the project is active or not 
	Then user logout from application 
	
	
	
	
	
	
	
	
	
	

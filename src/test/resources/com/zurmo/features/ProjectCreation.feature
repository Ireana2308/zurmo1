Feature: Project creation 

Scenario: Creating a Project 
	Given User logged into the Zurmo 
	And User clicks on Project on the menu bar 
	And User needs to provide following information to create a project 
		|Name|
		|Description	|
		|Accounts|	
		|Contacts|
		|Status|	
	Then User clicks save to create a project 
	
Scenario: Check Created Project 
	Given User logged into the Zurmo 
	Then User searchs project by project name 
	And User will see the project is active or not 
	Then User has tree options 
		|edit|
		|delete|
		|clone|
   Then user logout from application				
		
		
		
		
		
		
		
		
		
		

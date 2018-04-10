@ST
Feature: Smoke Test				
											
Scenario: Validation of Leads functionality
Given User logged into the Zurmo						
And User clicks on leads on the menu bar								
And User should see the following functionalities						
|Create|						
|Update|						
|Export|						
|Delete|						
|Subscribe|						
|Merge|						
Then User have ability to click all functionalities


Scenario: Contact Function is Working
Given User logged into the Zurmo						
And User clicks on Contacts on the menu bar
Then User should get the "ZurmoCRM - Contacts"	


Scenario: Projects Function is Working
Given User logged into the Zurmo						
And User clicks on Projects on the menu bar
Then User should get the "ZurmoCRM - Projects"	

Scenario: Products Function is Working
Given User logged into the Zurmo						
And User clicks on Products on the menu bar
Then User should get the "ZurmoCRM - Products"

Scenario: Reports Function is Working
Given User logged into the Zurmo						
And User clicks on Reports on the menu bar
Then User should get the "ZurmoCRM - Reports"

#Scenario:  Contact creation and validation	
#And User clicks on "Contacts" on the menu bar	
#Then User click on create button
#And User should type lastname "Kim"
#And User should see the created contact
		
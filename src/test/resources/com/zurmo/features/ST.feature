@smoke
Feature: Smoke Test				
						
Background:						
Given User logged into the Zurmo						
And User clicks on leads on the menu bar						
						
Scenario: Validation of Leads functionality						
And User should see the following functionalities						
|Create|						
|Update|						
|Export|						
|Delete|						
|Subscribe|						
|Merge|						
Then User have ability to click all functionalities
	

Scenario: Creating New Items Negative																							
And User clicks the create catolog items																									
Then User should see the create catolog items page 																									
Then User should have the following options to create products																									
|Name|																									
|Description|																									
|Categories|																									
|Status|																									
|Type|																									
|Price Frequency|																									
|Sell Price Formula|																									
|Cost|																									
|List Price|																									
|Sell Price|					

Scenario:  Contact creation and validation	
And User clicks on "Contacts" on the menu bar	
Then User click on create button
And User should type lastname "Obama"
And User should see the created contact

		
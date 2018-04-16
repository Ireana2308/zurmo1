@th1.
Feature: 	Creating Catolog Item	

Background:					
Given User logged into the Zurmo					
And User clicks on Products on the menu bar	
			
@th3					
Scenario:	Items Creation Negative				
And User clicks the create catolog items					
Then User should see the create catolog items page 					
Then User should have the following options to create catolog					
|Name *|					
|Description|					
|Categories|					
|Status *|					
|Type *|					
|Price Frequency *|					
|Sell Price Formula *|					
|Cost *|					
|List Price *|					
|Sell Price *|					
When User click the create catolog save button should see the error message					
					
	
					
@th4					
Scenario Outline:	Items Creation				
And User clicks the create catolog items					
Then User can create the first Catalog Item using "<Name>" "<Description>" "<Cost>" "<List Price>" "<Sell Price>"					
And User should see the created product "<Name>"					
					
Examples:					
|Name| Description|Cost|List Price|Sell Price|					
|Meal plan|Active|15|20|16|					
					
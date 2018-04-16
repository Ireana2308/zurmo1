@th2.
Feature: 	Products Creation				
					
Background:					
Given User logged into the Zurmo					
And User clicks on Products on the menu bar					
					
@th1	
Scenario: Creation of Items/Own					
When User click the create product should see the Create Product page 					
Then User should have the following options to create products					
|Catalog Item|					
|Name *|					
|Quantity *|					
|Account|					
|Contact|					
|Opportunity|					
|Categories|					
|Type *|					
|Price Frequency *|					
|Sell Price *|					
|Stage *|					
When User click the save button should see the error message					
	
					
@th2					
Scenario Outline:	Products Creation				
When User click the create product should see the Create Product page 					
Then User creates the first Product using "<Name>" "<Quantity>" "<Sell Price>"					
And User should see the created "<Name>" product					
					
Examples:					
|Name| Quantity| Sell Price|					
|Health magazine|10000|10|					
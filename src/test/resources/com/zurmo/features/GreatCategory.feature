Feature: Creation Categories 
Background: 
	Given User logged into the Zurmo 
Scenario Outline: Creation Categories 

	Given User goes to Categories 
	And User can create product Category "<Name>" 
	Then User can see "<Name>" created product category in Categories options 
	Examples: 
		|Name|		
		|ULAN|
		Scenario: Updating record 

	Given user goes to product options 
	Given  User goes to Update 
	And User can update two selection 
		| Selected | 		
		| All Results|		
@category 
Scenario: 
	Given User logged into the Zurmo 
	Given user goes to product options 
	Given  User goes to Update 
	When User click all results user should see "Owner" and "Stage" 
	When User click Stage button user should see 
		|(None)| 
		|Open |
		|Lost| 
		|Won|		
	Then user should select "Open" and save 
	
		

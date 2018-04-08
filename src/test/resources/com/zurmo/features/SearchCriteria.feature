Feature: 	Search Criterias	
		
Background:		
Given User logged into the Zurmo		
And User clicks on leads on the menu bar		
		
Scenario: Creation advanced search option		
When User click add criteria should see the field in alphabetical order		
And User should add Modified Date Time criteria		
Then User should select Time 		
When User save the criteria should see criteria on saved search		
		
		
Scenario: Creation of Columns		
When User click columns should see Hidden and Visible Columns		
And User should be able to move following options from Hidden Colums to Visible Columbs		
|Mobile Phone Number|		
|Created Date Time|		
|Job Title|		
Then User should see updated leads information ba	r	
		
Scenario: Creation of Items/Own		
When User click Items/Own should see the field in alphabetical order		
Then User choose the Industry should see the following options		
|Automotive|		
|Banking|		
|Business Services|		
|Energy|		
|Financial Services|		
|Insurance|		
|Manufacturing|		
|Retail|		
|Tecnology|		
When User choose the Tecnology should save the search criteria		
When User save the criteria should see criteria on saved search		
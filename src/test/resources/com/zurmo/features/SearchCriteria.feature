@mTuran
Feature: 	Search Criterias	
		
Background:		
Given User logged into the Zurmo		
And User clicks on leads on the menu bar		
		
@mt4
Scenario: Creation advanced search option		
When User click add criteria should see the field in alphabetical order		
And User should add "Modified Date Time" criteria		
Then User should select "Between" and should enter the date "05/10/2018" and "05/20/2018"		
When User save the criteria as a "Saved Search 51" should see criteria on saved search		

		
@mt5
Scenario: Creation of Columns		
When User click columns should see Hidden and Visible Columns		
And User should be able to move following options from Hidden Colums to Visible Columbs		
|Mobile Phone|		
|Created Date Time|		
|Job Title|		
Then User should see updated leads information bar
	
@mt6		
Scenario: Creation of Items/Own		
When User click Items/Own should see the field in alphabetical order		
Then User choose the "Industry" should see the following options	
|(None)|	
|Automotive|		
|Banking|		
|Business Services|		
|Energy|		
|Financial Services|		
|Insurance|		
|Manufacturing|		
|Retail|	
|Technology|	
When User choose the "Technology" should save the search criteria		
When User save the criteria as a "Saved Search 10" should see criteria on saved search		

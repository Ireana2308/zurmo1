@Regression
Feature: 	Meeting Creation			
				
Background:				
Given User logged into the Zurmo				
And User clicks on leads on the menu bar				
				
Scenario: Creating Meeting field			
Then User go to the create Meeting 				
And User should see the following titles				
|Name|				
|Location|				
|Start Time|				
|End Time|				
|Category|				
|Attandees|				
|Account|				
|Opportunity|				
|Description|				
When User click the Start Time should select the date and set the Time				
				
				
Scenario: Validation of Account Search				
Then User go to the create Meeting				
And User click the account should see the created accounts				
When User click the advanced should search accounts with Industry and Type				
Then User choose the following option should see the one of the Account				
|Technology|Prospect|				
|Technology|Customer|				
|Technology|Vendor|				
|Technology|(none)|				
				
				
Scenario Outline: 	Meeting creation and validation			
Then User go to the create Meeting 				
Then user create meeting using "<Name>" "<Location>" "<Start Time>" "<End Time>" "<account>""<description>"				
And user validate new meeting information "<Name>" "<Location>" "<Start Time>" "<End TIme>" "<account>""<description>"				
Then user logout from application				
				
Examples: 				
|Name|Location|Start Time|End Time|account|description|				
|American Eagle| Tesla Room| 4/12/2018 12:15 AM |4/12/2018 12:30 AM|JavaKillers|Stand Up meeting|				
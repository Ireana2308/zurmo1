@RowsColumn
Feature:  Creating Reports using Rows And Columns

Background: 
Given   I logged into the Zurmo
When user clicks on repots on the menu bar
Then user click on create report button
Then following menu options should be visible for Report Wizard
|Rows and Columns|
|Summation       |
|Matrix          | 

Scenario: Creating a Rows And Columns Report

And User chooses "Rows And Columns" and clicks on create button
And User  should see the following menu options 
|Accounts |
|Contacts and Leads|
|Email Messages|
|Marketing Lists|
|Meetings|
|Notes|
|Opportunities|
|Products|
|Catalog Items|
|Tasks|
|Projects|
Scenario: creatiog report by opportunities

And User chooses "Opportunities"
Then User chooses "Source"  and "Created Date Time"
And User types to Name field "Derek " and clicks Save and Run  button


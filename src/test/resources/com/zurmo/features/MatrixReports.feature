@MatrixReport
Feature:  Creating Reports using Matrix Report

Scenario: Creating a Matrix Report
Given   I logged into the Zurmo
When user clicks on repots on the menu bar
Then user click on create report button

Then following menu options should be visible for Report Wizard
|Rows and Columns|
|Summation       |
|Matrix          | 
And User chooses "Matrix"and   clicks Create button
And User  should see the following menu options 
|Accounts|
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
And User chooses "Meetings"
And User should see the following filters
| |
|Category|
|Created By User|
|Created Date Time|
|Description|
|End Time|
|Latest Date Time|
|Location|
|Logged|
|Modified By User|
|Modified Date Time|
|Name|
|Owner|
|Processed For Latest Activity|
|Start Time|
|User Attendees|
|Accounts|
|Contacts|
|Created By User|
|Modified By User|
|Opportunities|
|Owner|
|User Attendees|
And user chooses "Name ", "Description"
And User types "Sprint Planning" for description field
And User types "John" for Name field
Then User chooses  under Select Groupings section "Owner" as X-Axis and "Start date " as Y-Axis
And User choses under Select Display Columns "Count" and enter 100
And User types "John " for Name
And Meetings Matrix Report for Jogn should be displayed


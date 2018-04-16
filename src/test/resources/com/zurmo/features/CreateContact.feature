@Regression
Feature: Creating a contact					
					
@contact
Scenario Outline:  Contact creation and validation	
Given User logged into the Zurmo	
And User clicks on "Contacts" on the menu bar	
Then User click on create button
Then User creates contacts  using  "<prefix>" "<First Name>" "<Last Name>" "<Status>" "<Job Title>" "<Primary Email>"
And User should be able to see information about a saved  contact


Examples: 
          |prefix |  First Name | Last Name |  Status   | Job Title | Primary Email|
          |Ms.    | Ann1         |      Bill1 | Qualified1 | developer1 | ann1@gmail.com|
          |Mr.    | Alex1        | Kim 1      | Customer1  | customer1  | alexkim1@gmail.com|
          
 @negativContact   
  Scenario: UnSuccessfull creation of contact 
Given User logged into the Zurmo						
And User clicks on "Contacts" on the menu bar	
Then User click on create button
And User leaves blank all fields
And clicks on SAVE button
And user should see the "Last Name cannot be blank" error 
          
          

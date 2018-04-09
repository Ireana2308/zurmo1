Feature: Creating a contact					
					
@contact4
Scenario Outline:  Contact creation and validation	
Given User logged into the Zurmo	
And User clicks on "Contacts" on the menu bar	
Then User click on create button
Then User creates contacts  using  "<prefix>" "<First Name>" "<Last Name>" "<Status>" "<Job Title>" "<Primary Email>"
And User should be able to see information about a saved  contact


Examples: 
          |prefix |  First Name | Last Name |  Status   | Job Title | Primary Email|
          |Ms.    | Ann         |      Bill | Qualified | developer | ann@gmail.com|
          |Mr.    | Alex        | Kim       | Customer  | customer  | alexkim@gmail.com|
          
 @negativContact   
  Scenario: UnSuccessfull creation of contact 
Given User logged into the Zurmo						
And User clicks on "Contacts" on the menu bar	
Then User click on create button
And User leaves blank all fields
And clicks on SAVE button
And user should see the "Last Name cannot be blank" error 
          
          

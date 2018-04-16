@mt1
Feature: Lead Creation					
						
Background:						
Given User logged into the Zurmo						
And User clicks on leads on the menu bar		
									
Scenario: Validation of Leads functionality						
And User should see the following functionalities		
|Create|							
|Update |						
|Export |						
|Delete |						
|Subscribe |						
|Merge |						
Then User have ability to click all functionalities		

@mt2						
Scenario: Validation of Status, Source and Industry						
And User go to the create leads						
Then User should see following Status in bar		
|New|				
|In Progress|						
|Recycled|						
|Dead|						
And User should see following Source in bar	
|(None)|					
|Self-Generated|						
|Inbound Call|						
|Tradeshow|						
|Word of Mouth|						
Then User should see following Industry in bar	
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
						
@mt3					
Scenario Outline:	Lead Creation and validation	
And User go to the create leads										
Then user create leads using "<firstName>" "<lastName>" "<mobilePhone>" "<jobTitle>" "<department>" "<companyName>" "<email>"						
And user validate new created contact info "<firstName> <lastName>" "<mobilePhone>" "<jobTitle>" "<department>" "<companyName>" "<email>"						
Then user logout from application						
						
Examples:						
| firstName | lastName | mobilePhone | jobTitle | department| companyName|email|						
| America1nm12 |Eag1l4ems2| 773n47713892| Scrmj Te14am12| QA411u2| Cybertet1k4School2|ameriicane4a1gle2@gmail.com|	

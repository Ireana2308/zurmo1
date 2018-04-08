Feature: 	Lead Creation					
						
#Background:						
#Given User logged into the Zurmo						
#And User clicks on leads on the menu bar						
						
Scenario: Validation of Leads functionality						
And User should see the following functionalities						
|Create|						
|Update|						
|Export|						
|Delete|						
|Subscribe|						
|Merge|						
Then User have ability to click all functionalities						
						
Scenario: Validation of Status, Source and Industry						
And User go to the create leads						
Then User should see following Status in bar						
|In Progress|						
|Recycled|						
|Dead|						
And User should see following Source in bar						
|Self-Generated|						
|Inbound Call|						
|Tradeshow|						
|Word of Mouth|						
Then User should see following Industry in bar						
|Automotive|						
|Banking|						
|Business Services|						
|Energy|						
|Financial Services|						
|Insurance|						
|Manufacturing|						
|Retail|						
|Tecnology|						
						
						
Scenario Outline:	Lead Creation and validation					
And user go to the create leads						
Then user create leads using "<prefix>" "<firstName>" "<lastName>" "<mobilePhone>" "<jobTitle>""<department>""<companyName>""<email>"						
And user validate new created contact info "<prefix>" "<firstName>" "<lastName>" "<mobilePhone>" "<jobTitle>""<department>""<companyName>""<email>"						
Then user logout from application						
						
Examples:						
| prefix | firstName | lastName | mobilePhone | jobTitle | department| companyName|email|						
|Mr. | American |Eagles| 7737738990| Scrum Team| QA| CybertekSchool|americaneagle@gmail.com|						
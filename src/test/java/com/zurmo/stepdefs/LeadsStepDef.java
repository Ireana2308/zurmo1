
package com.zurmo.stepdefs;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

import com.zurmo.utilities.BrowserUtils;
import com.zurmo.utilities.Driver;
import com.zurmo.pages.ZurmoLeadsPage;

import cucumber.api.DataTable;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class LeadsStepDef {
	
	ZurmoLeadsPage leads=new ZurmoLeadsPage(); 
	
	
	@Given("^User clicks on leads on the menu bar$")
	public void user_clicks_on_leads_on_the_menu_bar() {
	   leads.leadsButton.click();
		
	}

	@Given("^User should see the following functionalities$")
	public void user_should_see_the_following_functionalities(List<String> options) throws InterruptedException {
	
		
		for(int i=0; i<leads.alloptions.size();i++) {
		
		String opt=leads.alloptions.get(i).getText();
		String exp=options.get(i); 
		Assert.assertEquals(opt, exp);
	}
		
	}

	@Then("^User have ability to click all functionalities$")
	public void user_have_ability_to_click_all_functionalities() {
	    // Write code here that turns the phrase above into concrete actions
		
		for(int i=0; i<leads.alloptions.size();i++) {
			
			assertTrue(leads.alloptions.get(i).isDisplayed());
		}
		
	}
	
	//=======================================================================
	
	
	@Given("^User go to the create leads$")
	public void user_go_to_the_create_leads() {
	    leads.createButton.click();
	}

	@Then("^User should see following Status in bar$")
	public void user_should_see_following_Status_in_bar(List<String> status) {
		//select[@id='Contact_state_id']
		
		for(int i=0; i<leads.status.size();i++) {
			
			String opt=leads.status.get(i).getText();
			String exp=status.get(i); 
			Assert.assertEquals(opt, exp);
		}
		
		
	}

	@Then("^User should see following Source in bar$")
	public void user_should_see_following_Source_in_bar(List<String> source2) {
		
		
for(int i=0; i<leads.source.size();i++) {
			
			String opt=leads.source.get(i).getText();
			String exp=source2.get(i); 
			Assert.assertEquals(opt, exp);
		}
	   
	}

	@Then("^User should see following Industry in bar$")
	public void user_should_see_following_Industry_in_bar(List<String> industry) {
		
for(int i=0; i<leads.industry.size();i++) {
			
			String opt=leads.industry.get(i).getText();
			String exp=industry.get(i); 
			Assert.assertEquals(opt, exp);
		}
	   
	}
	
	
	//=======================================================================

	
	
	
	@Then("^user create leads using \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\"$")
	public void user_create_leads_using(String firstName, String lastName, String mobilePhone, String jobTitle, String department, String companyName, String email) {
	    // Write code here that turns the phrase above into concrete actions
		
		leads.firstName.sendKeys(firstName);
		leads.lastName.sendKeys(lastName);
		leads.mobilePhone.sendKeys(mobilePhone);
		leads.jobTitle.sendKeys(jobTitle);
		leads.department.sendKeys(department);
		leads.companyName.sendKeys(companyName);
		leads.primaryEmail.sendKeys(email); 
		leads.save.click();
		//leads.clickSave.click();
		
	}
	

	@Then("^user validate new created contact info \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\"$")
	public void user_validate_new_created_contact_info(String Name, String mobilePhone, String jobTitle, String department, String companyName, String email) {
	    // Write code here that turns the phrase above into concrete actions
		
		List<String> validation= new ArrayList<>(); 
		validation.add(leads.topMenuOption(Name));
		validation.add(leads.topMenuOption(mobilePhone));
		validation.add(leads.topMenuOption(jobTitle)); 
		validation.add(leads.topMenuOption(department)); 
		validation.add(leads.topMenuOption(companyName)); 
		validation.add(leads.topMenuOption(email)); 
		
		Assert.assertEquals(validation.get(0), Name);
		Assert.assertEquals(validation.get(1), mobilePhone);
		Assert.assertEquals(validation.get(2), jobTitle);
		Assert.assertEquals(validation.get(3), department);
		Assert.assertEquals(validation.get(4), companyName);
		Assert.assertEquals(validation.get(5), email);
		
	}

	@Then("^user logout from application$")
	public void user_logout_from_application() {
	    // Write code here that turns the phrase above into concrete actions
		
		leads.admin.click();
		leads.SignOut.click();
		
	
	}
}
	
	
	
	
package com.zurmo.stepdefs;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import com.zurmo.pages.ZurmoContactPage;
import com.zurmo.pages.ZurmoHomePage;
import com.zurmo.utilities.ConfigurationReader;
import com.zurmo.utilities.Driver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class CreateContactStepDefs {
	
	private WebDriver driver = Driver.getDriver();
	
	ZurmoHomePage login =new ZurmoHomePage();
	ZurmoContactPage contactPage =new ZurmoContactPage();
	
	@Given("^User logged into the Zurmo$")
	public void user_logged_into_the_Zurmo() {
	
		driver.get(ConfigurationReader.getProperty("url"));
	 login.loginToZurmo(ConfigurationReader.getProperty("user"), 
			 ConfigurationReader.getProperty("password"));
	 
	}

	@Given("^User clicks on \"([^\"]*)\" on the menu bar$")
	public void user_clicks_on_on_the_menu_bar(String arg1) {
		login.contactsLink.click();
	}

	@Then("^User click on create button$")
	public void user_click_on_create_button() {
		
		contactPage.creatBtn.click();
	}

	@Then("^User creates contacts  using  \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\"$")
	public void user_creates_contacts_using(String prefix, String firstName,String lastName, String status, String jobTitle, String primaryEmail) {
	contactPage.selectPrefixMethod(prefix);
	contactPage.contactFirstName.sendKeys(prefix);
	contactPage.contactLastName.sendKeys(firstName);
	contactPage.selectStatus(status);
	contactPage.jTitle.sendKeys(jobTitle);
	contactPage.email.sendKeys(primaryEmail);
	contactPage.save.click();
 contactPage.clickLink.click();
	}


	@Then("^User should be able to see information about a saved  contact$")
	public void user_should_be_able_to_see_information_about_a_saved_contact() {
	    Assert.assertTrue(contactPage.details.isDisplayed());
	}

	@Then("^User leaves blank all fields$")
	public void user_leaves_blank_all_fields() {
	    
	}

	@Then("^clicks on SAVE button$")
	public void clicks_on_SAVE_button() {
	    contactPage.save.click();
	    
	}

	@Then("^user should see the \"([^\"]*)\" error$")
	public void user_should_see_the_error(String arg1) {
	    Assert.assertTrue(contactPage.erorr.isDisplayed());
	}
}

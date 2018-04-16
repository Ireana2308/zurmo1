package com.zurmo.stepdefs;

import org.testng.Assert;

import com.zurmo.pages.ZurmoHomePage;
import com.zurmo.utilities.Driver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class SmokeTestStepDefs {
    ZurmoHomePage main=new ZurmoHomePage(); 
	
   
	    
	@Given("^User clicks on Contacts on the menu bar$")
	public void user_clicks_on_Contacts_on_the_menu_bar() throws InterruptedException {
	   main.dots.click();
	   Thread.sleep(500);

	   main.contactsLink.click();
	   Thread.sleep(500);

	   
	}

	@Given("^User clicks on Projects on the menu bar$")
	public void user_clicks_on_Projects_on_the_menu_bar() throws InterruptedException {
		   main.dots.click();
		   Thread.sleep(500);

		main.projectLink.click();
	
		   Thread.sleep(500);

	}

	@Given("^User clicks on Products on the menu bar$")
	public void user_clicks_on_Products_on_the_menu_bar() throws InterruptedException {
		   main.dots.click();
		   Thread.sleep(500);

		main.productsLink.click();
		   Thread.sleep(500);

	}

	@Given("^User clicks on Reports on the menu bar$")
	public void user_clicks_on_Reports_on_the_menu_bar() throws InterruptedException {
		   main.dots.click();
		   Thread.sleep(500);

		main.reportsLink.click();
		Thread.sleep(500);
		
	}
	
	 @Then("^User should get the \"([^\"]*)\"$")
	    public void user_should_get_the(String title) throws InterruptedException {
		 Thread.sleep(500);
		String act= Driver.getDriver().getTitle(); 
		Thread.sleep(500);
		  Assert.assertEquals(act, title);
	    }
	
	
	

}

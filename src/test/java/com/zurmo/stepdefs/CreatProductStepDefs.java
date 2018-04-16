package com.zurmo.stepdefs;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import com.zurmo.pages.CreatProductTest;
import com.zurmo.utilities.BrowserUtils;
import com.zurmo.utilities.Driver;

import cucumber.api.DataTable;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class CreatProductStepDefs {
private WebDriver driver=Driver.getDriver();
CreatProductTest products=new CreatProductTest ();


	@Given("^user goes to product options$")
	public void user_goes_to_product_options() throws InterruptedException {
	    // Write code here that turns the phrase above into concrete actions
		products.hiddenbutton3.click();
		Thread.sleep(2000);
		products.productbutton3.click();
	    
	}

	@Then("^user should assert and validate$")
	public void user_should_assert_and_validate(List<String> Profunctions) {
	    // Write code here that turns the phrase above into concrete actions
	    // For automatic transformation, change DataTable to one of
	    // List<YourType>, List<List<E>>, List<Map<K,V>> or Map<K,V>.
	    // E,K,V must be a scalar (String, Integer, Date, enum etc).
	    // Field names for YourType must match the column names in 
	    // your feature file (except for spaces and capitalization).
		for(int i=0; i<Profunctions.size(); i++) {
			
			
			String exp=Profunctions.get(i);
			String act = products.Products.get(i).getText();
			Assert.assertEquals(act, exp);
			System.out.println(act);
		}
		
	
	}
		
	@Given("^User goes to Update$")
	public void user_goes_to_Update() {
	    // Write code here that turns the phrase above into concrete actions
	    products.updateButton.click();
	}

	@Given("^User can update two selection$")
	public void user_can_update_two_selection(List<String> update) {
	    // Write code here that turns the phrase above into concrete actions
	    // For automatic transformation, change DataTable to one of
	    // List<YourType>, List<List<E>>, List<Map<K,V>> or Map<K,V>.
	    // E,K,V must be a scalar (String, Integer, Date, enum etc).
	    // Field names for YourType must match the column names in 
	    // your feature file (except for spaces and capitalization).
		BrowserUtils.hover(products.updateButton);
	System.out.println(products.selected.getText());
	System.out.println(products.allresult.getText());
	Assert.assertEquals(products.selected.getText(),  update.get(0));
System.out.println(update.get(1));
	  Assert.assertEquals(products.allresult.getText(),  update.get(1));
	}
	
	@When("^User click all results user should see \"([^\"]*)\" and \"([^\"]*)\"$")
	public void user_click_all_results_user_should_see_and(String Owner , String Stage) {
	    // Write code here that turns the phrase above into concrete actions
		products.allresult.click();
		//Assert.assertEquals(products.ownerbutton.getText(),Owner);
		//Assert.assertEquals(products.stagebutton.getText(),Stage);
		products.ownerbutton.click();
		products.ownerfield.sendKeys("ulan");
		
		
		
		
	}
	

	@When("^User click Stage button user should see$")
	public void user_click_Stage_button_user_should_see(List<String>Stageoptions) throws InterruptedException {
	    // Write code here that turns the phrase above into concrete actions
	    // For automatic transformation, change DataTable to one of
	    // List<YourType>, List<List<E>>, List<Map<K,V>> or Map<K,V>.
	    // E,K,V must be a scalar (String, Integer, Date, enum etc).
	    // Field names for YourType must match the column names in 
	    // your feature file (except for spaces and capitalization).
		Thread.sleep(3000);
		products.stagebutton.click();
		Thread.sleep(4000);
		products.selectarrow.click();
		BrowserUtils.hover(products.selectarrow);
		for(int i=0; i<Stageoptions.size(); i++) {
			
			String act=products.assertoptions.get(i).getText();
			String exp=Stageoptions.get(i);
			Assert.assertEquals(act, exp);
			System.out.println(act);
			
		
			
		}
	}
		
		
	 
	

	@Then("^user should select \"([^\"]*)\" and save$")
	public void user_should_select_and_save(String none) {
	    // Write code here that turns the phrase above into concrete actions
	

	for(int i=0; i<products.assertoptions.size(); i++) {
		
		if(products.assertoptions.get(i).getText().equalsIgnoreCase(none)) {
			
			products.assertoptions.get(i).click();
			products.save.click();
		}
	}
	}
	}
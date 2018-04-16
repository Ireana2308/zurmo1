package com.zurmo.stepdefs;

import java.util.List;

import org.testng.Assert;

import com.zurmo.pages.ZurmoProductPage;
import com.zurmo.utilities.BrowserUtils;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class CreateCatalogStepDefs {
	
	
	ZurmoProductPage product=new ZurmoProductPage(); 

	
	@Given("^User clicks the create catolog items$")
	public void user_clicks_the_create_catolog_items() {
		 BrowserUtils.hover(product.arrowdown1);
		    
		    product.createCatatlogProduct.click(); 
		    
		    
	}

	//====
	@Then("^User should see the create catolog items page$")
	public void user_should_see_the_create_catolog_items_page() {
	 
		String pageNameExp="Create Catalog Item"; 
		String act=product.createCatatlogProductPage.getText(); 
		
		Assert.assertEquals(pageNameExp, act);
	}

	@Then("^User should have the following options to create catolog$")
	public void user_should_have_the_following_options_to_create_catolog(List<String>	 form) {
		
		for(int i=0; i<product.createProductForm.size(); i++) {
						
			Assert.assertEquals(form.get(i), product.createCatalogForm.get(i).getText());
		}
	    
	}

	@When("^User click the create catolog save button should see the error message$")
	public void user_click_the_create_catolog_save_button_should_see_the_error_message() throws InterruptedException {
	    product.saveButton1.click();
	    
	    Thread.sleep(4000);
	    
	    String error="Name cannot be blank."; 
	    
	    String nameError=product.nameError1.getText(); 
	    
	    Assert.assertEquals(error, nameError);
	    
	}
	
	
	//*******
	//Feature File Catalog Creation Scenario 2
	//====================================================================================================================
		
	
	@Then("^User can create the first Catalog Item using \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\"$")
	public void user_can_create_the_first_Catalog_Item_using(String name, String description, String cost, String listPrice, String sellPrice) {
		product.sendKey(product.catalogName, name);
		product.sendKey(product.catalogDescription, description);
		product.sendKey(product.catalogCost, cost);
		product.sendKey(product.catalogListPrice, listPrice);
		product.sendKey(product.catalogSellPrice, sellPrice);
		
		product.saveButton1.click();
	}

	@Then("^User should see the created product \"([^\"]*)\"$")
	public void user_should_see_the_created_product(String name) throws InterruptedException {
	   
		Thread.sleep(4000);
		
		Assert.assertEquals(name, product.savedCatalog.getText());
		
		
		
	}

}

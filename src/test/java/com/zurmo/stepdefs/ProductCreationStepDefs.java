package com.zurmo.stepdefs;

import java.util.List;

import org.testng.Assert;

import com.zurmo.pages.ZurmoProductPage;
import com.zurmo.utilities.BrowserUtils;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class ProductCreationStepDefs {
	
	ZurmoProductPage product=new ZurmoProductPage(); 
	
	
	
	@When("^User click the create product should see the Create Product page$")
	public void user_click_the_create_product_should_see_the_Create_Product_page() {
	    BrowserUtils.hover(product.arrowdown);
	    
	    product.createProduct.click(); 
	    
	    String productPage="Products / Create Product"; 
	    
		Assert.assertEquals(productPage, product.productText1.getText());
	}

	@Then("^User should have the following options to create products$")
	public void user_should_have_the_following_options_to_create_products(List<String> productList) {
		
		for(int i=0; i<product.createProductForm.size(); i++) {
			
			Assert.assertEquals(productList.get(i), product.createProductForm.get(i).getText());
			
		}
	   
	}

	@When("^User click the save button should see the error message$")
	public void user_click_the_save_button_should_see_the_error_message() {
		
		product.saveButton.click(); 
		String nameErrorExp="Name cannot be blank."; 
		String quantityErrorExp="Quantity cannot be blank."; 

		
		String nameError=product.nameError.getText(); 
		String quantityError=product.quantityError.getText(); 
		
		Assert.assertEquals(nameErrorExp, nameError);
		
		Assert.assertEquals(quantityErrorExp, quantityError);
	 
	}
	
	
	//*******
	//Scenario 2
	//====================================================================================================================
	
	

	@Then("^User creates the first Product using \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\"$")
	public void user_creates_the_first_Product_using(String name, String quantity, String sellprice) {
	    product.productName.sendKeys(name);
	    
	    product.quantityName.sendKeys(quantity);

	    product.sellPrice.sendKeys(sellprice);

	    product.saveButton.click();
	}

	@Then("^User should see the created \"([^\"]*)\" product$")
	public void user_should_see_the_created_product(String savedProduct) {
		
		Assert.assertEquals(savedProduct, product.savedProduct.getText());
	    
	}
	
	

	
	

}



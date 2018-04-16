package com.zurmo.stepdefs;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;

import com.zurmo.pages.CreateCategoryTests;
import com.zurmo.utilities.BrowserUtils;
import com.zurmo.utilities.Driver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class CreatCategoryStepDefs {
	private WebDriver driver = Driver.getDriver();
	
	CreateCategoryTests product=new CreateCategoryTests();
	
	@Given("^User goes to Categories$")
	public void user_goes_to_Categories() throws InterruptedException {
	    // Write code here that turns the phrase above into concrete actions
		product.hiddenbutton.click();
		Thread.sleep(2000);
	    BrowserUtils.waitForClickablility(product.productbutton, 10).click();
	   
	}

	@Given("^User can create product Category \"([^\"]*)\"$")
	public void user_can_create_product_Category(String name) throws InterruptedException {
	    // Write code here that turns the phrase above into concrete actions
	    
	 product.category(name);
	}

	@Then("^User can see \"([^\"]*)\" created product category in Categories options$")
	public void user_can_see_created_product_category_in_Categories_options(String name) {
	    // Write code here that turns the phrase above into concrete actions
		product.productbutton2.click();
		product.categorybutton2.click();
		Assert.assertEquals(product.createdProductName.getText(),name , "created product verification");
		product.deleteProductName.click();
		Actions action= new Actions(Driver.getDriver());
		action.moveToElement(product.optionbutton).click().perform();
		action.moveToElement(product.deletebutton).click().perform();
//		product.optionbutton.click();
//		product.deletebutton.click();
		
//	BrowserUtils.hover(product.optionbutton);
//BrowserUtils.hover(product.deletebutton);
	}

}
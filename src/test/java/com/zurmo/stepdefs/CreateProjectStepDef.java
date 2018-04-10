package com.zurmo.stepdefs;

import org.openqa.selenium.WebDriver;

import com.zurmo.pages.CreateProjectPage;
import com.zurmo.pages.ZurmoHomePage;
import com.zurmo.utilities.Driver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class CreateProjectStepDef {

	private WebDriver driver = Driver.getDriver();
///
	ZurmoHomePage login = new ZurmoHomePage();
	CreateProjectPage contactPage = new CreateProjectPage();

	@Given("^User clicks on \"([^\"]*)\" on menu bar$")
	public void user_clicks_on_on_menu_bar(String str) {
		System.out.println(str);
		contactPage.createBtnHover.click();
		contactPage.projectName.click();
	}
	@Given("^User needs to provide following information to create a project \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\"$")
	public void user_needs_to_provide_following_information_to_create_a_project(String prefix, String Description, String account, String contact, String oppor) throws InterruptedException {
	    contactPage.nameProject.sendKeys(prefix);
	    Thread.sleep(1000);
	    contactPage.descProject.sendKeys(Description);
	   
        	}

	@Then("^User clicks save to create a project$")
	public void user_clicks_save_to_create_a_project() throws InterruptedException {
	    contactPage.saveProject.click();
	    Thread.sleep(1000);
	    driver.close();
	    
//	    try {
//	    	driver.switchTo()
//	    }
	    
	}

}

package com.zurmo.stepdefs;

import org.testng.Assert;

import com.zurmo.pages.CreateProjectPage;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class CreateProject2StepDefs {
	
	CreateProjectPage createProject = new CreateProjectPage();
	
	@Given("^User clicks on Project on the menu bar$")
	public void user_clicks_on_Project_on_the_menu_bar() throws InterruptedException {
	    createProject.createBtnHover.click();
	    Thread.sleep(1000);
	    createProject.projectName.click();
	}

	@Given("^User needs to provide following information to create a project \"([^\"]*)\" \"([^\"]*)\"$")
	public void user_needs_to_provide_following_information_to_create_a_project(String namePr, String discrb) {
	    createProject.nameProject.sendKeys(namePr);
	    createProject.descProject.sendKeys(discrb);
	}
	
	@Then("^User searchs project by project \"([^\"]*)\" name$")
	public void user_searchs_project_by_project_name(String proName) throws InterruptedException {
		createProject.searchKey.click();
	    createProject.searchKey.sendKeys(proName);
	    Thread.sleep(1000);
	    createProject.allResult.click();
	    Thread.sleep(3000);

	    
	}

	@Then("^User will see the project is active or not$")
	public void user_will_see_the_project_is_active_or_not() throws InterruptedException {
		createProject.foundResult.click();
		String expected = "Active";
	    Thread.sleep(2000);
		Assert.assertEquals(createProject.activeOrNot.getText(), expected);
	    Thread.sleep(4000);


	    
}}

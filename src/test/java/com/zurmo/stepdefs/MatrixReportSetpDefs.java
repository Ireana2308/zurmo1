package com.zurmo.stepdefs;

import java.awt.Desktop.Action;
import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import com.zurmo.pages.ZurmoHomePage;
import com.zurmo.pages.ZurmoMatrixReportPage;
import com.zurmo.utilities.ConfigurationReader;
import com.zurmo.utilities.Driver;

import cucumber.api.DataTable;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;


public class MatrixReportSetpDefs {
private WebDriver driver = Driver.getDriver();
	
	ZurmoHomePage login =new ZurmoHomePage();
	ZurmoMatrixReportPage mr=new ZurmoMatrixReportPage();
	
	
	@Given("^I logged into the Zurmo$")
	public void i_logged_into_the_Zurmo() {
		driver.get(ConfigurationReader.getProperty("url"));
		 login.loginToZurmo(ConfigurationReader.getProperty("user"), 
				 ConfigurationReader.getProperty("password"));
		 
	}

	@When("^user clicks on repots on the menu bar$")
	public void user_clicks_on_repots_on_the_menu_bar() throws InterruptedException {
	
	Thread.sleep(1000);
	  mr.dots.click();
	  Thread.sleep(1000);
	  mr.reportsLink.click();
	}

	@Then("^user click on create report button$")
	public void user_click_on_create_report_button() {
	    mr.creatButton.click();
	}

	@Then("^following menu options should be visible for Report Wizard$")
	public void following_menu_options_should_be_visible_for_Report_Wizard(List<String> reports) {
		
		for(int i=0; i<mr.listOfReports.size(); i++)  {

			String act=mr.listOfReports.get(i).getText(); 
			String exp=reports.get(i); 
			
			Assert.assertEquals(act, exp);
	
		}
	}

	@Then("^User chooses \"([^\"]*)\"and   clicks Create button$")
	public void user_chooses_and_clicks_Create_button(String arg1) {
	   mr.mrcreatBtn.click();
	}

	@Then("^User  should see the following menu options$")
	public void user_should_see_the_following_menu_options(List <String> RadioButtonList) {
		for(int i=0; i<mr.selectList.size(); i++)  {

			String actual=mr.selectList.get(i).getText(); 
			String expected=RadioButtonList.get(i); 
			
			Assert.assertEquals(actual, expected);
			}
		
	}

	@Then("^User chooses \"([^\"]*)\"$")
	public void user_chooses(String arg1) {
	 
	}

	@Then("^User should see the following filters$")
	public void user_should_see_the_following_filters(DataTable arg1) {
	    
	}

	@Then("^user chooses \"([^\"]*)\", \"([^\"]*)\"$")
	public void user_chooses(String arg1, String arg2) {
	   
	}

	@Then("^User types \"([^\"]*)\" for description field$")
	public void user_types_for_description_field(String arg1) {
	  
	}

	@Then("^User types \"([^\"]*)\" for Name field$")
	public void user_types_for_Name_field(String arg1) {
	   
	}

	@Then("^User chooses  under Select Groupings section  \"([^\"]*)\" as X-Axis and \"([^\"]*)\" as Y-Axis$")
	public void user_chooses_under_Select_Groupings_section_as_X_Axis_and_as_Y_Axis(String arg1, String arg2) {
	 
	}

	@Then("^User choses under Select Display Columns \"([^\"]*)\" and enter (\\d+)$")
	public void user_choses_under_Select_Display_Columns_and_enter(String arg1, int arg2) {
	   
	}

	@Then("^User types \"([^\"]*)\" for Name$")
	public void user_types_for_Name(String arg1) {
	    
	}

	@Then("^Meetings Matrix Report for Jogn should be displayed$")
	public void meetings_Matrix_Report_for_Jogn_should_be_displayed() {
	   
	}
}

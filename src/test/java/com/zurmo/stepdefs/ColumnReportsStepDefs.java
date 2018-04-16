package com.zurmo.stepdefs;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

import com.zurmo.pages.ZurmoColumnReportPage;
import com.zurmo.pages.ZurmoHomePage;
import com.zurmo.utilities.BrowserUtils;
import com.zurmo.utilities.Driver;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;

public class ColumnReportsStepDefs {
	private WebDriver driver = Driver.getDriver();
	ZurmoHomePage login =new ZurmoHomePage();
	ZurmoColumnReportPage cr=new ZurmoColumnReportPage();
	
	@Then("^User chooses \"([^\"]*)\" and clicks on create button$")
	public void user_chooses_and_clicks_on_create_button(String arg1) {
	cr.columnCreatebtn.click();
	
	}

  @Then("^User clicking \"([^\"]*)\"$")
  public void user_clicking(String arg1) {
	  cr.opportunities.click();
	  cr.nextBt.click();
  }
  @Then("^User chooses \"([^\"]*)\"  and \"([^\"]*)\"$")
  public void user_chooses_and(String arg1, String arg2) throws InterruptedException {
	 // JavascriptExecutor jse=(JavascriptExecutor)driver;
	//	jse.executeScript("window.scrollBy(0, 600)");
	  
	  Actions action=new Actions(driver);
	   action.dragAndDrop(cr.fromSource, cr.toDrop).build().perform();
	   Thread.sleep(2000);
	action.dragAndDrop(cr.fromSDate, cr.toDrop).build().perform();
	
	Select drop= new Select(cr.dropSelectDate);
	  action.moveToElement(cr.dropSelectDate).click().build().perform();
	  drop.selectByValue("Next 7 Days");
	cr.nextButton1.click();
	
  }


  @Then("^User types to Name field \"([^\"]*)\" and clicks Save and Run  button$")
  public void user_types_to_Name_field_and_clicks_Save_and_Run_button(String arg1) throws InterruptedException {
	Thread.sleep(2000);
	  Actions action=new Actions(driver);
	  action.moveToElement(cr.nameSelect).doubleClick().perform();
cr.fieldName.clear();
cr.fieldName.sendKeys("Derek");

action.moveToElement(cr.Ntbtn).click().perform();
	  
  }
  @Then("^User chooses Close date in descending order$")
  public void user_chooses_Close_date_in_descending_order() throws InterruptedException {
	  Thread.sleep(2000);
	  Actions action=new Actions(driver);
	  action.moveToElement(cr.closeDate).doubleClick().perform();
	  
	  //Select drop= new Select(cr.dropSelectDate);
	  action.moveToElement(cr.drD).click().build().perform();
	  cr.drD.click();
	  cr.drD1.click();
	cr.nBt.click();
	  
  }

  @Then("^User types Name and clicks Save and Run  button$")
  public void user_types_Name_and_clicks_Save_and_Run_button() {
 cr.fName.sendKeys("Derek");
cr.saveBt.click();
  Assert.assertTrue(cr.result.isDisplayed());
  
  
  
  }
  @Then("^user types John in search field$")
  public void user_types_John_in_search_field() {
  cr.searchField.sendKeys("John"+ Keys.ENTER);
  Assert.assertTrue(cr.res.isDisplayed());
  
}}
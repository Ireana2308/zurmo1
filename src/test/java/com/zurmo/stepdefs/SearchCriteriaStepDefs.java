package com.zurmo.stepdefs;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.asserts.SoftAssert;

import com.zurmo.pages.ZurmoLeadsPage;
import com.zurmo.utilities.Driver;

import cucumber.api.DataTable;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class SearchCriteriaStepDefs {
	
	ZurmoLeadsPage zurmo=new ZurmoLeadsPage();
	private WebDriver driver = Driver.getDriver();

	
	
	///++++++++=============================================================================================================
    //Search Criteria Scenario 1
	
	@When("^User click add criteria should see the field in alphabetical order$")
	public void user_click_add_criteria_should_see_the_field_in_alphabetical_order() {

		zurmo.advancedButton.click(); 
		zurmo.addCriteria.click(); 

		zurmo.selectField1.click();
				
		SoftAssert softAssertion= new SoftAssert();

		
		for (int i=1 ; i<zurmo.selectField2.size(); i++ ) {

			for (int k=i+1 ; k<zurmo.selectField2.size(); k++ ) {
				
			char alphabetic=zurmo.selectField2.get(i).getText().charAt(0);
			
			char alphabectic2= zurmo.selectField2.get(k).getText().charAt(0); 
			
			
			softAssertion.assertTrue(alphabetic<=alphabectic2);
			
			}
			
		}
		
	    
	}

	
	@When("^User should add \"([^\"]*)\" criteria$")
	public void user_should_add_criteria(String selection) {
		
		
		 for( WebElement element: zurmo.selectField2) {
		    	if(element.getText().equalsIgnoreCase(selection)) {
		    		
		    		element.click();
		    	}
		    }
	}

	@Then("^User should select \"([^\"]*)\" and should enter the date \"([^\"]*)\" and \"([^\"]*)\"$")
	public void user_should_select_and_should_enter_the_date_and(String between, String date1, String date2) throws InterruptedException {
		zurmo.between.click();

		 for( WebElement element: zurmo.selectBetween) {
		    	if(element.getText().equalsIgnoreCase(between)) {
		    		element.click();
		    	}
		    } 
		 zurmo.date1.sendKeys(date1);
		 Thread.sleep(400);
		 zurmo.date2.sendKeys(date2);
		
	}

	@When("^User save the criteria as a \"([^\"]*)\" should see criteria on saved search$")
	public void user_save_the_criteria_as_a_should_see_criteria_on_saved_search(String name) throws InterruptedException {
	  zurmo.saveSearchButton.click();
	  zurmo.searchName.sendKeys(name);
	  zurmo.saveButton.click(); 
	  Thread.sleep(8000);
	  zurmo.SavedSearch.click();
	  Thread.sleep(4000);
	  boolean correct = false; 

		 for( WebElement element: zurmo.loopSavedSearch) {
			 
			 correct=element.getText().equalsIgnoreCase(name); 
	}
		 
		 if(correct) {
		    	Assert.assertTrue(correct);
			 }else {
				 
				 System.out.println("Search option couldn't saved.");
			 }
		 }
	
	
	
///++++++++=============================================================================================================
 //Search Criteria Scenario 2

	
	@When("^User click columns should see Hidden and Visible Columns$")
	public void user_click_columns_should_see_Hidden_and_Visible_Columns() {
	   zurmo.columns.click();
	   Assert.assertTrue(zurmo.hidden.isDisplayed());
	   Assert.assertTrue(zurmo.visible.isDisplayed());
	   int hiddenCol=0; 
	   int visibleCol=0; 
	   for(int i=0; i<zurmo.hiddenColumns.size(); i++) {
		   zurmo.hiddenColumns.get(i); 
		   hiddenCol++; 
		   
	   }
	   for(int i=0; i<zurmo.visibleColumns.size(); i++) {
		   zurmo.visibleColumns.get(i); 
		   visibleCol++; 
		   
	   }
	   
	   Assert.assertEquals(visibleCol+hiddenCol, 29);
	}

	@When("^User should be able to move following options from Hidden Colums to Visible Columbs$")
	public void user_should_be_able_to_move_following_options_from_Hidden_Colums_to_Visible_Columbs(List<String> column) throws InterruptedException {
	   for(int i=0; i< zurmo.hiddenColumns.size(); i++) {
		   for(int k=0; k<column.size(); k++) {
			   
			   
			   if(zurmo.hiddenColumns.get(i).getText().equalsIgnoreCase(column.get(k))) {
				   zurmo.hiddenColumns.get(i).click();
				  Thread.sleep(400);
				   zurmo.arrowRight.click();
			   }
		   }
		   
	   }
		  Thread.sleep(400);

	}


	
	@Then("^User should see updated leads information bar$")
	public void user_should_see_updated_leads_information_bar() throws InterruptedException {
		
		SoftAssert softAssertion= new SoftAssert();

		List<String> list=new ArrayList<String>(); 
		for(int i=0; i<zurmo.visibleColumns.size();i++) {
			list.add(zurmo.visibleColumns.get(i).getText()); 

		  }
		
	   zurmo.applyButton.click();
		  Thread.sleep(6000);
		  List<String> list2=new ArrayList<String>(); 
		  
		  for(int i=0; i<zurmo.informationColums.size();i++) {
			  list2.add(zurmo.informationColums.get(i).getText());
			  
		  }
		
		  
		  softAssertion.assertTrue(ZurmoLeadsPage.compareList(list, list2));

	}




///++++++++=============================================================================================================
//Search Criteria Scenario 3



@When("^User click Items/Own should see the field in alphabetical order$")
public void user_click_Items_Own_should_see_the_field_in_alphabetical_order() {
	zurmo.itemsOwn.click(); 
	zurmo.fieldButton.click(); 

			
	SoftAssert softAssertion= new SoftAssert();
	
	
	for (int i=1 ; i<zurmo.fieldlist.size(); i++ ) {

		for (int k=i+1 ; k<zurmo.fieldlist.size(); k++ ) {
			
		char alphabetic=zurmo.fieldlist.get(i).getText().charAt(0);
		
		char alphabectic2= zurmo.fieldlist.get(k).getText().charAt(0); 
		
		
		softAssertion.assertTrue(alphabetic<=alphabectic2);
		
		}
		
	}
	
}

@Then("^User choose the \"([^\"]*)\" should see the following options$")
public void user_choose_the_should_see_the_following_options(String industry, List<String> industryList1) {
  

	 for( WebElement element: zurmo.fieldlist) {
	    	if(element.getText().equalsIgnoreCase(industry)) {
	    		
	    		element.click();
	    	}
	    }
	 List<String> list=new ArrayList<String>(); 
	 List<String> list2=new ArrayList<String>(); 

	 
	 for(int i=1; i<zurmo.industryList.size(); i++) {
		 
		 list.add(zurmo.industryList.get(i).getText()); 
		 list2.add(industryList1.get(i));
		 
	
	 }


		  Assert.assertTrue(ZurmoLeadsPage.compareList(list, list2));
	 
}


@When("^User choose the \"([^\"]*)\" should save the search criteria$")
public void user_choose_the_should_save_the_search_criteria(String technology) {
  
	for(WebElement element: zurmo.industryList) {
		
		if(element.getText().equalsIgnoreCase(technology)) {
			
			element.click();
		}
	}
	
	zurmo.saveFieldButton.click();
}

}







	


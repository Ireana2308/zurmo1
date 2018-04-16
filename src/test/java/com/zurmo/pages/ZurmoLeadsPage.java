package com.zurmo.pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.zurmo.utilities.Driver;

public class ZurmoLeadsPage {
	
	private WebDriver driver;

	public ZurmoLeadsPage() {
		this.driver = Driver.getDriver();
		PageFactory.initElements(driver, this);
	}
	
	
	@FindBy(xpath="//a[@class='toggle-hidden-nav-items']")
	public WebElement threeDot; 
	
	@FindBy(xpath="(//span[.='Leads'])[2]")
	public WebElement leadsButton; 
	
	
	@FindBy(xpath="(//span[.='Create'])[2]")
	public WebElement createButton; 
	
	
	@FindBy(xpath="//span[.='Update']")
	public WebElement updateButton; 
	
	@FindBy(xpath="//span[.='Export']")
	public WebElement exportButton; 
	
	@FindBy(xpath="//span[.='Delete']")
	public WebElement deleteButton; 
	
	@FindBy(xpath="//span[.='Subscribe']")
	public WebElement subscribeButton; 
	
	@FindBy(xpath="//span[.='Merge']")
	public WebElement mergeButton; 
	
	@FindBy(xpath="(//a[@class='close-ModalGameNotification simple-link'])[2]")
	public WebElement skipButton; 
	//nav.pillbox.clearfix div span
	@FindBy(xpath="//nav[@class='pillbox clearfix']//div//span")
	public List<WebElement> alloptions; 
	
	@FindBy(xpath="//select[@id='Contact_state_id']//option")
	public List<WebElement> status; 
	
	@FindBy(xpath="//select[@id='Contact_source_value']//option")
	public List<WebElement> source; 
	
	@FindBy(xpath="//select[@id='Contact_industry_value']//option")
	public List<WebElement> industry; 
	
	///++++++++=========================================================
	//Create Lead
	
	@FindBy(id="Contact_firstName")
	public WebElement firstName; 
	
	
	@FindBy(id="Contact_lastName")
	public WebElement lastName; 
	
	
	@FindBy(id="Contact_mobilePhone")
	public WebElement mobilePhone; 
	
	@FindBy(id="Contact_jobTitle")
	public WebElement jobTitle; 
	
	
	@FindBy(id="Contact_department")
	public WebElement department; 
	
	@FindBy(id="Contact_companyName")
	public WebElement companyName; 
	
	@FindBy(id="Contact_primaryEmail_emailAddress")
	public WebElement primaryEmail;
	
	@FindBy(xpath="//span[.='Save']")
	public WebElement save; 
	
	@FindBy(xpath="(//li[@class=\"parent last\"])[2]")
	public WebElement admin; 
	
	@FindBy(xpath="//span[.='Sign out']")
	public WebElement SignOut; 
	
	@FindBy(xpath="//a[.='click here'])[2]")
	public WebElement clickSave; 
	
	

	///++++++++=========================================================
    //Search Criteria Scenario 1
	
	@FindBy(id="more-search-link")
	public WebElement advancedButton; 
	
	@FindBy(xpath="(//span[@class=\"z-label\"])[1]")
	public WebElement addCriteria;
	
	@FindBy(xpath="//select[@id=\"LeadsSearchForm_dynamicClauses_0_attributeIndexOrDerivedType\"]")
	public WebElement selectField1; 
	
	
	@FindBy(xpath="//select[@id=\"LeadsSearchForm_dynamicClauses_0_attributeIndexOrDerivedType\"]//option")
	public List<WebElement> selectField2; 
	
	@FindBy(id="LeadsSearchForm_dynamicClauses_0_modifiedDateTime__DateTime_type")
	public WebElement between; 
	
	@FindBy(xpath="//select[@id=\"LeadsSearchForm_dynamicClauses_0_modifiedDateTime__DateTime_type\"]//option")
	public List<WebElement> selectBetween; 
	
	@FindBy(xpath="(//input[@class=\"hasDatepicker\"])[1]")
	public WebElement date1; 
	
	@FindBy(xpath="(//input[@class=\"hasDatepicker\"])[2]")
	public WebElement date2; 
	
	@FindBy(id="save-as-advanced-search")
	public WebElement saveSearchButton; 
	
	@FindBy(id="LeadsSearchForm_savedSearchName")
	public WebElement searchName;
	
	@FindBy(id="save-advanced-search")
	public WebElement saveButton;
	
	@FindBy(id="savedSearchId")
	public WebElement SavedSearch; 
	
	@FindBy(xpath="//select[@id=\"savedSearchId\"]//option")
	public List<WebElement> loopSavedSearch; 
	
	
	///++++++++=========================================================
    //Search Criteria Scenario 2
	
		
	@FindBy(id="select-list-attributes-link")
	public WebElement columns; 
	
	@FindBy(xpath="//div[@class='multiselect-left']//label")
	public WebElement hidden; 
	
	@FindBy(xpath="//div[@class='multiselect-right']//label")
	public WebElement visible; 
	
	@FindBy(xpath="//select[@id='LeadsSearchForm_selectedListAttributes_hidden']//option")
	public List<WebElement> hiddenColumns; 
	
	@FindBy(xpath="//select[@id='LeadsSearchForm_selectedListAttributes']//option")
	public List<WebElement> visibleColumns; 
	
	@FindBy(id="yw2moveRight")
	public WebElement arrowRight; 
	
	@FindBy(id="list-attributes-apply")
	public WebElement applyButton; 
	
	@FindBy(xpath="//thead//tr//th//a")
	public List<WebElement> informationColums;
	
	
	public static boolean compareList(List ls1, List ls2) {
		
		return ls1.toString().contentEquals(ls2.toString())?true:false;
	}
	
	///++++++++=========================================================
    //Search Criteria Scenario 3
	
	@FindBy(id="items-i-own-search-link")
	public WebElement itemsOwn; 
	
	
	@FindBy(id="LeadsSearchForm_dynamicClauses_0_attributeIndexOrDerivedType")
	public WebElement fieldButton; 
	
	
	@FindBy(xpath="//select[@id='LeadsSearchForm_dynamicClauses_0_attributeIndexOrDerivedType']//option")
	public List<WebElement> fieldlist; 
	
	
	@FindBy(xpath="//select[@id='LeadsSearchForm_dynamicClauses_0_industry_value']//option")
	public List<WebElement> industryList; 
	
	
	@FindBy(id="save-as-advanced-search")
	public WebElement saveFieldButton; 
	
	
	@FindBy(id="LeadsSearchForm_savedSearchName")
	public WebElement leadsSearcField; 
	
	
	public List<WebElement> topMenuOptions(String name) {
		
		String xpath="//td[.='"+name+"']"; 
		return driver.findElements(By.xpath(xpath));
	}
	
	
	public String topMenuOption(String name) {
		
		String xpath="//td[.='"+name+"']"; 
		return driver.findElement(By.xpath(xpath)).getText();
	}
	
	


}
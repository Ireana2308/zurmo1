package com.zurmo.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.zurmo.utilities.Driver;

public class ZurmoColumnReportPage {
private WebDriver driver;
	
	public ZurmoColumnReportPage() {
	this.driver=Driver.getDriver();
	PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="(//a[@class='white-button'])[1]")
	public WebElement columnCreatebtn;
	
	@FindBy(xpath="//input[@id='RowsAndColumnsReportWizardForm_moduleClassName_6']")
	public WebElement opportunities;
	
	
	@FindBy(xpath="//a[@id='moduleNextLink']")
	public WebElement nextBt;
	
	@FindBy(xpath="//li[@id='Filters_source']")
	public WebElement fromSource;
	
	@FindBy(xpath="//div[@class='zero-components-view Filters']")
	public WebElement toDrop;
	
	@FindBy(xpath="//li[@id='Filters_createdDateTime']")
	public WebElement fromSDate;
	
	@FindBy(xpath="//select[@id='RowsAndColumnsReportWizardForm_Filters_1_valueType']")
	public WebElement dropSelectDate;
	
	@FindBy(xpath="//a[@id='filterBysNextLink']")
	public WebElement nextButton1;
	
	@FindBy(xpath="//li[@id='DisplayAttributes_name']")
	public WebElement nameSelect;
	
	@FindBy(xpath="//input[@id='RowsAndColumnsReportWizardForm_DisplayAttributes_0_label']")
	public WebElement fieldName; 
	
	@FindBy(xpath="//a[@id='displayAttributesNextLink']")
	public WebElement Ntbtn;
	
	@FindBy(xpath="//li[@id='OrderBys_closeDate']")
	public WebElement closeDate;
	
	@FindBy(xpath="//select[@name='RowsAndColumnsReportWizardForm[OrderBys][0][order]']")
	public WebElement drD;
	
	@FindBy(xpath="select-arrow")
	public WebElement arrowDown; 
	
	@FindBy(xpath="(//div//select[@name='RowsAndColumnsReportWizardForm[OrderBys][0][order]']//option)[2]")
	public WebElement drD1;
	
	@FindBy(xpath="//a[@id='orderBysDataNextLink']")
	public WebElement nBt;
	
	@FindBy(xpath="//input[@id='RowsAndColumnsReportWizardForm_name']")
	public WebElement fName;
	
	@FindBy(xpath="//a[@id='generalDataSaveAndRunLink']")
	public WebElement saveBt;
	
	@FindBy(xpath="//span[@class='ellipsis-content']")
	public WebElement result;
	
	@FindBy(xpath="//input[@class='input-hint anyMixedAttributes-input']")
	public WebElement searchField;
	
	@FindBy(xpath="//div[@id='list-view-summary-clone']")
	public WebElement res;
}

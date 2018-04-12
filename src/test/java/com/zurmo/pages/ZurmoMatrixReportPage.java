package com.zurmo.pages;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.zurmo.utilities.Driver;

public class ZurmoMatrixReportPage {
private WebDriver driver;
	
	public ZurmoMatrixReportPage() {
	this.driver=Driver.getDriver();
	PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//a[@class='toggle-hidden-nav-items']")
	public WebElement dots;
	
	@FindBy(linkText="Reports")
	public WebElement reportsLink;
	
	@FindBy(xpath="//span[@class='button-label']")
	public WebElement creatButton;
	
	@FindBy(xpath="/h4[text()='Rows and Columns Report']/../..//h4")
	public  List <WebElement> listOfReports;
	
	@FindBy(xpath="(//span[@class='z-label'])[3]")
	public WebElement mrcreatBtn;
	
	@FindBy(xpath="//div[@id='ModuleForReportWizardView']//label")
	public List <WebElement> selectList1;
	
	@FindBy(xpath="//input[@id='MatrixReportWizardForm_moduleClassName_4']")
	public WebElement meetingRadioButton;
	
	@FindBy(xpath="(//span[@class=\"z-label\"])[2]")
	public WebElement nextBtn;
	
	@FindBy(xpath="//li[@class='open collapsable lastCollapsable']")
	public List <WebElement> listOfFilters;
	
	@FindBy(xpath="//li[@id='Filters_description']")
	public WebElement fromDescrip;
	
	@FindBy(xpath="//li[@id='Filters_name']")
	public WebElement fromName;
	
	@FindBy(xpath="//div[@class='dynamic-droppable-area']") 
	public WebElement toElement;
	
	@FindBy(xpath="(//div[@class='drop-zone'])[1]") 
	public WebElement toElement1;
	 
	@FindBy(xpath="//div[@class='first-value-area']//input[@id='MatrixReportWizardForm_Filters_0_value']") 
	public WebElement descripField;
	 
	@FindBy(xpath="//input[@id='MatrixReportWizardForm_Filters_1_value']") 
	public WebElement nameField;
	
	
	@FindBy(xpath="//a[@id='filterBysNextLink']") 
	public WebElement btnNext;
	
	@FindBy(xpath="//li[@id='GroupBys_owner__User']")
public WebElement fromOwner;	
	
	@FindBy(xpath="(//div[@class='drop-zone'])[2]") 
	public WebElement toElement2;
	
	@FindBy(xpath="//li[@id='GroupBys_startDateTime__Day']") 
	public WebElement fromStartDay;
	
	@FindBy(xpath="//select[@name='MatrixReportWizardForm[GroupBys][1][axis]']")
	public WebElement SDnarrow;
	
}

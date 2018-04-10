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
	
	
	public List<WebElement> topMenuOptions(String name) {
		
		String xpath="//td[.='"+name+"']"; 
		return driver.findElements(By.xpath(xpath));
	}
	
	
	public String topMenuOption(String name) {
		
		String xpath="//td[.='"+name+"']"; 
		return driver.findElement(By.xpath(xpath)).getText();
	}
	


}
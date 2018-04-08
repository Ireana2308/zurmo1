package com.zurmo.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.zurmo.utilities.Driver;

public class ZurmoContactPage {
private WebDriver driver;
	
	public ZurmoContactPage() {
	this.driver=Driver.getDriver();
	PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//a[@class='button-action']")
	public WebElement creatBtn;
	
	@FindBy(id="Contact_title_value")
	public WebElement prefixV;
	
	@FindBy(xpath="//input[@id='Contact_firstName']")	
	public WebElement contactFirstName;
	
	@FindBy(xpath="//input[@id='Contact_lastName']")
	public WebElement contactLastName;
	
	@FindBy(id="Contact_state_id")
	public WebElement statusS;
	
	@FindBy(id="Contact_jobTitle")
	public WebElement jTitle;
	
	@FindBy(id="Contact_primaryEmail_emailAddress")
	public WebElement email;
	
	@FindBy(xpath="(//span[@class='z-label'])[1]")
	public WebElement save;
	
	
	public void selectPrefixMethod(String prefixName) {
		Select select=new Select(prefixV);
		select.selectByVisibleText(prefixName);
		
	}
	public void selectStatus(String statusChoice) {
	Select choiceStatus=new Select(statusS);
	choiceStatus.selectByVisibleText(statusChoice);
	
		
	}
}

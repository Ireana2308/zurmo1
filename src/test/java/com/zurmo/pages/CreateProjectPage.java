package com.zurmo.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.zurmo.utilities.Driver;

public class CreateProjectPage {
private WebDriver driver;
	
	public CreateProjectPage() {
	this.driver=Driver.getDriver();
	PageFactory.initElements(driver, this);
	}
	@FindBy(xpath="//input[@name='Project[name]']")
	public WebElement nameProject;
	
	@FindBy(xpath="//textarea[@id='Project_description']")
	public WebElement descProject;
	
	@FindBy(xpath="(//ul[@class='token-input-list'])[1]")
	public WebElement accountProject;
	///
	@FindBy(id="token-input-ProjectContactsForm_Contact_ids")
	public WebElement contactProject;
	
	@FindBy(id="token-input-ProjectOpportunitiesForm_Opportunity_ids")
	public WebElement opportunitiesProject;
	
	@FindBy(xpath="//a[@id='saveyt3']//span[@class='z-label']")
	public WebElement saveProject;
	@FindBy(xpath=" //ul[@id='ShortcutsMenu']")
	public WebElement createBtnHover;
	@FindBy(xpath="//a[@href='/zurmo/app/index.php/projects/default/create']")
	public WebElement projectName;
	// create project ends
	
	
}

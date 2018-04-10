package com.zurmo.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import com.zurmo.utilities.Driver;

public class ZurmoHomePage {

private WebDriver driver;
	
	public ZurmoHomePage() {
		
	this.driver=Driver.getDriver();
	PageFactory.initElements(driver, this);
	
	}
	
	@FindBy(id="LoginForm_username")
	public WebElement username;
	
	@FindBy(id="LoginForm_password")
	public WebElement password;
	
	@FindBy(xpath="//span[@class='z-label']")
	public WebElement signInBtn;
	
	@FindBy(linkText="Contacts")
	public WebElement contactsLink;
	
	@FindBy(linkText="Projects")
	public WebElement projectLink; 
	
	@FindBy(linkText="Products")
	public WebElement productsLink; 
	
	@FindBy(linkText="Reports")
	public WebElement reportsLink; 
	
	@FindBy(xpath="//a[@class='toggle-hidden-nav-items']")
	public WebElement dots;
	
	////a[@href='/zurmo/app/index.php/contacts/default']
	@FindBy(xpath="//a[@class='button-action']")
	public WebElement creatBtn;
	
public void loginToZurmo(String userName, String pwd) {
	username.sendKeys(userName);
	password.sendKeys(pwd);
	signInBtn.click();
	

}
}
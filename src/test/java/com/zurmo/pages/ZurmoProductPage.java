package com.zurmo.pages;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.zurmo.utilities.Driver;

public class ZurmoProductPage {
	
	private WebDriver driver;

	public ZurmoProductPage() {
		this.driver = Driver.getDriver();
		PageFactory.initElements(driver, this);
	}
	
	
	@FindBy(xpath="(//a[@class='button-trigger'])[1]")
	public WebElement arrowdown; 
	
	//====
	
	@FindBy(xpath="//a[@href='/zurmo/app/index.php/products/default/create']")
	public WebElement createProduct; 
	
	@FindBy(xpath="//a[@href='/zurmo/app/index.php/products/default/list']")
	public WebElement productText; 
	
	@FindBy(xpath="//div[@class='breadcrumbs']")
	public WebElement productText1; 
	
	@FindBy(xpath="//div[@class='panel']//th//label")
	public List<WebElement> createProductForm; 
	
	
	@FindBy(id="saveyt2")
	public WebElement saveButton; 
	
	@FindBy(xpath="//div[@ inputid ='Product_name']")
	public WebElement nameError; 
	
	@FindBy(xpath="//div[@ inputid ='Product_quantity']")
	public WebElement quantityError;
	
	
	//*******
	//Scenario 2
	//====================================================================================================================
		
		
	@FindBy(id="Product_name")
	public WebElement productName; 
	
	
	@FindBy(id="Product_quantity")
	public WebElement quantityName; 
	
	
	
	@FindBy(id="Product_sellPrice_value")
	public WebElement sellPrice; 
	
	@FindBy(xpath="//span[@class ='ellipsis-content']")
	public WebElement savedProduct; 
	
	
	
	//*******
		//Feature File Catalog Creation Scenario 1
		//====================================================================================================================
			
	
	
	@FindBy(xpath="(//a[@class='button-trigger'])[2]")
	public WebElement arrowdown1; 
	
	
	@FindBy(xpath="//a[@href='/zurmo/app/index.php/productTemplates/default/create']")
	public WebElement createCatatlogProduct; 
	
	
	@FindBy(xpath="//span[@class='ellipsis-content']")
	public WebElement createCatatlogProductPage; 
	
	@FindBy(xpath="//div[@class='left-column full-width']//div//th//label")
	public List<WebElement> createCatalogForm; 
	
	@FindBy(id="saveyt3")
	public WebElement saveButton1; 
	
	
	@FindBy(xpath="//div[@inputid ='ProductTemplate_name']")
	public WebElement nameError1; 
	
	
	
	//*******
			//Feature File Catalog Creation Scenario 2
			//=========================================================================
				
	@FindBy(id="ProductTemplate_name")
	public WebElement catalogName; 
	
	@FindBy(id="ProductTemplate_description")
	public WebElement catalogDescription; 
	
	@FindBy(xpath="//ul[@class='token-input-list']")
	public WebElement catalogCategories; 
	
	
	@FindBy(id="ProductTemplate_cost_value")
	public WebElement catalogCost; 
	
	@FindBy(id="ProductTemplate_listPrice_value")
	public WebElement catalogListPrice; 
	
	@FindBy(id="ProductTemplate_sellPrice_value")
	public WebElement catalogSellPrice;
	
	
	@FindBy(xpath="//span[@class='ellipsis-content']")
	public WebElement savedCatalog; 
	
	
	public void sendKey(WebElement element, String str) {
		
		element.sendKeys(str);
		
	}
	

}

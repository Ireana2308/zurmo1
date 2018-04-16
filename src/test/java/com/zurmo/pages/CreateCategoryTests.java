package com.zurmo.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.zurmo.utilities.Driver;

public class CreateCategoryTests {
	private WebDriver driver;

	public CreateCategoryTests() {
		this.driver = Driver.getDriver();
		PageFactory.initElements(driver, this);

	}

	@FindBy(xpath = "//a[@class='toggle-hidden-nav-items']")
	public WebElement hiddenbutton;
	@FindBy(id = "products")
	public WebElement productbutton;

	@FindBy(xpath = "//i[@class='icon-product-categories']")
	public WebElement categorybutton;
	@FindBy(xpath = "//span[@class='z-label']")
	public WebElement createCategorybutton;
	@FindBy(id = "ProductCategory_name")
	public WebElement createCategoryfield;
	@FindBy(xpath = "//a[@id='saveyt3']")
	public WebElement saveButton;

	public void category(String kach) throws InterruptedException {
		categorybutton.click();
		createCategorybutton.click();
		createCategoryfield.sendKeys(kach);
	     saveButton.click();

	}
///creat cat
	@FindBy(id = "products")
	public WebElement productbutton2;
	@FindBy(xpath = "//i[@class='icon-product-categories']")
	public WebElement categorybutton2;
	@FindBy(css = "#ProductCategoriesTreeListView td a")
	public WebElement createdProductName;
	@FindBy(css = "#ProductCategoriesTreeListView td a")
	public WebElement deleteProductName;
	@FindBy(xpath = "//div[@class='view-toolbar']")
	public WebElement optionbutton;
	@FindBy(xpath = "//span[.='Delete']")
	public WebElement deletebutton;
	
	
	
	

}

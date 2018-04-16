package com.zurmo.pages;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.zurmo.utilities.Driver;

public class CreatProductTest {
	
	private WebDriver driver;
	public CreatProductTest() {
		this.driver=Driver.getDriver();
		PageFactory.initElements(driver, this);
		
	}
	@FindBy(xpath = "//a[@class='toggle-hidden-nav-items']")
	public WebElement hiddenbutton3;
	@FindBy(id = "products")
	public WebElement productbutton3;
	
	
	@FindBy(xpath = "//span[@class='button-label']")
	public List <WebElement>Products;
	

	@FindBy(xpath = "(//span[@class='button-label'])[4]")
	public WebElement updateButton;
	
	
	@FindBy(css = "#list-view-massActionSelected a")
	public WebElement selected;

	@FindBy(css = "#list-view-massActionAll a")
	public WebElement allresult;

	@FindBy(xpath = "(//label[@class='hasCheckBox'])[1]")
	public WebElement ownerbutton;
	@FindBy(xpath = "(//label[@class='hasCheckBox'])[2]")
	public WebElement stagebutton;
	@FindBy(xpath = "//input[@id='Product_owner_name']")
	public WebElement ownerfield;
	
	@FindBy(xpath = "//select[@id='Product_stage_value']")
	public WebElement selectarrow;
	@FindBy(xpath = "//select[@id='Product_stage_value']//option")
	public  List <WebElement> assertoptions;
	
	@FindBy(id = "saveyt1")
	public WebElement save;
	
	
	
	
	
	

}

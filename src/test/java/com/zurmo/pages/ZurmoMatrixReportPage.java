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
	
	@FindBy(xpath="//div[@class='radio-input']")
	public List <WebElement> selectList;
}

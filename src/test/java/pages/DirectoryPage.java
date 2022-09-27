package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;


public class DirectoryPage extends BasePage {
	
	WebDriver driver;
		
	@FindBy(css="div[class*='oxd-select-text']")
	WebElement _dropdown_jobtitle;
	@FindBy(xpath="//h6[contains(.,'Directory')]")
	WebElement _title_header;
	@FindBy(css="button[type*='submit']")
	WebElement _btn_search_employee;
	@FindBy(xpath="(//div[@class='oxd-select-text--after'])[2]")

	WebElement _dropdown_location;
	

	
	public DirectoryPage(WebDriver driver) {	
		super(driver);
		this.driver = driver;
	}	
	
	public void selectDesiredJobTitle(String jobTitle) {
		String selectLocator = "//span[contains(.,'"+ jobTitle +"')]";
		waitForElementToBeClickable(this._dropdown_jobtitle).click();
		WebElement desiredJobTitleOption = driver.findElement(By.xpath(selectLocator));
		waitForElementToBeClickable(desiredJobTitleOption).click();
	}
	
	public void directoryTitleValidation(String expectedTitle) {
		waitForElementToBeVisible(this._title_header);
		Assert.assertEquals(_title_header.getText(), expectedTitle);
	}
	
	public void goTo(){
		SidebarPage sidebPage = new SidebarPage(driver);
		sidebPage.goToDirectoryPage();
	}
	public void clickTheSearchEmployeeButn(){
		_btn_search_employee.click();
	}
	
	public void searchJobTitleResultValidation(String jobTitle) {
		String jobTtlCardLocator = "//p[contains(.,'"+ jobTitle +"')]";
		WebElement jobTitleCard = driver.findElement(By.xpath(jobTtlCardLocator));
		Assert.assertEquals(jobTitleCard.getText(), jobTitle);
	}
	
	public void selectDesiredLocation(String location) {
		String selectLocator = "//span[contains(.,'"+ location +"')]";
		waitForElementToBeClickable(this._dropdown_location).click();
		WebElement desiredLocationOption = driver.findElement(By.xpath(selectLocator));
		waitForElementToBeClickable(desiredLocationOption).click();
	}
	
	public void searchLocationResultValidation(String location) {
		String locationCardLocator = "//p[contains(.,'"+ location +"')]";
		WebElement locationTitleCard = driver.findElement(By.xpath(locationCardLocator));
		Assert.assertEquals(locationTitleCard.getText(), location);
	}

}




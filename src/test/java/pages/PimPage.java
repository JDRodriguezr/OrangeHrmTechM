package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;


public class PimPage extends BasePage{
	
	@FindBy(xpath="//h6[contains(.,'PIM')]")
	WebElement _title_header;
	@FindBy(linkText="Admin")
	WebElement _mainMenu_admin;	
	@FindBy(linkText="Leave")
	WebElement _mainMenu_leave;
	@FindBy(linkText="Time")
	WebElement _mainMenu_time;
	@FindBy(linkText="Recruitment")
	WebElement _mainMenu_recruitment;
	@FindBy(linkText="My info")
	WebElement _mainMenu_info;
	@FindBy(linkText="Performance")
	WebElement _mainMenu_performance;
	@FindBy(linkText="Dashboard")
	WebElement _mainMenu_dashboard;
	@FindBy(linkText="Directory")
	WebElement _mainMenu_directory;
	@FindBy(linkText="Maintenance")
	WebElement _mainMenu_maintenance;
	@FindBy(linkText="Buzz")
	WebElement _mainMenu_buzz;
	@FindBy(className="oxd-brand")
	WebElement _mainMenu_ohrmLogo;
	@FindBy(linkText="Add Employee")
	WebElement _btn_add_employee;
	
	
	public PimPage(WebDriver driver) {
		super(driver);
	}
	
	public void userIsOnPimPageValidation(String expectedTitle) {
		Assert.assertEquals(_title_header.getText(), expectedTitle);
	}
	public void goToAdminPage() {
		this.wait.until(ExpectedConditions.elementToBeClickable(this._mainMenu_admin));
		_mainMenu_admin.click();
	}
	public void clickAddEmployeeBtn() {
		this.wait.until(ExpectedConditions.elementToBeClickable(this._btn_add_employee));
		_btn_add_employee.click();
	}
	
	
}
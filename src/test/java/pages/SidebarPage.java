package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;

public class SidebarPage extends BasePage {
	
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
	@FindBy(linkText="Configuration")
	WebElement _configuration_dropdown;
	
	
	public SidebarPage(WebDriver driver) {
		super(driver);
	}	
	public void goToAdminPage() {
		this.wait.until(ExpectedConditions.elementToBeClickable(this._mainMenu_admin));
		_mainMenu_admin.click();
	}
	public void goToLeavePage() {
		this.wait.until(ExpectedConditions.elementToBeClickable(this._mainMenu_leave));
		_mainMenu_leave.click();
	}
	public void goToTimePage() {
		this.wait.until(ExpectedConditions.elementToBeClickable(this._mainMenu_time));
		_mainMenu_time.click();
	}
	public void goToRecruitmentPage() {
		this.wait.until(ExpectedConditions.elementToBeClickable(this._mainMenu_recruitment));
		_mainMenu_recruitment.click();
	}
	public void goToDashboardPage() {
		this.wait.until(ExpectedConditions.elementToBeClickable(this._mainMenu_dashboard));
		_mainMenu_dashboard.click();
	}
	public void goToDirectoryPage() {
		this.wait.until(ExpectedConditions.elementToBeClickable(this._mainMenu_directory));
		_mainMenu_directory.click();
	}
	public void goToMaintenancePage() {
		this.wait.until(ExpectedConditions.elementToBeClickable(this._mainMenu_maintenance));
		_mainMenu_maintenance.click();
	}
	public void goToBuzzPage() {
		this.wait.until(ExpectedConditions.elementToBeClickable(this._mainMenu_buzz));
		_mainMenu_buzz.click();
	}
	public void goToOrangeHomePage() {
		this.wait.until(ExpectedConditions.elementToBeClickable(this._mainMenu_ohrmLogo));
		_mainMenu_ohrmLogo.click();
	}

}

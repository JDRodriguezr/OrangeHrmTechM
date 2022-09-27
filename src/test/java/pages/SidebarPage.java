package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;

public class SidebarPage extends BasePage {
	
	@FindBy(xpath="//h6[contains(.,'PIM')]")
	WebElement _title_header;
	@FindBy(linkText="Admin")
	WebElement _mainmenu_admin;
	@FindBy(linkText="Leave")
	WebElement _mainmenu_leave;
	@FindBy(linkText="Time")
	WebElement _mainmenu_time;
	@FindBy(linkText="Recruitment")
	WebElement _mainmenu_recruitment;
	@FindBy(linkText="Dashboard")
	WebElement _mainmenu_dashboard;
	@FindBy(linkText="Directory")
	WebElement _mainmenu_directory;
	@FindBy(linkText="Maintenance")
	WebElement _mainmenu_maintenance;
	@FindBy(linkText="Buzz")
	WebElement _mainmenu_buzz;
	@FindBy(className="oxd-brand")
	WebElement _mainmenu_ohrmLogo;
	String orange_home_title = "OrangeHRM HR Software | Free & Open Source HR Software | HRMS | HRIS | OrangeHRM";
		
	
	public SidebarPage(WebDriver driver) {
		super(driver);
	}	
	public void goToAdminPage() {
		this.wait.until(ExpectedConditions.elementToBeClickable(this._mainmenu_admin));
		_mainmenu_admin.click();
	}
	public void goToLeavePage() {
		this.wait.until(ExpectedConditions.elementToBeClickable(this._mainmenu_leave));
		_mainmenu_leave.click();
	}
	public void goToTimePage() {
		this.wait.until(ExpectedConditions.elementToBeClickable(this._mainmenu_time));
		_mainmenu_time.click();
	}
	public void goToRecruitmentPage() {
		this.wait.until(ExpectedConditions.elementToBeClickable(this._mainmenu_recruitment));
		_mainmenu_recruitment.click();
	}
	public void goToDashboardPage() {
		this.wait.until(ExpectedConditions.elementToBeClickable(this._mainmenu_dashboard));
		_mainmenu_dashboard.click();
	}
	public void goToDirectoryPage() {
		this.wait.until(ExpectedConditions.elementToBeClickable(this._mainmenu_directory));
		_mainmenu_directory.click();
	}
	public void goToMaintenancePage() {
		this.wait.until(ExpectedConditions.elementToBeClickable(this._mainmenu_maintenance));
		_mainmenu_maintenance.click();
	}
	public void goToBuzzPage() {
		this.wait.until(ExpectedConditions.elementToBeClickable(this._mainmenu_buzz));
		_mainmenu_buzz.click();
	}
	public void goToOrangeHomePage() {
		this.wait.until(ExpectedConditions.elementToBeClickable(this._mainmenu_ohrmLogo));
		_mainmenu_ohrmLogo.click();
	}
	public void orangeHomePageValidation() {
		Assert.assertEquals(driver.getTitle(), orange_home_title);
	}

}

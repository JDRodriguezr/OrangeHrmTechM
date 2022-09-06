package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;


public class DashboardPage extends BasePage {
	
	WebDriver driver;
		
	@FindBy(css="h4[class*='orangehrm-module-under-development-heading']")
	WebElement _msg_launchingSoon;
	@FindBy(xpath="//h6[contains(.,'Dashboard')]")
	WebElement _title_header;
	

	
	public DashboardPage(WebDriver driver) {		
		super(driver);
		this.driver = driver;
	}
	
	
	public void launchSoonTitleValidation(String expectedTitle) {
		waitForElementToBeVisible(this._msg_launchingSoon);
		Assert.assertEquals(_msg_launchingSoon.getText(), expectedTitle);
	}
	
	public void dashboardTitleValidation(String expectedTitle) {
		waitForElementToBeVisible(this._title_header);
		Assert.assertEquals(_title_header.getText(), expectedTitle);
	}
	
	public void clickTheDashboardOption() {
		SidebarPage sidebPage = new SidebarPage(driver);
		sidebPage.goToDashboardPage();
	}
	
}




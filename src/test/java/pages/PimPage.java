package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;


public class PimPage {
	
	WebDriver driver;
	
	public static final By _title_header = By.xpath("//h6[contains(.,'PIM')]");
	public static final By _mainMenu_admin = By.linkText("Admin");
	public static final By _mainMenu_leave = By.linkText("Leave");
	public static final By _mainMenu_time = By.linkText("Time");
	public static final By _mainMenu_recruitment = By.linkText("Recruitment");
	public static final By _mainMenu_info = By.linkText("My info");
	public static final By _mainMenu_performance = By.linkText("Performance");
	public static final By _mainMenu_dashboard = By.linkText("Dashboard");
	public static final By _mainMenu_directory = By.linkText("Directory");
	public static final By _mainMenu_maintenance = By.linkText("Maintenance");
	public static final By _mainMenu_buzz = By.linkText("Buzz");
	public static final By _mainMenu_ohrmBanner = By.className("oxd-brand");

	
	public PimPage(WebDriver driver) {
		this.driver = driver;
	}	
	
	public void validateTitle(String expectedTitle) {
		Assert.assertEquals(driver.findElement(_title_header).getText(), expectedTitle);
	}
	
}
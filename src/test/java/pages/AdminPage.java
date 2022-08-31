package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;


public class AdminPage extends BasePage{
	
	public AdminPage(WebDriver driver) {
		super(driver);
	}
	@FindBy(xpath="//h6[contains(.,'Admin')]")
	WebElement _title_header;
	@FindBy(linkText="Nationalities")
	WebElement _topBar_nationalities;	
	@FindBy(linkText="Corporate Branding")
	WebElement _topBar_corporate_branding;
		
	
}
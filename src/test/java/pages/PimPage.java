package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;


public class PimPage extends BasePage{
	
	public PimPage(WebDriver driver) {
		super(driver);
	}


	@FindBy(linkText="Add Employee")
	WebElement _btn_add_employee;	
	@FindBy(linkText="Reports")
	WebElement _btn_reports;
	@FindBy(xpath="//h6[contains(.,'PIM')]")
	WebElement _title_header;
	@FindBy(name="firstName")
	WebElement _txt_firstname;
	@FindBy(name="middleName")
	WebElement _txt_middlename;
	@FindBy(name="lastName")
	WebElement _txt_lastname;
	@FindBy(xpath="//button[@type='submit']")
	WebElement _btn_save;
	@FindBy(css="oxd-form-loader")
	WebElement divObstructor;
	
	
	public void goToEmployeePage() {
		this.wait.until(ExpectedConditions.elementToBeClickable(this._btn_add_employee));
		_btn_add_employee.click();
	}
	public void goToReports() {
		this.wait.until(ExpectedConditions.elementToBeClickable(this._btn_reports));
		_btn_reports.click();		
	}
	public void userIsOnPimPageValidation(String expectedTitle) {
		Assert.assertEquals(_title_header.getText(), expectedTitle);
	}
	public void addBasicEmployee(){
		this.wait.until(ExpectedConditions.elementToBeClickable(this._txt_middlename)).sendKeys("firstname");
		this.wait.until(ExpectedConditions.elementToBeClickable(this._txt_firstname)).sendKeys("middlename");
		this.wait.until(ExpectedConditions.elementToBeClickable(this._txt_lastname)).sendKeys("lastname");
		this.wait.until(ExpectedConditions.invisibilityOfAllElements(this.divObstructor));
		this.wait.until(ExpectedConditions.visibilityOf(this._btn_save)).click();
		
		
	}
	
}
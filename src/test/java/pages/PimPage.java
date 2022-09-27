package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.openqa.selenium.support.FindBy;



public class PimPage extends BasePage{
	
	public PimPage(WebDriver driver) {
		super(driver);
		this.driver = driver;
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
	@FindBy(xpath="(//div[@role='cell'])[2]")
	WebElement _first_listed_employee;
	@FindBy(xpath="//h6[normalize-space()='Personal Details']")
	WebElement _txt_personal_details;
	@FindBy(css="input[placeholder*='Type for hints']")
	WebElement _input_search_report;
	@FindBy(css="button[type*='submit']")
	WebElement _btn_search_report;
	@FindBy(css="i[class*='oxd-icon bi-file-text-fill']")
	WebElement _btn_third_option_report;
	@FindBy(xpath="//h6[contains(.,'All Employee')]")
	WebElement _title_report_header;
	@FindBy(css="span[class='oxd-topbar-body-nav-tab-item']")
	WebElement _dropdown_configuration;
	@FindBy(css="span[class*='oxd-switch-input']")
	WebElement _slider_on_optionalfields;
	@FindBy(css="button[type='submit']")
	WebElement _btn_save_pimconfig;
	@FindBy(css=".oxd-text.oxd-text--p.oxd-text--toast-title.oxd-toast-content-text")
	WebElement _msg_optionalfields_success;
	@FindBy(linkText="Optional Fields")
	WebElement _option_pim_cfg_optionalfields;
	@FindBy(xpath="(//button[@type='button'])[4]")
	WebElement _thrash_icon;
	
	
	
	public void goToAddEmployeePage() {
		waitForElementToBeClickable(this._btn_add_employee).click();
	}
	public void goToReports() {
		waitForElementToBeClickable(this._btn_reports).click();	
	}
	public void userIsOnPimPageValidation(String expectedTitle) {
		Assert.assertEquals(_title_header.getText(), expectedTitle);
	}
	public void userIsOnReportInformationPage(String expectedReportInfoPage) {
		Assert.assertEquals(_title_report_header.getText(), expectedReportInfoPage);
	}
	public void fillsTheForm(String name, String middleName, String lastName){
		waitForElementToBeClickable(this._txt_firstname).sendKeys(name);
		waitForElementToBeClickable(this._txt_middlename).sendKeys(middleName);
		waitForElementToBeClickable(this._txt_lastname).sendKeys(lastName);
	}
	public void clicksSaveBtn(){
		waitForElementToBeInvisible(this.divObstructor);
		waitForElementToBeVisible(this._btn_save).click();
	}
	public void userIsOnPersonalDetailsValidation(String expectedTitle) {
		Assert.assertEquals(_txt_personal_details.getText(), expectedTitle);
	}
	public void clicksOnTheFirstEmployee(){
		waitForElementToBeInvisible(this.divObstructor);
		waitForElementToBeVisible(this._first_listed_employee).click();
	}
	public void searchForReport(String reportName) {
		waitForElementToBeVisible(this._input_search_report).sendKeys(reportName);
	}
	public void clickSearchBtn(){
		waitForElementToBeClickable(this._btn_search_report).click();
	}	
	public void clicksReportThirdOption(){
		waitForElementToBeClickable(this._btn_third_option_report).click();
	}
	public void selectsOptionalFields(){
		waitForElementToBeVisible(this._dropdown_configuration).click();
		waitForElementToBeVisible(_option_pim_cfg_optionalfields);
		waitForElementToBeClickable(_option_pim_cfg_optionalfields).click();
	}
	public void clickOnSlider() {
		waitForElementToBeInvisible(this.divObstructor);
		waitForElementToBeClickable(this._slider_on_optionalfields).click();
	}
	public void clickOnSavePimConfig(){
		waitForElementToBeClickable(this._btn_save_pimconfig).click();
	}
	public void successMsgValidation(){
		Assert.assertTrue(waitForElementToBeVisible(this._msg_optionalfields_success).isDisplayed());
	}
	public void deleteJobTitle() {
		waitForElementToBeClickable(_thrash_icon).click();
	}
	
}
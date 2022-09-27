package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.openqa.selenium.support.FindBy;


public class AdminPage extends BasePage{
	
	public AdminPage(WebDriver driver) {
		super(driver);
		this.driver = driver;
	}
	
	@FindBy(xpath="//h6[contains(.,'Admin')]")
	WebElement _title_header;
	@FindBy(xpath="//header[@class='oxd-topbar']//li[5]")
	WebElement _topBar_nationalities;	
	@FindBy(linkText="Corporate Branding")
	WebElement _topBar_corporate_branding;
	@FindBy(xpath="//i[@class='oxd-icon bi-plus oxd-button-icon']")
	WebElement _btn_nationalities_add;
	@FindBy(xpath="(//*[@class='oxd-input oxd-input--active'])[2]")
	WebElement _input_nationality;
	@FindBy(css="button[type='submit']")
	WebElement _btn_save_new_nationality;
	@FindBy(css=".oxd-text.oxd-text--p.oxd-text--toast-title.oxd-toast-content-text")
	WebElement _msg_action_success;
	@FindBy(css="oxd-form-loader")
	WebElement _form_loader;
	@FindBy(linkText="Corporate Branding")
	WebElement _txt_corporate_branding;
	@FindBy(xpath="(//*[@class='oxd-color-input-preview'])[1]")
	WebElement _primary_color_preview;
	@FindBy(css="input[class*=oxd-color-picker-range]")
	WebElement _slider_color;
	@FindBy(css="button[type='submit']")
	WebElement _btn_publish_change_branding;
	@FindBy(xpath="//li[2]/span")
	WebElement _dropdown_job_header;

	@FindBy(linkText="Job Titles")
	WebElement _txt_job_titles;
	@FindBy(xpath="//button[normalize-space()='Add']")
	WebElement _btn_add_job_title;
	@FindBy(xpath="(//*[@class='oxd-input oxd-input--active'])[2]")
	WebElement _input_add_job_title;
	@FindBy(css="button[type='submit']")
	WebElement _btn_save_new_job_title;
	@FindBy(xpath="//span[@class='oxd-text oxd-text--span oxd-input-field-error-message oxd-input-group__message']")
	WebElement _errmsg_already_exists;
	@FindBy(xpath="(//button[@type='button'])[3]")
	WebElement _thrash_icon;
	@FindBy(css="button[class*='oxd-button--medium oxd-button--label-danger']")
	WebElement _btn_delete_confirmation;
	@FindBy(xpath="//button[normalize-space()='Add']")
	WebElement _btn_add_pay_grades;
	@FindBy(linkText="Pay Grades")
	WebElement _txt_pay_grades;
	@FindBy(xpath="(//*[@class='oxd-input oxd-input--active'])[2]")
	WebElement _input_pay_grade_name;
	@FindBy(css=".oxd-text.oxd-text--p.oxd-text--toast-title.oxd-toast-content-text")
	WebElement _msg_info_records_not_found;
	String job_title;
	
	public void goToAdminPage() {
		SidebarPage sidebPage = new SidebarPage(driver);
		sidebPage.goToAdminPage();
	}
	public void clickNationalitiesAddBtn() {
		waitForElementToBeClickable(_btn_nationalities_add).click();
	}
	public void inputNewNationality(String nationality) {
		waitForElementToBeClickable(_input_nationality).sendKeys(nationality);	
	}
	public void adminTitleValidation(String expectedTitle) {
		waitForElementToBeVisible(this._title_header);
		Assert.assertEquals(_title_header.getText(), expectedTitle);
	}
	public void clickNationalitiesTopBarBtn() {
		waitForElementToBeVisible(_topBar_nationalities);
		waitForElementToBeClickable(_topBar_nationalities).click();	
	}
	public void clickNationalitiesSaveBtn() {
		waitForElementToBeInvisible(_form_loader);
		waitForElementToBeClickable(_btn_save_new_nationality).click();
	}
	public void addNewNationalityValidation() {
		waitForElementToBeVisible(_msg_action_success);
	}
	public void clickOnCorporateBranding() {
		_txt_corporate_branding.click();
	}
	public void selectNewColor() {
		waitForElementToBeInvisible(_form_loader);
		_primary_color_preview.click();
		waitForElementToBeVisible(_slider_color);
		_slider_color.click();
		Actions actions = new Actions(driver);
		actions.moveToElement(_slider_color, 40, 0).click().build().perform();
	}
	public void clickPublishButton() {
		_btn_publish_change_branding.click();
	}
	public void primaryColorChangeValidation() {		
		waitForElementToBeVisible(_msg_action_success);
		waitForElementToBeVisible(_primary_color_preview);
		driver.findElement(By.cssSelector("div[style*='background-color: rgb(59, 29, 255); opacity: 1; cursor: pointer;'"));
	}
	public void clickJobTopBarBtn() {
		waitForElementToBeClickable(_dropdown_job_header).click();
	}
	public void clickJobTitleOption() {
		waitForElementToBeVisible(_txt_job_titles).click();
	}
	public void clickBtnAddJobTitle() {
		waitForElementToBeClickable(_btn_add_job_title).click();
	}
	public void entersJobTitle(String jobTitle) {
		waitForElementToBeVisible(_input_add_job_title).sendKeys(jobTitle);
		this.job_title = jobTitle;
	}
	public void createdJobValidation() {
		String jobTitleCardxPath = "//div[contains(text(),'"+ job_title +"')]";
		waitForElementToBeVisible(driver.findElement(By.xpath(jobTitleCardxPath)));
	}
	public void clickSaveBtn() {
		waitForElementToBeInvisible(_form_loader);
		waitForElementToBeClickable(_btn_save_new_job_title).click();
	}
	public void existingTitleErrorValidation() {
		waitForElementToBeVisible(_errmsg_already_exists);
	}
	public void deleteJobTitle() {
		waitForElementToBeClickable(_thrash_icon).click();
	}
		
	public void clickDeleteConfirmation() {
		waitForElementToBeClickable(_btn_delete_confirmation).click();
	}
	public void clickPayGrades() {
		waitForElementToBeVisible(_txt_pay_grades).click();
	}
	public void clickBtnAddPayGrade() {
		waitForElementToBeClickable(_btn_add_pay_grades).click();
	}
	public void entersPayGradeName(String payGrade) {
		waitForElementToBeVisible(_input_pay_grade_name).sendKeys(payGrade);
	}
	public void addNewPayGradeValidation() {
		waitForElementToBeVisible(_msg_action_success);
	}
	public void addNewPayGradeInfoRecordsNotfound() {
		waitForElementToBeVisible(_msg_info_records_not_found);
	}
	public void alreadyExistPayGradeValidation() {
		waitForElementToBeVisible(_errmsg_already_exists);
	}
}
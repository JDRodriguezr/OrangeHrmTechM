package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;


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
	WebElement _btn_nationalitiesAdd;
	@FindBy(xpath="(//*[@class='oxd-input oxd-input--active'])[2]")
	WebElement _input_nationality;
	@FindBy(css="button[type='submit']")
	WebElement _btn_save_newNationality;
	@FindBy(css=".oxd-text.oxd-text--p.oxd-text--toast-title.oxd-toast-content-text")
	WebElement _msg_actionSuccess;
	@FindBy(css="oxd-form-loader")
	WebElement _formLoader;
	@FindBy(linkText="Corporate Branding")
	WebElement _txt_corporateBranding;
	@FindBy(xpath="(//*[@class='oxd-color-input-preview'])[1]")
	WebElement _primaryColorPreview;
	@FindBy(css="input[class*=oxd-color-picker-range]")
	WebElement _slider_color;
	@FindBy(css="button[type='submit']")
	WebElement _btn_publish_changeBranding;
	@FindBy(xpath="//li[2]/span")
	WebElement _dropdown_jobHeader;
	@FindBy(linkText="Job Titles")
	WebElement _txt_jobTitles;
	@FindBy(xpath="//button[normalize-space()='Add']")
	WebElement _btn_addJobTitle;
	@FindBy(xpath="(//*[@class='oxd-input oxd-input--active'])[2]")
	WebElement _input_addJobTitle;
	@FindBy(css="button[type='submit']")
	WebElement _btn_save_newJobTitle;
	String jobTitle;
	
	public void goToAdminPage() {
		SidebarPage sidebPage = new SidebarPage(driver);
		sidebPage.goToAdminPage();
	}
	public void clickNationalitiesAddBtn() throws InterruptedException{
		Thread.sleep(2000);
		waitForElementToBeClickable(_btn_nationalitiesAdd).click();	
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
		waitForElementToBeInvisible(_formLoader);
		waitForElementToBeClickable(_btn_save_newNationality).click();	
	}
	public void addNewNationalityValidation() {
		waitForElementToBeVisible(_msg_actionSuccess);
	}
	public void clickOnCorporateBranding() {
		_txt_corporateBranding.click();
	}
	public void selectNewColor() {
		waitForElementToBeInvisible(_formLoader);
		_primaryColorPreview.click();
		waitForElementToBeVisible(_slider_color);
		_slider_color.click();
		Actions actions = new Actions(driver);
		actions.moveToElement(_slider_color, 40, 0).click().build().perform();
	}
	public void clickPublishButton() {
		_btn_publish_changeBranding.click();
	}
	public void primaryColorChangeValidation() {		
		waitForElementToBeVisible(_msg_actionSuccess);
		waitForElementToBeVisible(_primaryColorPreview);
		driver.findElement(By.cssSelector("div[style*='background-color: rgb(59, 29, 255); opacity: 1; cursor: pointer;'"));
	}
	public void clickJobTopBarBtn() {
		waitForElementToBeClickable(_dropdown_jobHeader).click();
	}
	public void clickJobTitleOption() {
		waitForElementToBeVisible(_txt_jobTitles).click();
		
	}
	public void clickBtnAddJobTitle() throws InterruptedException{
		Thread.sleep(2000);
		waitForElementToBeClickable(_btn_addJobTitle).click();
	}
	public void entersNewJobTitle(String jobTitle) {
		waitForElementToBeVisible(_input_addJobTitle).sendKeys(jobTitle);
		this.jobTitle = jobTitle;		
	}
	public void createdJobValidation() {
		String jobTitleCardxPath = "//div[contains(text(),'"+jobTitle+"')]";
		waitForElementToBeVisible(driver.findElement(By.xpath(jobTitleCardxPath)));
	}
	public void clickSaveBtn() {
		waitForElementToBeInvisible(_formLoader);
		waitForElementToBeClickable(_btn_save_newJobTitle).click();		
	}
	
	
	
	
}
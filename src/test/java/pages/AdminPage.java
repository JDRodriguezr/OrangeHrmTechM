package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
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
	WebElement _msg_addNationality_success;
	@FindBy(css="oxd-form-loader")
	WebElement _formLoader;
	
	
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
		waitForElementToBeVisible(_msg_addNationality_success);
	}
}
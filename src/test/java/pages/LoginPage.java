package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;



public class LoginPage extends BasePage {
	
	WebDriver driver;
	
	@FindBy(name="username")
	WebElement _txt_username;	
	@FindBy(name="password")
	WebElement _txt_password;	
	@FindBy(xpath="//button[@type='submit']")
	WebElement _btn_login;
	@FindBy(css="span[class*='oxd-userdropdown-tab']")
	WebElement _profile_pictureDropdown;
	@FindBy(linkText="Logout")
	WebElement _logoutOption;
	@FindBy(xpath="//h5[contains(.,'Login')]")
	WebElement _txt_h5LoginTitle;
	@FindBy(linkText="Support")
	WebElement _supportOption;
	@FindBy(linkText="About")
	WebElement _aboutOption;
	@FindBy(linkText="Change Password")
	WebElement _input_changePassword;
	@FindBy(xpath="//p[normalize-space()='39']")
	WebElement _txt_about_activeEmployees;
	@FindBy(css="div[class*='oxd-sheet oxd-sheet--rounded']")
	WebElement _about_popOutWindow;
	@FindBy(xpath="//h6[normalize-space()='About']")
	WebElement _about_popOutWindow_title;
	@FindBy(css="img[alt='help image']")
	WebElement _img_customerSupport;
	@FindBy(xpath="(//*[@class='oxd-input oxd-input--active'])[2]")
	WebElement _input_currentPassword;
	@FindBy(xpath="//div[@class='oxd-grid-item oxd-grid-item--gutters user-password-cell']//div[@class='oxd-input-group oxd-input-field-bottom-space']//div//input[@type='password']")
	WebElement _input_newPassword;
	@FindBy(xpath="//div[@class='oxd-form-row user-password-row']//div[@class='oxd-grid-2 orangehrm-full-width-grid']//div[@class='oxd-grid-item oxd-grid-item--gutters']//div[@class='oxd-input-group oxd-input-field-bottom-space']//div//input[@type='password']")
	WebElement _input_confirmNewPassword;
	@FindBy(css=".oxd-text.oxd-text--p.oxd-text--toast-title.oxd-toast-content-text")
	WebElement _msg_success;
	@FindBy(css="button[type='submit']")
	WebElement _btn_save;
	@FindBy(xpath="//button[normalize-space()='Cancel']")
	WebElement _btn_cancel; 
	@FindBy(css="i[class*='bi-exclamation-circle']")
	WebElement _icon_invalidCredentials;
		
	public final String URL_LOGIN= "https://opensource-demo.orangehrmlive.com/web/index.php/auth/login";
	
	public LoginPage(WebDriver driver) {		
		super(driver);
		this.driver = driver;
	}	
	public void attemptToLogin(String username, String password) {
		enterUsername(username);
		enterPassword(password);
		clickLogin();
	}	
	private void enterUsername(String username) {		
		waitForElementToBeVisible(_txt_username).sendKeys(username);
	}	
	private void enterPassword(String password) {		
		waitForElementToBeVisible(_txt_password).sendKeys(password);
	}	
	private void clickLogin() {
		waitForElementToBeVisible(_btn_login).click();
	}	
	public void goTo() {
		this.driver.get(URL_LOGIN);
	}
	public void clickProfilePic() {
		waitForElementToBeClickable(_profile_pictureDropdown).click();
	}
	public void clickOnLogoutOption() {
		waitForElementToBeClickable(_logoutOption).click();
	}
	public void homePageValidation() {
		waitForElementToBeVisible(_txt_h5LoginTitle);
		Assert.assertEquals("Login", _txt_h5LoginTitle.getText());
	}
	public void clickOnAboutOption() {
		waitForElementToBeClickable(_aboutOption).click();
	}
	public void clickOnSupportOption() {
		waitForElementToBeClickable(_supportOption).click();
	}
	public void aboutPopupWindowValidation() {
		waitForElementToBeVisible(_about_popOutWindow_title);
		Assert.assertEquals("About", _about_popOutWindow_title.getText());
	}
	public void userIsOnSupportPageValidation() {
		waitForElementToBeVisible(_img_customerSupport);
	}
	public void clicksOnChangePasswordOption() {
		waitForElementToBeClickable(_input_changePassword).click();
	}
	public void entersThePasswords(String currentPass, String newPass) throws InterruptedException{
		waitForElementToBeVisible(_input_currentPassword).sendKeys(currentPass);
		waitForElementToBeVisible(_input_newPassword).sendKeys(newPass);
		waitForElementToBeVisible(_input_confirmNewPassword).sendKeys(newPass);
		Thread.sleep(1000); //sleep just to confirm pass change
		waitForElementToBeClickable(_btn_save).click();
	}
	public void changePasswordSuccessMsgValidation() {
		waitForElementToBeVisible(_msg_success);
	}
	public void clickCancelBtn() {
		waitForElementToBeVisible(_btn_cancel).click();
	}
	public void invalidCredentialsValidation() {
		waitForElementToBeVisible(_icon_invalidCredentials);
	}
	
}




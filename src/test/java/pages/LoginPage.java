package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;



public class LoginPage extends BasePage {
	
	@FindBy(name="username")
	WebElement _txt_username;	
	@FindBy(name="password")
	WebElement _txt_password;	
	@FindBy(xpath="//button[@type='submit']")
	WebElement _btn_login;
	@FindBy(css="span[class*='oxd-userdropdown-tab']")
	WebElement _profile_picture_dropdown;
	@FindBy(linkText="Logout")
	WebElement _logout_option;
	@FindBy(xpath="//h5[contains(.,'Login')]")
	WebElement _txt_h5_login_title;
	@FindBy(linkText="Support")
	WebElement _support_option;
	@FindBy(linkText="About")
	WebElement _about_option;
	@FindBy(linkText="Change Password")
	WebElement _input_change_password;
	@FindBy(xpath="//h6[normalize-space()='About']")
	WebElement _about_popout_window_title;
	@FindBy(css="img[alt='help image']")
	WebElement _img_customer_support;
	@FindBy(xpath="(//*[contains(@type, 'password')])[1]")
	WebElement _input_current_password;
	@FindBy(xpath="(//*[contains(@type, 'password')])[2]")
	WebElement _input_new_password;
	@FindBy(xpath="(//*[contains(@type, 'password')])[3]")
	WebElement _input_confirm_new_password;
	@FindBy(css=".oxd-text.oxd-text--p.oxd-text--toast-title.oxd-toast-content-text")
	WebElement _msg_success;
	@FindBy(css="button[type='submit']")
	WebElement _btn_save;
	@FindBy(xpath="//button[normalize-space()='Cancel']")
	WebElement _btn_cancel; 
	@FindBy(css="i[class*='bi-exclamation-circle']")
	WebElement _icon_invalid_credentials;

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
	public void goTo(String url) {
		this.driver.get(url);
	}
	public void clickProfilePic() {
		waitForElementToBeClickable(_profile_picture_dropdown).click();
	}
	public void clickOnLogoutOption() {
		waitForElementToBeClickable(_logout_option).click();
	}
	public void homePageValidation() {
		waitForElementToBeVisible(_txt_h5_login_title);
		Assert.assertEquals("Login", _txt_h5_login_title.getText());
	}
	public void clickOnAboutOption() {
		waitForElementToBeClickable(_about_option).click();
	}
	public void clickOnSupportOption() {
		waitForElementToBeClickable(_support_option).click();
	}
	public void aboutPopupWindowValidation() {
		waitForElementToBeVisible(_about_popout_window_title);
		Assert.assertEquals("About", _about_popout_window_title.getText());
	}
	public void userIsOnSupportPageValidation() {
		waitForElementToBeVisible(_img_customer_support);
	}
	public void clicksOnChangePasswordOption() {
		waitForElementToBeClickable(_input_change_password).click();
	}
	public void entersThePasswords(String currentPass, String newPass) {
		waitForElementToBeVisible(_input_current_password).sendKeys(currentPass);
		waitForElementToBeVisible(_input_new_password).sendKeys(newPass);
		waitForElementToBeVisible(_input_confirm_new_password).sendKeys(newPass);
		waitForElementToBeClickable(_btn_save).click();
	}
	public void changePasswordSuccessMsgValidation() {
		waitForElementToBeVisible(_msg_success);
	}
	public void clickCancelBtn() {
		waitForElementToBeVisible(_btn_cancel).click();
	}
	public void invalidCredentialsValidation() {
		waitForElementToBeVisible(_icon_invalid_credentials);
	}
	
}




package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends BasePage {
	
	
	@FindBy(name="username")
	WebElement _txt_username;	
	@FindBy(name="password")
	WebElement _txt_password;	
	@FindBy(xpath="//button[@type='submit']")
	WebElement _btn_login;
	
	public LoginPage(WebDriver driver) {		
		super(driver);
	}
	
	public void attemptToLogin(String username, String password) {
		enterUsername(username);
		enterPassword(password);
		clickLogin();
	}
	
	private void enterUsername(String username) {		
		_txt_username.sendKeys(username);
	}
	
	private void enterPassword(String password) {		
		_txt_password.sendKeys(password);
	}
	
	private void clickLogin() {
		_btn_login.click();
	}
	
}




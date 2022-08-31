package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;

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
		this.wait.until(ExpectedConditions.visibilityOf(_txt_username)).sendKeys(username);
	}
	
	private void enterPassword(String password) {		
		this.wait.until(ExpectedConditions.visibilityOf(_txt_password)).sendKeys(password);
	}
	
	private void clickLogin() {
		this.wait.until(ExpectedConditions.visibilityOf(_btn_login)).click();
	}

	
}




package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {
	
	WebDriver driver;
	
	public static final By _txt_username = By.name("username");
	public static final By _txt_password = By.name("password");
	public static final By _btn_login = By.xpath("//button[@type='submit']");
	
	public LoginPage(WebDriver driver) {
		this.driver = driver;
	}
	
	public void attemptToLogin(String username, String password) {
		enterUsername(username);
		enterPassword(password);
		clickLogin();
	}
	
	private void enterUsername(String username) {		
		driver.findElement(_txt_username).sendKeys(username);
	}
	
	private void enterPassword(String password) {		
		driver.findElement(_txt_password).sendKeys(password);
	}
	
	private void clickLogin() {
		driver.findElement(_btn_login).click();
	}
	
}




package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class LoginPage extends BasePage {
	
	WebDriver driver;
	
	@FindBy(name="username")
	WebElement _txt_username;	
	@FindBy(name="password")
	WebElement _txt_password;	
	@FindBy(xpath="//button[@type='submit']")
	WebElement _btn_login;
	
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
	

	
}




package StepDefinitions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import pages.LoginPage;
import pages.PimPage;

import java.time.Duration;

public class LoginStepDefs {
	
	public final String URL_LOGIN= "https://opensource-demo.orangehrmlive.com/web/index.php/auth/login";
	WebDriver driver = null;
	
	@Given("john is on the OrangeHRM login page")
	public void john_is_on_the_OrangeHRM_login_page() {
		
	    System.setProperty("webdriver.gecko.driver", "C:\\Users\\julia\\eclipse-workspace\\SeleniumCuc\\src\\test\\resources\\Webdriver\\geckodriver.exe");
		driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get(URL_LOGIN);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(4));    
	}

	@When("^attempts to Login with valid (.*) and (.*)$")
	public void attempts_to_login_with_valid_username_and_password(String username, String password) {
		
		LoginPage login = new LoginPage(driver);
		login.attemptToLogin(username, password);	
		
		PimPage pimPage = new PimPage(driver);
		
		String expectedTitle = "PIM";
		pimPage.validateTitle(expectedTitle);
		
			
	}	

	@Then("will see the PIM page")
	public void will_see_the_pim_page() {
	   
	    
	}

}

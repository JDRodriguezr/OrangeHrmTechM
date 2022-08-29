package StepDefinitions;

import org.openqa.selenium.WebDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import pages.BasePage;
import pages.LoginPage;
import pages.PimPage;


public class LoginStepDefs  {
	WebDriver driver;
	BasePage basePage = new BasePage(driver);//shit
	
	
	@Given("john is on the OrangeHRM login page")
	public void john_is_on_the_OrangeHRM_login_page() {		
		basePage.navigateToOrangeLoginPage();	
		driver = basePage.getWebDriver();
	}

	@When("^attempts to Login with valid (.*) and (.*)$")
	public void attempts_to_login_with_valid_username_and_password(String username, String password) {
		LoginPage login = new LoginPage(driver);
		login.attemptToLogin(username, password);						
	}	

	@Then("will see the PIM page")
	public void will_see_the_pim_page() {
		PimPage pimPage = new PimPage(basePage.getWebDriver());
		String expectedTitle = "PIM"; //This could be calling a constant in the basePage class, validations aswell
		pimPage.userIsOnPimPageValidation(expectedTitle); //Might be a better way to do this
		//driver.quit();
					//Toca poner un tag de after test que cierre el navegador driver.close()    
	}

}

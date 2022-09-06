package StepDefinitions;

import java.io.IOException;

import org.openqa.selenium.WebDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import pages.LoginPage;
import pages.PimPage;


public class LoginStepDefs extends BaseTest {
	
	
	@Given("john is on the OrangeHRM login page")
	public void john_is_on_the_OrangeHRM_login_page() {	
		//public void launchApplication() this opens the driver and navigates to login page
		try {
			launchApplication();			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@When("^attempts to Login with valid (.*) and (.*)$")
	public void attempts_to_login_with_valid_username_and_password(String username, String password) {
		login = new LoginPage(driver);
		login.attemptToLogin(username, password);						
	}	

	@Then("will see the PIM page")
	public void will_see_the_pim_page() {
		pimPage= new PimPage(driver);
		String expectedTitle = "PIM"; //This could be calling a constant in the basePage class, validations aswell.
		pimPage.userIsOnPimPageValidation(expectedTitle);//Might be a better way to do this			
		//pimPage.goToAddEmployeePage();
		//pimPage.addBasicEmployee();
	}
	

}

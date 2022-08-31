package StepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import pages.LoginPage;
import pages.PimPage;


public class LoginStepDefs extends BaseTest {
	
	LoginPage login = new LoginPage(this.driver);
	
	
	
	@Given("john is on the OrangeHRM login page")
	public void john_is_on_the_OrangeHRM_login_page() {	
		
	}

	@When("^attempts to Login with valid (.*) and (.*)$")
	public void attempts_to_login_with_valid_username_and_password(String username, String password) {
		
		login.attemptToLogin(username, password);						
	}	

	@Then("will see the PIM page")
	public void will_see_the_pim_page() {
		PimPage pimPage = new PimPage(this.driver);
		String expectedTitle = "PIM"; //This could be calling a constant in the basePage class, validations aswell. Not sure which is the best way to do
		pimPage.userIsOnPimPageValidation(expectedTitle); //Might be a better way to do this
		//END everything below here should be deleted later
		pimPage.goToEmployeePage();
		pimPage.addBasicEmployee();
					
	}
	

}

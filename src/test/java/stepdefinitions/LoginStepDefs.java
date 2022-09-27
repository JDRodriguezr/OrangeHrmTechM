package stepdefinitions;

import java.io.IOException;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import pages.LoginPage;
import pages.PimPage;
import pages.SidebarPage;


public class LoginStepDefs extends BaseTest {
	
	
	@Given("john is on the OrangeHRM login page")
	public void john_is_on_the_OrangeHRM_login_page() {
		try {
			launchApplication();			
		} catch (IOException e) {
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
		String expectedTitle = "PIM";
		pimPage.userIsOnPimPageValidation(expectedTitle);		
	}
	
	@And("clicks on the profile picture")
	public void clicks_on_the_profile_picture() {
		login.clickProfilePic();
	}

	@And("clicks on the logout option")
	public void clicks_on_the_logout_option() {
	    login.clickOnLogoutOption();
	}
	
	@And("clicks on the support option")
	public void clicks_on_the_support_option() {
	    login.clickOnSupportOption();
	}

	@Then("will see the home page")
	public void will_see_the_home_page() {
	    login.homePageValidation();
	}	
	
	@When("clicks on the about option")
	public void clicks_on_the_about_option() {
	    login.clickOnAboutOption();
	}
	@Then("will see the about popup window")
	public void will_see_the_about_popup_window() {
	    login.aboutPopupWindowValidation();
	}
	@Then("will see the support page from the profile dropdown")
	public void will_see_the_support_page_from_the_profile_dropdown() {
	    login.userIsOnSupportPageValidation();
	}
	@And("clicks on the change password option")
	public void clicks_on_the_change_password_option() {
	    login.clicksOnChangePasswordOption();
	}

	@And("^enters (.*), (.*)$")
	public void enters_admin123_admin1234_admin1234(String currentPass, String newPass) {
	    login.entersThePasswords(currentPass, newPass);
	}
	@Then("will see the success message")
	public void will_see_the_success_message() {
	    login.changePasswordSuccessMsgValidation();
	}
	@And("clicks the cancel button")
	public void clicks_the_cancel_button() {
	    login.clickCancelBtn();
	}

	@Then("will be redirected to the previous page")
	public void will_be_redirected_to_the_previous_page() {
		pimPage= new PimPage(driver);
		String expectedTitle = "PIM";
		pimPage.userIsOnPimPageValidation(expectedTitle);	
	}
	@When("^attempts to Login with invalid (.*) and (.*)$")
	public void attempts_to_login_with_invalid_credentials(String username, String password) {
		login.attemptToLogin(username, password);
	}

	@Then("will visualize the invalid credentials error message")
	public void will_visualize_the_invalid_credentials_error_message() {
	    login.invalidCredentialsValidation();
	}
	@When("clicks the OrangeHRM logo on the sidebar")
	public void clicks_the_orange_hrm_logo_on_the_sidebar() {
	    sidebPage = new SidebarPage(driver);
	    sidebPage.goToOrangeHomePage();
	}

	@Then("will be redirected to the OrangeHRM home page")
	public void will_be_redirected_to_the_orange_hrm_home_page() {
		sidebPage.orangeHomePageValidation();
	}

}

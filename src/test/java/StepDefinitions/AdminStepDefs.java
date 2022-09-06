package StepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.AdminPage;




public class AdminStepDefs extends BaseTest {
	
	AdminPage admin = new AdminPage(driver);
	
	@When("clicks on the Admin option in the sidebar")
	public void clicks_on_the_admin_option_in_the_sidebar() {
		admin.goToAdminPage();
		admin.adminTitleValidation("Admin");
	}

	@And("clicks on the nationality option")
	public void clicks_on_the_nationality_option() {
	    admin.clickNationalitiesTopBarBtn();
	}

	@And("clicks on the Add button in the nationality page")
	public void clicks_on_the_add_button_in_the_nationality_page() throws InterruptedException {
		admin.clickNationalitiesAddBtn();
	}

	@And("^types in the (.*) in the textbox$")
	public void types_in_the_colombbian_in_the_textbox(String nationality) {
	    admin.inputNewNationality(nationality);
	}

	@And("clicks in the save button")
	public void clicks_in_the_save_button() {
	    admin.clickNationalitiesSaveBtn();
	}

	@Then("visualizes the succesful message")
	public void visualizes_the_succesful_message() {
	    admin.addNewNationalityValidation();
	}

}

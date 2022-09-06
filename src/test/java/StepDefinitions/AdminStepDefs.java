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
	@And("clicks on the corporate branding option")
	public void clicks_on_the_corporate_branding_option() {
	    admin.clickOnCorporateBranding();
	}

	@And("changes the primary color to the desired color")
	public void changes_the_primary_color_to_the_color() {
	    admin.selectNewColor();
	}

	@And("clicks on the search publish button")
	public void clicks_on_the_search_publish_button() {
	    admin.clickPublishButton();
	}

	@Then("will see that the page will update and the primary color will be the selected one")
	public void will_see_that_the_page_will_update_and_the_primary_color_will_be_the_selected_one() {
	    admin.primaryColorChangeValidation();
	}
	
	@And("clicks on the Job dropdown")
	public void clicks_on_the_job_option() {
	    admin.clickJobTopBarBtn();
	}
	@And("clicks on Job Titles")
	public void clicks_on_job_titles() {
	    admin.clickJobTitleOption();;
	}

	@And("clicks on the add button in the job title page")
	public void clicks_on_the_add_button_in_the_job_title_page() throws InterruptedException{
	    admin.clickBtnAddJobTitle();
	}

	@And("^enters a (.*)$")
	public void enters_a_abstract_job(String jobTitle) {
	    admin.entersNewJobTitle(jobTitle);
	}

	@Then("will see the created job on the list")
	public void will_see_the_created_job_on_the_list() {
	    admin.createdJobValidation();
	}
	@And("clicks in the job title save button")
	public void clicks_in_the_job_title_save_button() {
	    admin.clickSaveBtn();
	}

}

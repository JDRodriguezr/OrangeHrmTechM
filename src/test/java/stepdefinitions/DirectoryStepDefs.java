package stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.DirectoryPage;




public class DirectoryStepDefs extends BaseTest {
	
	DirectoryPage directory = new DirectoryPage(driver);
	
	@When("clicks on the directory option in the sidebar")
	public void clicks_on_the_directory_option_in_the_sidebar() {
		directory.goTo();
		directory.directoryTitleValidation("Directory");
		
	}

	@And("^searches for a specific (.*)$")
	public void searches_for_a_specific_account_assistant(String jobTitle) {
	    directory.selectDesiredJobTitle(jobTitle);
	}

	@And("clicks in the search button")
	public void clicks_in_the_search_button() {
	    directory.clickTheSearchEmployeeButn();
	}

	@Then("a list of employees with the specified job title should be displayed")
	public void a_list_of_employees_with_the_specified_job_title_should_be_displayed(String jobTitle) {
	    directory.searchJobTitleResultValidation(jobTitle);
	}
	@When("^search for a specific (.*)$")
	public void search_for_a_specific_canadian_regional_hq(String location) {
	    directory.selectDesiredLocation(location);
	}

	@Then("^a list of employees with the specified (.*) should be displayed$")
	public void a_list_of_employees_with_the_specified_canadian_regional_hq_should_be_displayed(String location) {
		directory.searchLocationResultValidation(location);
	}
}

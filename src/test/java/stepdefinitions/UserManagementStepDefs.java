package stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import pages.SidebarPage;


public class UserManagementStepDefs extends BaseTest {
	
	//SidebarPage sidebarPage = new SidebarPage(this.driver);
	String expectedTitle = "Personal Details";
	SidebarPage sidebPage = new SidebarPage(driver);

	@When("the user clicks on the Add Employee option")
	public void the_user_clicks_on_the_Add_Employee_option() {		
		pimPage.goToAddEmployeePage();
	}	
	@And("^fills the (.*), (.*) and (.*) spaces$")
	public void fills_the_add_employee_form(String name, String middleName, String lastName) {
		pimPage.fillsTheForm(name, middleName, lastName);					
	}		
	@And("clicks on Save")
	public void clicks_on_save() {
		pimPage.clicksSaveBtn();
	}
	@Then("is navigated to the personal details page")
	public void is_navigated_to_the_personal_details_page() {
		pimPage.userIsOnPersonalDetailsValidation(expectedTitle);	
	}
	@Then("will visualize the report information page")
	public void will_visualize_the_report_information_page() {
		String expectedReportInfoPage = "All Employee Sub Unit Hierarchy Report";
		pimPage.userIsOnReportInformationPage(expectedReportInfoPage);
	}	
	@When("the user clicks on the Report option")
	public void the_user_clicks_on_the_report_option() {
		 pimPage.goToReports();
	}
	@When("^Searches for a (.*)$")
	public void searches_for_a_report(String reportName) {
		 pimPage.searchForReport(reportName);
	}
	@When("clicks on the report search button")
	public void clicks_on_the_search_button() {
	    pimPage.clickSearchBtn();
	}
	@Then("will be redirected to the Personal Details page")
	public void will_be_redirected_to_the_personal_details_page() {		
	    pimPage.userIsOnPersonalDetailsValidation(expectedTitle);
	}
	@When("the user clicks on the first employee Record")
	public void the_user_clicks_on_the_first_employee_record() {
	    pimPage.clicksOnTheFirstEmployee();
	}	
	@When("clicks on the third icon in the found record")
	public void clicks_on_the_third_icon_in_the_found_record() {
	   pimPage.clicksReportThirdOption();
	}
	@When("selects the Optional Fields option under the configuration dropdown")
	public void selects_the_optional_fields_option_under_the_configuration_dropdown() {
	    pimPage.selectsOptionalFields();
	}
	@When("changes any of the sliders and clicks save")
	public void changes_any_of_the_sliders_and_clicks_save() {
		pimPage.clickOnSlider();
		pimPage.clickOnSavePimConfig();
	}
	@Then("the success message should appear for a few seconds")
	public void the_success_message_should_appear_for_a_few_seconds() {
		pimPage.successMsgValidation();		
	}
	@And("clicks on the delete button of any Employee")
	public void clicks_on_the_delete_button_of_any_employee() {
	    pimPage.deleteJobTitle();
	}
	
}
package stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.DashboardPage;



public class DashboardStepDefs extends BaseTest {
	
	DashboardPage dashboard = new DashboardPage(driver);
	
	@When("clicks on the dashboard")
	public void clicks_on_the_dashboard() {
		dashboard.clickTheDashboardOption();
	}
	@And("is redirected to the dashboard page")
	public void is_redirected_to_the_dashboard_page() {
		String expectedTitle="Dashboard";
		dashboard.dashboardTitleValidation(expectedTitle);
	}
	@Then("^will validate the (.*)$")
	public void will_validate_that_the_page_is_under_development(String expectedTitle) {
	    dashboard.launchSoonTitleValidation(expectedTitle);
	}	

}

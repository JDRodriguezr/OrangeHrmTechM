package StepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import pages.PimPage;
import pages.SidebarPage;


public class UserManagementStepDefs extends BaseTest {
	
	PimPage pimPage = new PimPage(this.driver);
	SidebarPage sidebarPage = new SidebarPage(this.driver);

	@When("the user clicks on the Add Employee option")
	public void the_user_clicks_on_the_Add_Employee_option() {		
		
		pimPage.goToEmployeePage();
	}

	@And("^fills the (.*), (.*) and (.*) spaces$")
	public void fills_the_add_employee_form(String name, String middleName, String lastName) {
		System.out.println("PASAMOS POR EL PASO DE LLENAR EL FOORM");						
	}	
	
	@And("clicks on Save")
	public void clicks_on_save() {
		System.out.println("CLICK EN SAVE");	
	}

	@Then("is navigated to the personal details page")
	public void is_navigated_to_the_personal_details_page() {
		System.out.println("PASAMOS POR EL PASO DE CONFIRMAR QUE ESTE EN LA PAGINA DE TERMINAR DE LLENAR EL DETALLE DEL EMPLEADO");	
		System.out.println("FIN"); 
	}

}
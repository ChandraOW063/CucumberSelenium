package StepDefinitions;

import java.io.IOException;
import java.util.List;
import java.util.Map;

import org.openqa.selenium.WebDriver;


import Pages.Addemployee;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import utilites.Seleniumhelpers;

public class addEmpDataTable {

	WebDriver driver = TestBase.getDriver();  
	Seleniumhelpers webDriverUtils = new Seleniumhelpers(driver);  
	Addemployee add;  


	@Given("user logs in with username {string} and password {string}")
	public void login(String username, String password) throws IOException {



		add = new Addemployee(driver);  
		add.enterUserName(username);  
		add.enterUserPassword(password);
		add.clickLogin();  
	}


	@Then("verify that the application navigates to the dashboard")
	public void verify_that_the_application_navigates_to_the_dashboard() {
		add.PageVerification("urBuddi");

	}


	@When("user click to add the employee details with the following data:")
	public void user_click_to_add_the_employee_details_with_the_following_data(DataTable dataTable) throws InterruptedException {
		add.clickemployee();  
		add.clickAddemployee();

		List<Map<String, String>> rows = dataTable.asMaps(String.class, String.class);
		for (Map<String, String> columns : rows) {
			String key = columns.get("key");
			String value = columns.get("value");
			add.addEmpUsingSwitch(key, value); 
		}	


	}


	@And("user click on submit details")
	public void user_click_on_submit_details() throws InterruptedException {
		add.SubmitNewEmpDetails();
		Thread.sleep(2000);

	}

	@Then("verify the user can search the added employee with the employeeid {string}")
	public void verify_the_user_can_search_the_added_employee_with_the_employeeid(String employeeid) throws InterruptedException {
		
		add.searchEmp(employeeid);
		Thread.sleep(2000);
		add.searchEmpcheckBox();
		Thread.sleep(2000);
		add.searchEmpDelete();


	}
}

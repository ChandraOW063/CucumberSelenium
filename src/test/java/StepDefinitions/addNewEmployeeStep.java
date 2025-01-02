package StepDefinitions;

import java.io.IOException;

import org.openqa.selenium.WebDriver;

import Locators.addingEmployee_Locaters;
import Pages.Addemployee;
import Pages.Loginpage;
import Pages.TestBase;
import io.cucumber.java.Before;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.qameta.allure.Step;
import utilites.Utilities;

public class addNewEmployeeStep {
	
	WebDriver driver;
	TestBase base = new TestBase();
	Loginpage loginpage;
	Utilities utils;
	addingEmployee_Locaters emplocator;
	Addemployee employee;
	
	@Step("Test Started")
	@Before
	public void setUp() throws IOException {
		   if (driver == null) {
	            driver = base.launchBrowser();
	        }
	        loginpage = new Loginpage(driver);
	        utils = new Utilities(driver);
	        employee = new Addemployee(driver);
	    }
	
	@Given("user is on login page")
	public void user_is_on_login_page() {
		
		utils.assertPageTitle("urBuddi");
		
	    
	}

	@Then("user login in with username {string} and password {string}")
	public void user_enters_a_invalid_username_and_password(String username, String password) {
		// Enter invalid username and password on the login form
		loginpage.enterEmail(username);
		loginpage.enterPassword(password);
		loginpage.clickLogin();
	}

	@And("verify user is landed on to the urBuddi dashboard")
	public void verify_user_is_landed_on_to_the_ur_buddi_dashboard() {
		utils.assertPageTitle("urBuddi");
	}

	@And("user click on employee and Add new employee details")
	public void user_click_on_employee_and_add_new_employee_details() {
	    employee.clickEmployee();
	    employee.clickAddEmp();
	    employee.enterFirstname("New");
	    employee.enterLastname("Testuser");
	    employee.enterEmpID("OW0007");
	    employee.enterEmpEmail("Demomail@gmail.com");
	    employee.selectDropdownOptionForEmployeeRole(1);
	    employee.enterEmpPassword("Demo@123");
	    
	    
	    
	}

	@Then("user log out and redirected back to Login page.")
	public void user_log_out_and_redirected_back_to_login_page() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	

}

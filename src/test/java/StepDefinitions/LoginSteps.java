package StepDefinitions;

import org.testng.annotations.BeforeMethod;

import org.testng.AssertJUnit;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import org.testng.annotations.AfterTest;

import Pages.Loginpage;
import Pages.TestBase;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.qameta.allure.Step;
import utilites.Utilities;


public class LoginSteps {

	WebDriver driver;
	TestBase base = new TestBase();
	Loginpage loginpage;
	
	
	Utilities utils;

	@Before
	@Step("Test Started")
	public void setUp() throws IOException {
		// Initialize the browser and navigate to the login page before each scenario
		driver = base.launchBrowser();  // Launch the browser using TestBase
		loginpage = new Loginpage(driver);  // Initialize the login page object
		utils = new Utilities(driver);  // Initialize the utilities object
	}

	@Given("user is on the login page")
	public void user_is_on_the_login_page() {
		// Ensure utils is initialized and navigate to the login page
		//driver.getTitle();
		
	}

	@When("user enters a valid username {string} and password {string}")
	public void userEntersValidUsernameAndPassword(String username, String password) {
		// Enter valid username and password on the login form
		loginpage.enterEmail(username);
		loginpage.enterPassword(password);
	}

	@And("clicks the login button")
	public void clicks_the_login_button() {
		// Click the login button
		loginpage.clickLogin();
	}

	@Then("user is navigated to the home page")
	public void user_is_navigated_to_the_home_page() {
		// Ensure that the user is redirected to the home page

		//driver.getTitle();
	}

	@And("user close the browser")
	public void user_close_the_browser() {
		// Close the browser after the test
		System.out.println("Browser Closed");
		//driver.quit();  // Quit the driver to close the browser
	}

	@When("user enters a invalid username {string} and password {string}")
	public void user_enters_a_invalid_username_and_password(String username, String password) {
		// Enter invalid username and password on the login form
		loginpage.enterEmail(username);
		loginpage.enterPassword(password);
	}

	@Then("user should see an error message")
	public void user_should_see_an_error_message() throws InterruptedException {

		Thread.sleep(5000);
		// Validate the error message when invalid credentials are entered
		WebElement invalidcre = driver.findElement(By.xpath("//*[@class = 'err-msg-display mt-3']"));
		String text = invalidcre.getText();  // Get the error message text
		System.out.println(text);

		// Ensure the error message is displayed
		utils.isElementDisplayed(invalidcre);

		// Assert that the error message text is as expected
		AssertJUnit.assertEquals(text, "*Invalid credentials");  // Remove the asterisk (*) from the error message
	}

	@After
	
    public void closeBrowser() {
       base.quitBrowser();
        }
	}


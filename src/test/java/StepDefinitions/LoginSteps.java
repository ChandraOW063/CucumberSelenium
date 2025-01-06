//package StepDefinitions;
//
//
//import org.testng.AssertJUnit;
//
//
//import java.io.IOException;
//
//import org.openqa.selenium.By;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
//import Pages.Loginpage;
//import Pages.TestBase;
//import io.cucumber.java.en.And;
//import io.cucumber.java.en.Given;
//import io.cucumber.java.en.Then;
//import io.cucumber.java.en.When;
//import utilites.Seleniumhelpers;
//
//
//
//public class LoginSteps {
//
//	WebDriver driver = TestBase.driver;
//	TestBase base = new TestBase();
//	Loginpage loginpage;
//	Seleniumhelpers utils;
//	
//	
//	   
//    public void LoginSteps() {
//    	
//        this.base = new TestBase();
//        this.loginpage = new Loginpage(driver); 
//        this.utils = new Seleniumhelpers(driver);
//    }
//     
//
//
//	@Given("user is on the login page")
//	public void user_is_on_the_login_page() throws IOException {
//		driver = base.launchBrowser();
//
//	}
//
//	@When("user enters a valid username {string} and password {string}")
//	public void userEntersValidUsernameAndPassword(String username, String password) {
//		loginpage  = new Loginpage(driver);
//		loginpage.enterEmail(username);
//		loginpage.enterPassword(password);
//	}
//
//	@And("clicks the login button")
//	public void clicks_the_login_button() {
//		// Click the login button
//		loginpage.clickLogin();
//	}
//
//	@Then("user is navigated to the home page")
//	public void user_is_navigated_to_the_home_page() {
//		// Ensure that the user is redirected to the home page
//
//		//driver.getTitle();
//	}
//
//	@And("user close the browser")
//	public void user_close_the_browser() {
//
//		System.out.println("Browser Closed");
//
//	}
//
//	@When("user enters a invalid username {string} and password {string}")
//	public void user_enters_a_invalid_username_and_password(String username, String password) {
//
//		loginpage.enterEmail(username);
//		loginpage.enterPassword(password);
//	}
//
//	@Then("user should see an error message")
//	public void user_should_see_an_error_message() throws InterruptedException {
//
//		Thread.sleep(5000);
//
//		WebElement invalidcre = driver.findElement(By.xpath("//*[@class = 'err-msg-display mt-3']"));
//		String text = invalidcre.getText(); 
//		System.out.println(text);
//
//
//		//utils.isElementDisplayed(invalidcre);
//		AssertJUnit.assertEquals(text, "*Invalid credentials");  
//		base.quitBrowser();
//	}
//
//}

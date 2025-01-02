package Pages;


import Locators.Loginpage_locaters;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;




public class Loginpage {

	WebDriver driver;

	
	
	public Loginpage(WebDriver driver) {
		this.driver = driver;
	}
	

	public void enterEmail(String email) {

		WebElement Email = driver.findElement(Loginpage_locaters.Email);
		Email.clear();
		Email.sendKeys(email);

	}
	public void enterPassword(String password) {

		WebElement Password = driver.findElement(Loginpage_locaters.Password);
		Password.clear();
		Password.sendKeys(password);
	}

	public void clickLogin() {
		WebElement Login = driver.findElement(Loginpage_locaters.LoginSubmit);
		Login.click();

	}
	


}
package Pages;


import Locators.Loginpage_locaters;
import utilites.Seleniumhelpers;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;




public class Loginpage {

	WebDriver driver;
	Seleniumhelpers helper; ;

	
	
	public Loginpage(WebDriver driver) {
		this.driver = driver;
		helper = new Seleniumhelpers(driver);
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
		helper.clickElement(By.xpath("//button[text()='Login']"));

	}
	


}
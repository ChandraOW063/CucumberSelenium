package Locators;

import org.openqa.selenium.By;


import org.openqa.selenium.WebDriver;


public class Loginpage_locaters {

	WebDriver driver;
	public void LoginPage(WebDriver driver) {
		this.driver = driver;
	}

	public static By urBuddiLogo = By.xpath("//img[contains(@class, 'company-logo')]\\");
	public static By Email = By.xpath("//input[contains(@type, 'email') and contains(@id, 'userEmail')]");
	public static By Password = By.xpath("//input[@type = 'password' and @Id ='userPassword']");
	public static By LoginSubmit = By.xpath("//button[text()='Login']");
	public static By InvalidCred = By.xpath("//*[@class = 'err-msg-display mt-3']");
	
	
}


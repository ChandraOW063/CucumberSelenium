package Pages;

import java.time.Duration;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import Locators.Loginpage_locaters;
import Locators.addingEmployee_Locaters;

public class Addemployee {

	WebDriver driver;
	addingEmployee_Locaters emplocator;


	public Addemployee(WebDriver driver) {
		this.driver = driver;
		emplocator = new addingEmployee_Locaters();
	}

	public void clickEmployee() {
		WebElement clickbutton = driver.findElement(emplocator.Employee);
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		wait.until(ExpectedConditions.visibilityOf(clickbutton));  // Ensure visibility
	    wait.until(ExpectedConditions.elementToBeClickable(clickbutton)); // Ensure it's clickable
		clickbutton.click();
	}
	
	public void clickAddEmp() {
		WebElement clickbutton = driver.findElement(addingEmployee_Locaters.AddEmployee);
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		wait.until(ExpectedConditions.visibilityOf(clickbutton));  // Ensure visibility
	    wait.until(ExpectedConditions.elementToBeClickable(clickbutton)); // Ensure it's clickable
		clickbutton.click();
	}
	
	
	public void enterFirstname(String Firstname) {

		WebElement FirstName = driver.findElement(addingEmployee_Locaters.Firstname);
		FirstName.clear();
		FirstName.sendKeys(Firstname);
		

	}
	
	public void enterLastname(String Lastname) {

		WebElement LastName = driver.findElement(addingEmployee_Locaters.Lastname);
		LastName.clear();
		LastName.sendKeys(Lastname);
		

	}
	
	public void enterEmpID(String EmpID) {

		WebElement EmpId = driver.findElement(addingEmployee_Locaters.EmployeeID);
		EmpId.clear();
		EmpId.sendKeys(EmpID);
		

	}
	
	public void enterEmpEmail(String EmpEmail) {

		WebElement EmpMail = driver.findElement(addingEmployee_Locaters.EmployeeID);
		EmpMail.clear();
		EmpMail.sendKeys(EmpEmail);
		

	}
	public void enterEmpPassword(String EmPassword) {

		WebElement EmpPassword = driver.findElement(addingEmployee_Locaters.EmployeeID);
		EmpPassword.clear();
		EmpPassword.sendKeys(EmPassword);
		

	}
	
	
	 public void selectDropdownOptionForEmployeeRole(int index) {
	        WebElement dropdown = driver.findElement(addingEmployee_Locaters.EmployeeRoleDropDown);
	        Select select = new Select(dropdown);
	        select.selectByIndex(index);
	    }
	 
	 
	 
	 
}

package Locators;

import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;

public class addingEmployee_Locaters {

	WebDriver driver;
	public void LoginPage(WebDriver driver) {
		this.driver = driver;
	}


	public static By Employee = By.xpath("//*[text()='Employees']/ancestor::a");
	public static By AddEmployee = By.xpath("//button[contains(text(), 'Add Employee') and contains(@type, 'button')]");
	public static By Firstname = By.xpath("//input[@type = 'text' and @name = 'firstName']");
	public static By Lastname = By.xpath("//input[@type = 'text' and @name = 'lastName']");
	public static By EmployeeID = By.xpath("//input[@type = 'text' and @id = 'employeeID']");
	public static By EmployeeEmail = By.xpath("//input[contains(@type, 'text') and contains(@name, 'email')]");
	public static By EmployeeRoleDropDown = By.xpath("//select[contains(@id, 'role') and contains(@name, 'role')]");
	public static By RoledropdownEmpOption = By.xpath("//option[text()='Employee']");
	public static By EmployeePassword = By.xpath("//input[@type ='password' and @name = 'password']");
	public static By EmpDOB = By.xpath("//input[@type ='date' and @name = 'dob']");
	public static By EmpJoiningDate = By.xpath("//input[@type ='date' and @name = 'joiningDate']");
	public static By EmpQualificationDropDown = By.xpath("//select[@id='qualifications' and @name = 'qualifications']");
	public static By QualificationDropDownOption = By.xpath("//option[text()='B.Tech']");
	public static By EmpDepartment = By.xpath("//input[@type = 'text' and @name = 'department']");
	public static By GenderDropdown = By.xpath("//select[@id= 'gender' and @name = 'gender']");
	public static By GenderDropdownOption = By.xpath("//option[text() = 'Male']");
	public static By EmpMobileNumber = By.xpath("//input[@type = 'tel' and @name= 'mobileNumber']");
	public static By EmpLocation = By.xpath("//*[@class='add-employee-form']/..//*[@name='location']");
	public static By EmpSalary = By.xpath("//input[@id='salary']");
	public static By EmpBloodGrpDropdw = By.xpath("//select[@id= 'bloodGroup' and @name= 'bloodGroup']");
	public static By EmpBloodgrpOptin = By.xpath("//option[text()='B+']");
	public static By Reportingto = By.xpath("//select[@name='reportingTo' and @id= 'reportingTo']");
	public static By Certificates = By.xpath("//button[@class='dropdown-btn' and @type = 'button']");
	public static By CertificatesOptions = By.xpath("//input[@name='original Degree' and @type = 'checkbox']");
}

package Locators;

import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;

public class addingEmployee_Locaters {

	WebDriver driver;
	public void LoginPage(WebDriver driver) {
		this.driver = driver;
	}

	public static By urBuddiLogo = By.xpath("//img[contains(@class, 'company-logo')]\\");
	public static By Email = By.xpath("//input[contains(@type, 'email') and contains(@id, 'userEmail')]");
	public static By Password = By.xpath("//input[@type = 'password' and @Id ='userPassword']");
	public static By LoginSubmit = By.xpath("//button[text()='Login']");
	public static By InvalidCred = By.xpath("//*[@class = 'err-msg-display mt-3']");
	public static By Employee = By.xpath("//p[normalize-space()='Employees']");
	public static By AddEmployee = By.xpath("//button[contains(text(), 'Add Employee') and contains(@type, 'button')]");
	public static By Firstname = By.xpath("//input[@type = 'text' and @name = 'firstName']");
	public static By Lastname = By.xpath("//input[@type = 'text' and @name = 'lastName']");
	public static By EmployeeID = By.xpath("//input[@type = 'text' and @id = 'employeeID']");
	public static By EmployeeEmail = By.xpath("//input[@name='email']");
	public static By EmployeeRoleDropDown = By.xpath("//select[@id='role']");
	public static By RoledropdownEmpOption = By.xpath("//option[text()='Employee']");
	public static By EmployeePassword = By.xpath("//input[@type ='password' and @name = 'password']");
	public static By EmpDOB = By.xpath("//input[@type ='date' and @name = 'dob']");
	public static By EmpJoiningDate = By.xpath("//input[@type ='date' and @name = 'joiningDate']");
	public static By EmpQualificationDropDown = By.xpath("//select[@id='qualifications' and @name = 'qualifications']");
	public static By QualificationDropDownOption = By.xpath("//option[text()='B.Tech']");
	public static By EmpDepartment = By.xpath("//input[@type = 'text' and @name = 'department']");
	public static By GenderDropdown = By.xpath("//select[@id= 'gender' and @name = 'gender']");
	public static By GenderDropdownOption = By.xpath("//option[text() = 'Male']");
	public static By EmpMobileNumber = By.xpath("//input[@name='mobileNumber']");
	public static By EmpLocation = By.xpath("//*[@class='add-employee-form']/..//*[@name='location']");
	public static By EmpSalary = By.xpath("//input[@id='salary']");
	public static By EmpBloodGrpDropdw = By.xpath("//select[@id= 'bloodGroup' and @name= 'bloodGroup']");
	public static By EmpBloodgrpOptin = By.xpath("//option[text()='B+']");
	public static By Reportingto = By.xpath("//select[@name='reportingTo' and @id= 'reportingTo']");
	public static By CertificatesDropdown = By.xpath("//button[normalize-space()='Certificates']");
	public static By designation = By.cssSelector("input.sc-imWYAI[name=\"designation\"]");
	public static By CertificatesChecklistOptions = By.xpath("//div[@class='certificates-dropdown shadow']//input[@type='checkbox']");
	public static By AddEmpSubmit= By.xpath("//button[@type = 'submit']");
	public static By EmpSearch = By.xpath("//input[@aria-label='EMP ID Filter Input']");
	public static By DeleteEmp = By.xpath("//button[@class='deleteIcon']");
	public static By EmpCheckboxSearch = By.xpath("//div[@class='ag-body-viewport ag-row-no-animation ag-layout-normal']//input[@type='checkbox']");
}

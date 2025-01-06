package Pages;





import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import Locators.addingEmployee_Locaters;
import utilites.Seleniumhelpers;

public class Addemployee extends addingEmployee_Locaters {
	WebDriver driver;
	Seleniumhelpers helper;

	public Addemployee(WebDriver driver) {
		this.driver = driver;
		this.helper = new Seleniumhelpers(driver);

	}

	public void enterUserName(String username) {
		helper.sendKeyText(Email, username);
	}
	public void enterUserPassword(String password) {
		helper.sendKeyText(Password, password);
	}


	public void clickLogin() {
		helper.clickElement(LoginSubmit);
	}


	public void PageVerification(String expected) {
		helper.PageTitleAssertion(expected);

	}


	public void clickemployee() {
		helper.clickElement(Employee);

	}

	public void clickAddemployee() throws InterruptedException {
		helper.clickElement(AddEmployee);

	}

	public void rolebytext(String text) {

		helper.dropDownValueSelectionByText(EmployeeRoleDropDown, text);
	}

	public void selectBloodgrp(String value) {
		helper.dropDownValueSelectionByText(EmpBloodGrpDropdw, value);
	}

	public void selectQualification(String value) {
		helper.dropDownValueSelectionByText(EmpQualificationDropDown, value);
	}
	public void selectGender(String value) {
		helper.dropDownValueSelectionByText(GenderDropdown, value);
	}

	public void enterfirstname(String value) {
		helper.sendKeyText(Firstname, value);
	}

	public void enterlastname(String value) {
		helper.sendKeyText(Lastname, value);
	}

	public void enterEmpID(String value) {
		helper.sendKeyText(EmployeeID, value);

	}

	public void enterEmailID(String value) {
		helper.sendKeyText(EmployeeEmail, value);

	}
	public void enterEmpPassword(String value) {
		helper.sendKeyText(EmployeePassword, value);

	}

	public void enterEmpdob(String value) {
		helper.sendKeyText(EmpDOB, value);
	}

	public void enterEmpJOD(String value) {
		helper.sendKeyText(EmpJoiningDate, value);
	}

	public void enterdeparment(String value) {
		helper.sendKeyText(EmpDepartment, value);
	}

	public void enterLocation(String value) {
		helper.sendKeyText(EmpLocation, value);
	}

	public void enterSalary(String value) {
		helper.sendKeyText(EmpSalary, value);
	}

	public void enterdesignation(String value) {
		helper.sendKeyText(designation, value);
	}

	public void reportingto(String value) {
		helper.sendKeysUsingJavaScript(Reportingto, value);
	}
	public void enterPhoneNo(String value) {

		helper.sendKeysUsingJavaScript(EmpMobileNumber, value);
		

	}


	public void certificatesCheckbox() {
		helper.clickDropdownAndCheckboxes(CertificatesDropdown, CertificatesChecklistOptions);

	}

	public void SubmitNewEmpDetails() {
		helper.clickUsingJavaScript(AddEmpSubmit);

	}
	
	public void searchEmp(String employeeid) {
		
		helper.sendKeysUsingJavaScript(EmpSearch, employeeid);

	}
	public void searchEmpcheckBox() throws InterruptedException {
		helper.clickUsingJavaScript(EmpCheckboxSearch);
		
		
	}
	
	public void searchEmpDelete() {
		helper.clickUsingJavaScript(DeleteEmp);
		
	}

	public void addEmpUsingSwitch(String key, String value) {
		switch (key.toLowerCase()) {
		case "firstname":
			enterfirstname(value);
			break;
		case "emplastname":
			enterlastname(value);
			break;
		case "employeeid":
			enterEmpID(value);

			break;
		case "emailid":
			enterEmailID(value);
			break;
		case "emprole":
			rolebytext(value);
			break;
		case "password":
			enterEmpPassword(value);
			break;
		case "dob":
			enterEmpdob(value);
			break;
		case "jod":
			enterEmpJOD(value);
			break;
		case "qualification":
			selectQualification(value);
			break;
		case "department":
			enterdeparment(value);
			break;
		case "gender":
			selectGender(value);
			break;
		case "phoneno":
			enterPhoneNo(value);

			break;
		case "location":
			enterLocation(value);
			break;
		case "salary":
			enterSalary(value);
			break;
		case "bloodgroup":
			selectBloodgrp(value);

			break;
		case "reportingto":
			reportingto(value);
			break;
		case "designation":
			enterdesignation(value);
			break;
		case "certification":
			certificatesCheckbox();
			break;
		
		default:
			System.out.println("Field not recognized: " + key);
			
			break;
		}
		
	}
	
	
}

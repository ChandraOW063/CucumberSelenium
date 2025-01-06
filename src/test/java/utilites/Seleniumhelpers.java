package utilites;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;


import StepDefinitions.TestBase;

public class Seleniumhelpers {
	WebDriver driver;

	public Seleniumhelpers(WebDriver driver) {
		this.driver = TestBase.getDriver();

	}

	
	public void PageTitleAssertion(String expectedTitle) {
		String actualTitle = driver.getTitle();
		Assert.assertEquals(actualTitle, expectedTitle,
				"Page title does not match the expected title. Expected: " + expectedTitle + ", but got: " + actualTitle);
	}

	
	public void clickElement(By locator) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));
		WebElement clickElement = wait.until(ExpectedConditions.elementToBeClickable(locator));
		clickElement.click();
	}

	
	public void dropDownValueSelectionByText(By dropDownID, String dropDownValue) {
		WebElement element = driver.findElement(dropDownID);
		Select dropDown = new Select(element);
		dropDown.selectByVisibleText(dropDownValue);
	}

	
	public void dropDownValueSelectionByIndex(By dropDownID, int index) {
		WebElement element = driver.findElement(dropDownID);
		Select dropDown = new Select(element);
		dropDown.selectByIndex(index);
	}

	
	public void sendKeyText(By locator, String value) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
		WebElement Textfield = wait.until(ExpectedConditions.elementToBeClickable(locator));
		Textfield.clear();
		Textfield.sendKeys(value);
	}

	
	public void getTextAssertion(By locator, String expectedValue) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));
		WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
		String actualText = element.getText().trim();
		Assert.assertEquals(actualText, expectedValue);
	}

	
	public void scrollToElement(By locator) {
		try {
			JavascriptExecutor js = (JavascriptExecutor) driver;
			js.executeScript("arguments[0].scrollIntoView(true);", locator);
		} catch (Exception e) {
			System.out.println("Error while scrolling to the element: " + e.getMessage());
		}
	}

	
	public void elementVisible(By locator) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
		wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
	}

	public void sendKeysUsingJavaScript(By locator, String keys) {

		WebElement element = driver.findElement(locator);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView(true);", element, keys);
		element.sendKeys(keys);
	}
	public void scrollToElementUsingActions(By element) {
		WebElement element2 = driver.findElement(element);
		Actions actions = new Actions(driver);
		actions.moveToElement(element2).perform();
	}

	public void ElementisDispalyedsendTextData(By locator, String value) {
		WebElement field = driver.findElement(locator);
		field.isDisplayed();
		field.clear();
		field.sendKeys(value);
	}

	public void clickDropdownAndCheckboxes(By locator1, By locator2) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(50));  // Updated with Duration
		WebElement dropdown = wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(locator1)));  // Dropdown locator passed as parameter
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].click();", dropdown);
		List<WebElement> checkboxes = driver.findElements(locator2);  // Checkbox locator passed as parameter

		if (checkboxes.size() >= 2) {
			js.executeScript("arguments[0].click();", checkboxes.get(0));  
			js.executeScript("arguments[0].click();", checkboxes.get(1));  
		}
	}

	public void clickUsingJavaScript(By locator) {
		WebElement element = driver.findElement(locator);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView(true);", element);
		js.executeScript("arguments[0].click();", element);
	}

}

package utilites;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.testng.Assert;

public class Utilities {
    WebDriver driver;

    public Utilities(WebDriver driver) {
        this.driver = driver;
    }

    public void GetTitle() {
        String title = driver.getTitle();
        System.out.println(title);
    }

    public boolean isElementDisplayed(WebElement element) {
        try {
            return element.isDisplayed();
        } catch (Exception e) {
            return false;  // In case element is not found or another exception occurs
        }
    }

    public WebElement waitForElement(WebElement webElement, int timeoutInSeconds, ExpectedCondition<WebElement> condition) {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(timeoutInSeconds));
        return wait.until(condition);
    }

    public void clickAction(By locator) {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        WebElement clickButton = wait.until(ExpectedConditions.elementToBeClickable(locator));
        clickButton.click();
    }

    public void assertPageTitle(String expectedTitle) {
        // Get the actual title of the page
        String actualTitle = driver.getTitle();

        // Assert that the actual title matches the expected title
        Assert.assertEquals(actualTitle, expectedTitle, 
            "Page title does not match the expected title. Expected: " + expectedTitle + ", but got: " + actualTitle);
    }

    public WebElement locateElement(String locatorType, String locatorValue) {
        WebElement element = null;
        try {
            switch (locatorType.toLowerCase()) {
                case "id":
                    element = driver.findElement(By.id(locatorValue));
                    break;
                case "name":
                    element = driver.findElement(By.name(locatorValue));
                    break;
                case "xpath":
                    element = driver.findElement(By.xpath(locatorValue));
                    break;
                case "css":
                    element = driver.findElement(By.cssSelector(locatorValue));
                    break;
                case "class":
                    element = driver.findElement(By.className(locatorValue));
                    break;
                case "tag":
                    element = driver.findElement(By.tagName(locatorValue));
                    break;
                case "linktext":
                    element = driver.findElement(By.linkText(locatorValue));
                    break;
                case "partiallinktext":
                    element = driver.findElement(By.partialLinkText(locatorValue));
                    break;
                default:
                    throw new IllegalArgumentException("Invalid locator type: " + locatorType);
            }
        } catch (NoSuchElementException e) {
            System.out.println("Element not found with locator: " + locatorType + " and value: " + locatorValue);
            throw e; // Rethrow the exception if element is not found
        }
        return element;
    }
}

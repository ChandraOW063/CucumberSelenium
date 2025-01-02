package Pages;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.remote.CapabilityType;

public class TestBase {
    public WebDriver driver;

    // Method to launch the browser only if it's not already initialized
    public WebDriver launchBrowser() throws IOException {
        // Check if driver is already initialized
        if (driver == null) {
            // Load properties file
            FileInputStream file = new FileInputStream("src/test/resources/config.properties");
            Properties prop = new Properties();
            prop.load(file);

            // Read the browser name and URL from the properties file
            String browser = prop.getProperty("browser");
            String url = prop.getProperty("url");
            String projectPath = System.getProperty("user.dir");

            try {
                switch (browser.toLowerCase()) {
                    case "chrome":
                        System.setProperty("webdriver.chrome.driver", projectPath + "/src/test/resources/Drivers/chromedriver.exe");
                        ChromeOptions chromeOptions = new ChromeOptions();
                        driver = new ChromeDriver(chromeOptions);
                        break;

                    case "firefox":
                    	System.setProperty("webdriver.gecko.driver", projectPath + "/src/test/resources/Drivers/geckodriver.exe");

                        FirefoxOptions firefoxOptions = new FirefoxOptions();
                        // Enable WebDriver BiDi using capabilities
                        firefoxOptions.setCapability(CapabilityType.BROWSER_NAME, "firefox");
                        driver = new FirefoxDriver(firefoxOptions);
                        break;

                    case "edge":
                        System.setProperty("webdriver.edge.driver", projectPath + "/src/test/resources/Drivers/msedgedriver.exe");
                        EdgeOptions edgeOptions = new EdgeOptions();
                        driver = new EdgeDriver(edgeOptions);
                        break;

                    default:
                        throw new IllegalArgumentException("Browser not supported: " + browser);
                }

                driver.manage().window().maximize();
                driver.get(url);
            } catch (Exception e) {
                System.out.println("Error while launching the browser: " + e.getMessage());
                throw new RuntimeException("Error initializing the browser: " + e.getMessage(), e);
            }
        }
        return driver;
    }

    // Method to quit the browser (useful for cleanup after tests)
    public void quitBrowser() {
        if (driver != null) {
            driver.quit();  // Close and quit the browser
            driver = null;
        }
    }
}

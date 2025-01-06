package StepDefinitions;


import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import io.cucumber.java.After;
import io.cucumber.java.Before;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;



public class TestBase {

    
    protected static WebDriver driver;  
    
    private static Properties properties = new Properties();

    
    static {
        try {
            FileInputStream inputStream = new FileInputStream("src/test/resources/config.properties");
            properties.load(inputStream);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    
    @Before
    public void setup() {
    	
    	
        
        String browser = properties.getProperty("browser");
        String url = properties.getProperty("url");

        
        if ("chrome".equalsIgnoreCase(browser)) {
            System.setProperty("webdriver.chrome.driver", properties.getProperty("chromedriver.path"));
            driver = new ChromeDriver();
        } else if ("firefox".equalsIgnoreCase(browser)) {
            System.setProperty("webdriver.gecko.driver", properties.getProperty("geckodriver.path"));
            driver = new FirefoxDriver();
        } else {
            throw new IllegalArgumentException("Unsupported browser: " + browser);
        }

        
        driver.manage().window().maximize();
        driver.manage().deleteAllCookies();
        driver.get(url);
    }

    
    @After
    public void tearDown() {
        if (driver != null) {
            driver.quit();  
        }
    }

    
    public static WebDriver getDriver() {
        return driver;
    }
}

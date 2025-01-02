package testRunner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
		
		features = "src/test/resources/Features/LoginSteps.feature",  // Path to the feature files (make sure it's lowercase 'features')
glue = "StepDefinitions",  // Path to your step definition package
plugin = {"pretty", "html:target/htmlReports/cucumber-reports.html"},

monochrome = true )	


public class TestngTestRunner extends AbstractTestNGCucumberTests {
	
	

}

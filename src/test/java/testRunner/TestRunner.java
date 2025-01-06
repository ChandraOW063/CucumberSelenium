package testRunner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
    features = "src/test/resources/Features/addEmployeeDataTbl.feature", 
    glue = "StepDefinitions",  
    plugin = {"pretty", "html:target/htmlReports/cucumber-reports.html"},
    tags = "@AddemployeeUsingDataTables",
    monochrome = true 
)
public class TestRunner extends AbstractTestNGCucumberTests {
}


package Runners;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
        features = {"src/test/resources/Features"},
        glue = {"Steps"},
        plugin = {"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"},
        plugin = {pretty,"HTML:tatget/cucumber-Report.html","json:target/report.json"},
        tags =  "@F1Results2023"
)
public class runner extends AbstractTestNGCucumberTests {
}


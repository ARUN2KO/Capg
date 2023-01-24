package testrunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features = "C:\\Users\\ARUNKUA\\eclipse-workspace\\BookMyShow2\\src\\test\\resources\\features",
        glue = {"stepdefinitions"},
        
        monochrome = true,
        plugin = {"pretty",
                "junit:target/cucumber-reports/cucumber.xml",
                "html:target/HTMLReports/report.html",
                "json:target/cucumber-reports/cucumber.json",
                "com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"},
        dryRun=false)
public class TestRunner {

}

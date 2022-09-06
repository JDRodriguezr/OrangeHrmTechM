package StepDefinitions;


import cucumber.api.CucumberOptions;
import cucumber.api.testng.CucumberFeatureWrapper;
import cucumber.api.testng.TestNGCucumberRunner;

//Not functional, pending

@CucumberOptions(
features="src\\test\\resources\\Features\\", 
tags= {"@ChangeConfigurationOptionalFields"},
glue= {"StepDefinitions"}, 
monochrome = true,
plugin={"pretty", "html:target\\HtmlReports\\report.html"})
public class TestRunner {

}

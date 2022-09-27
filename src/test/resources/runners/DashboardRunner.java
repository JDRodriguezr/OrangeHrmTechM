package stepdefinitions;


import cucumber.api.CucumberOptions;
import cucumber.api.testng.CucumberFeatureWrapper;
import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
import cucumber.api.testng.TestNGCucumberRunner;

@CucumberOptions(
    features="src\\test\\resources\\Features\\Dashboard.feature",
    glue= {"stepdefinitions"},
    monochrome = true,
    plugin={"pretty", "html:target\\HtmlReports\\report.html",
    snippets = CAMELCASE})

public class DashboardRunner extends AbstractTestNGCucumberTests {

}

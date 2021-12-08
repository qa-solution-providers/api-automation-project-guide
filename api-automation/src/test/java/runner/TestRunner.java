package runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.CucumberOptions.SnippetType;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = "src/test/resources/features/CallCurrentWeatherDataForOneLocation.feature",
		glue = {"stepdefinitions"},
		plugin = {"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"},
		snippets = SnippetType.CAMELCASE,
		dryRun = false
		)
public class TestRunner {

}

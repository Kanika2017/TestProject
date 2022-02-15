package MyRunner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@SuppressWarnings("deprecation")
@RunWith(Cucumber.class)
@CucumberOptions(features = "C:/Users/KanikaJain/test-automation/HobbyProject/src/test/java/Feature/test.feature", glue = {
		"StepDefinitions" }, plugin = { "pretty", "html:target/cucumber-html-report",
				"json:target/cucumber/cucumber.json", "junit:target/cucumber.xml",
				"rerun:target/rerun.txt" }, monochrome = true, strict = true, dryRun = false, tags = { "@test" })

public class TestRunner {

}

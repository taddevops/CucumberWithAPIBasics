package cucmbertestsample.runner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		features= {"classpath:features"},
		glue="stepdefs",
		plugin=  { 
				"pretty",
				"html:test-output/cucumberreport"
		},
		tags = "@testthis"


		)
public class RunnerTest {

}

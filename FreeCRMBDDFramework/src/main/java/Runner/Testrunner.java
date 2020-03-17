package Runner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = "C:\\Users\\Suresh\\eclipse-workspace\\FreeCRMBDDFramework\\src\\main\\java\\Features", //the path of the feature files
		glue={"stepDefinitions"},
format = {"pretty","html:test-outout"})


public class Testrunner {

}

package Runner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = "C:\\Users\\Suresh\\git\\Bdd\\FreeCRMBDDFramework\\src\\main\\java\\Features\\tagging.feature", //the path of the feature files
		glue={"stepDefinitions"}, //the path of the stepDefinitions files
format  = {"pretty","html:test-outout","junit: junit_XML/Cucumber.xml" } // to genrate differnt types of report
		,monochrome = true // Display console output in readable formate
,strict = true // it will check if any step is not defined inside stepdefination file
				,dryRun = false, // To check mapping is correct between future file and stepdefination file
tags = {"@End2End, @RegressionTest"})	

public class Testrunner {

}

//ORed : tags = {"@SmokeTest , @RegressionTest"} -- execute all tests tagged as @SmokeTest OR @RegressionTest
	//ANDed : tags = tags = {"@SmokeTest" , "@RegressionTest"} -- execute all tests tagged as @SmokeTest AND @RegressionTest
package org.runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
	features="@src//test//resources//FailedScenarios//LoginFailedCases.txt",
	glue="org.stepdefinition",
	dryRun=false,
	
	plugin= {"rerun:src//test//resources//FailedScenarios//LoginFailedCases.txt",
			"pretty",
			"html:src//test//resources//Reports//LoginReport.html",
			"json:src//test//resources//Reports//LoginReport.json",
			"junit:src//test//resources//Reports//LoginReport.xml"}
		)
public class ReRunner {
	
	
	

}

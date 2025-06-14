package org.runner;

import java.io.IOException;

import org.junit.AfterClass;
import org.junit.runner.RunWith;
import org.utilities.Reportutils;


import io.cucumber.junit.Cucumber;

import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
	features="src/test/resources/",
	glue="org.stepdefinition",
	dryRun=false,
	
	plugin= {"rerun:src//test//resources//FailedScenarios//LoginFailedCases.txt",
			"pretty",
			"html:src//test//resources//Reports//LoginReport.html",
			"json:src//test//resources//Reports//LoginReport.json",
			"junit:src//test//resources//Reports//LoginReport.xml"}
		)
public class TestRunner {
	
	
	@AfterClass
	public static void reportGeneration() throws IOException{
		
		Reportutils.generateJVMReport(System.getProperty("user.dir")+"\\src\\test\\resources\\Reports\\LoginReport.json");
		
		
		
	}
	
	

}

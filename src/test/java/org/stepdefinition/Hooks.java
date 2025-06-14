package org.stepdefinition;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.utilities.BaseClass;

import io.cucumber.core.api.Scenario;
import io.cucumber.java.After;
import io.cucumber.java.Before;



import io.github.bonigarcia.wdm.WebDriverManager;

public class Hooks extends BaseClass {
	
	
	
	@Before
	public void beforeScenarioStarts() {
		
		loadBrowser();
		
		
	}
	
	@After
	public void afterScenario(Scenario s) {
		
		if (s.isFailed()) {
			
			TakesScreenshot ts = (TakesScreenshot) driver;
			byte[] b= ts.getScreenshotAs(OutputType.BYTES);
			//attach
			s.embed(b, "image/png",s.getName());
			
			
			
		}
		
		closeBrowser();
		
		System.out.println("Scenario ends");
		
	}
	

}

package org.stepdefinition;

import org.junit.Assert;
import org.objectrepository.LoginPagePojo;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.utilities.BaseClass;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class LoginPageSteps extends BaseClass {
	
	
	
public static  LoginPagePojo lp = new LoginPagePojo(); 
	

@Given("user launches the web application with valid url")
public void user_launches_the_web_application_with_valid_url() {
    
	launchUrl("https://practicetestautomation.com/practice-test-login/");
	
	
	
	WebElement homePage = lp.getHomePage();
	
	
	Assert.assertTrue("Login Page is Not Displayed",homePage.getText().equals("Test login"));
	
	try {
		Thread.sleep(3000);
	} catch (InterruptedException e) {
		
		e.printStackTrace();
	}
	
	
	
	
}

@Given("user enter valid {string}details and {string}")
public void user_enter_valid_details_and(String usrName, String usrPassword) {
   
	
	WebElement usrLogin = lp.getUsrLogin();
	
	usrLogin.sendKeys(usrName);
	
	
	WebElement usrPass = lp.getUsrPass();
	
	usrPass.sendKeys(usrPassword);
	
	
	
}

@When("user clicks login button")
public void user_clicks_login_button() {
    
	
	WebElement btnSubmit = lp.getBtnSubmit();
	
	btnSubmit.click();
	
	
	
}

@Then("user lands on home page")
public void user_lands_on_home_page() {
    
	
	String currentUrl = driver.getCurrentUrl();
	
	try {
		
		Thread.sleep(3000);
	} 
	
	catch (InterruptedException e) 
	
	{
		
		e.printStackTrace();
	}
	
	Assert.assertTrue("Home page is not displayed", currentUrl.equals("https://practicetestautomation.com/logged-in-successfully/"));
	
	
}

@Then("user verifies the url and congragulation message")
public void user_verifies_the_url_and_congragulation_message() {
	
	WebElement title = lp.getTitle(); 
	
	Assert.assertTrue("Home page is not displayed", title.getText().equals("Logged In Successfully"));
   
	
	System.out.println("Home Page is Suucefully Tested ");	
	
}


	

}

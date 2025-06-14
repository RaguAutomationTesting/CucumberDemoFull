package org.objectrepository;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.utilities.BaseClass;

public class LoginPagePojo extends BaseClass {
	
	public LoginPagePojo() {
		
		PageFactory.initElements(driver, this);
		
	}
	
	
	@FindBy(xpath="//h2[text()='Test login']")
	private WebElement homePage;
	
	@FindBy(xpath="//input[@id='username']")
	private WebElement usrLogin;
	
	@FindBy(xpath="//input[@id='password']")
	private WebElement usrPass;
	
	@FindBy(xpath="//button[@id='submit']")
	private WebElement btnSubmit;
	
	@FindBy(xpath="//h1[@class='post-title']")
	private WebElement title;

	public WebElement getHomePage() {
		return homePage;
	}

	public WebElement getUsrLogin() {
		return usrLogin;
	}

	public WebElement getUsrPass() {
		return usrPass;
	}

	public WebElement getBtnSubmit() {
		return btnSubmit;
	}

	public WebElement getTitle() {
		return title;
	}

	
	
	
	

}

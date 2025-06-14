package org.utilities;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {

	public static WebDriver driver;
	
	
	public static void loadBrowser(){
		
		WebDriverManager.chromedriver().setup();
		
		driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		
	}
	
	
	public  void closeBrowser() {
		
		driver.close();

	}
	
	
	public static void launchUrl(String url){
		
		driver.get(url);
	}
	
	
	
}

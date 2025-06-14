package org.utilities;


import java.io.File;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import net.masterthought.cucumber.Configuration;
import net.masterthought.cucumber.ReportBuilder;


public class Reportutils {
	
	
	
	public static void generateJVMReport(String jsaonPath) {
	
		File f = new File (System.getProperty("user.dir")+"\\src\\test\\resources\\Reports\\Jvm Reports");
		
		
		
		Configuration c = new Configuration(f,"Practise Test Automation Login Page");
		
		c.addClassifications("Browser Name ", "Chrome Browser");
		c.addClassifications("Build url ", "https://practicetestautomation.com/practice-test-login/");
		c.addClassifications("Platform Name ",System.getProperty("os.name"));
		c.addClassifications("Java Version",System.getProperty("java.version"));
		c.addClassifications("Sprint ","21");
		c.addClassifications("Tested By","Raguraman");
		String date = LocalDateTime.now().format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss"));
        c.addClassifications("Date of Execution", date);
        
		
		
		List<String> li = new ArrayList();
		li.add(jsaonPath);
		
		
		ReportBuilder r = new ReportBuilder(li,c);
		
		r.generateReports();
		
		
	}

}

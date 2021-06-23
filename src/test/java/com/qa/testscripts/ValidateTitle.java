package com.qa.testscripts;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class ValidateTitle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver=null;
		
		System.setProperty("webdriver.edge.driver", "C:\\Users\\adderis\\eclipse-workspace\\Drivers\\edgedriver_win64\\msedgedriver.exe");
        driver = new EdgeDriver();
        
        driver.get("https://www.google.co.in/");
        
       String title=driver.getTitle();
       System.out.println(title);
       if(title=="google") {
    	   System.out.println("Title is in lowercase");
       }
       else if(title=="GOOGLE") {
    	   System.out.println("Title is in uppercase");
    	  
       }
       else 
    	   System.out.println("Combination of Upper and Lower case");

	}

}

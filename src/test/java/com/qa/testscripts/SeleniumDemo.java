package com.qa.testscripts;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class SeleniumDemo {

	public static void main(String[] args) throws InterruptedException { 
		
		WebDriver driver=null;
		System.setProperty("webdriver.edge.driver", "C:\\Users\\adderis\\eclipse-workspace\\Drivers\\edgedriver_win64\\msedgedriver.exe");
		driver =new EdgeDriver(); 
		
		//driver.get("https://www.amazon.com/ap/signin?openid.pape.max_auth_age=0&openid.return_to=https%3A%2F%2Fwww.amazon.com%2F%3Ftag%3Damazusnavi-20%26hvadid%3D381823327651%26hvpos%3D%26hvnetw%3Dg%26hvrand%3D4193427764475230916%26hvpone%3D%26hvptwo%3D%26hvqmt%3De%26hvdev%3Dc%26hvdvcmdl%3D%26hvlocint%3D%26hvlocphy%3D9058688%26hvtargid%3Dkwd-10573980%26ref%3Dnav_signin%26hydadcr%3D28883_11845442%26gclid%3DEAIaIQobChMIjIGPm-fw8AIVURmtBh29KwYiEAAYASAAEgIDNfD_BwE&openid.identity=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.assoc_handle=usflex&openid.mode=checkid_setup&openid.claimed_id=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.ns=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0&");
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
		/*driver.findElement(By.id("ap_email")).sendKeys("8150805540");
		driver.findElement(By.id("continue")).click();
		
		driver.findElement(By.id("ap_password")).sendKeys("Sharath@91");
		driver.findElement(By.id("signInSubmit")).click();*/
		driver.get("https://www.amazon.com/?tag=amazusnavi-20&hvadid=381823327651&hvpos=&hvnetw=g&hvrand=4193427764475230916&hvpone=&hvptwo=&hvqmt=e&hvdev=c&hvdvcmdl=&hvlocint=&hvlocphy=9058688&hvtargid=kwd-10573980&ref=nav_signin&hydadcr=28883_11845442&gclid=EAIaIQobChMIjIGPm-fw8AIVURmtBh29KwYiEAAYASAAEgIDNfD_BwE&");
        driver.manage().deleteAllCookies();
        driver.findElement(By.id("twotabsearchtextbox")).sendKeys("da vinci code");
        Thread.sleep(2000);
		driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
		
	}

}

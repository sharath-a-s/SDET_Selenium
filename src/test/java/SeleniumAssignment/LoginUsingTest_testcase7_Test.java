package SeleniumAssignment;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.BeforeTest;

public class LoginUsingTest_testcase7_Test{
	WebDriver driver;
	@BeforeTest()
	public void openbrowser() {
		try {
			System.setProperty("webdriver.edge.driver", "C:\\Users\\adderis\\eclipse-workspace\\Drivers\\edgedriver_win64\\msedgedriver.exe");
			WebDriver driver = new EdgeDriver();
			driver.get("https://opensource-demo.orangehrmlive.com/");
			driver.manage().window().maximize();
		}
		catch(Exception e) {
			System.out.println(e.toString());
		}
	}
	@Test
	public void StartTestStep2() {
		driver.findElement(By.xpath("//input[@id='txtUsername']")).sendKeys("Admin");
		driver.findElement(By.xpath("//input[@id='txtPassword']")).sendKeys("admin123");
		driver.findElement(By.id("btnLogin")).click();
	}
	
}

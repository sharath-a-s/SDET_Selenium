package SeleniumAssignment;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class Openbrowserbeforesuite_testcase6_Test {

	@Test
    public void beforeSuiteTest()
	{
	System.out.println("Test Execution");
	}
	@BeforeSuite
	public void before_suite() 
	{
	System.setProperty("webdriver.edge.driver", "C:\\Users\\adderis\\eclipse-workspace\\Drivers\\edgedriver_win64\\msedgedriver.exe");
	WebDriver driver = new EdgeDriver();
	driver.get("https://opensource-demo.orangehrmlive.com/");
	
	driver.manage().window().maximize();
	driver.close();
	
	}
}
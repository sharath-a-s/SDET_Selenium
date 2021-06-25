package SeleniumAssignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Locator_testcase3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.edge.driver", "C:\\Users\\adderis\\eclipse-workspace\\Drivers\\edgedriver_win64\\msedgedriver.exe");
		WebDriver driver = new EdgeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//input[@id='txtUsername']"));
		driver.findElement(By.xpath("//input[@id='txtPassword']"));
		driver.findElement(By.linkText("Forgot your password?"));
		driver.findElement(By.xpath("//div[@id='divLogo']//child::img"));
		driver.findElement(By.cssSelector("input#txtUsername"));
		driver.findElement(By.cssSelector("input#txtPassword"));

	}

}

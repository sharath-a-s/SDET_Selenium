package SeleniumAssignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class PrintTitle_testcase8 {

	static WebDriver driver ;
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.edge.driver", "C:\\Users\\adderis\\eclipse-workspace\\Drivers\\edgedriver_win64\\msedgedriver.exe");
		WebDriver driver = new EdgeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/");
		Thread.sleep(3000);
		driver.manage().window().maximize();
		try {
			driver.findElement(By.xpath("//input[@id='txtUsername']")).sendKeys("Admin");
			driver.findElement(By.xpath("//input[@id='txtPassword']")).sendKeys( "admin123");
			driver.findElement(By.id("btnLogin")).click();
		}
		catch(Exception e) {
			System.out.println(e.toString());
		}
		java.util.List<WebElement> a1 = driver.findElements(By.id("mainMenu"));
		for (WebElement webElement : a1) {
			System.out.println(webElement.getText());
}
}
}
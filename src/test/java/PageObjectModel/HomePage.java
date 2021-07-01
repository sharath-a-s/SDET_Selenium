package PageObjectModel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;

public class HomePage {
	
	WebDriver driver;
	By directoryTab = By.xpath("//*[@id='menu_directory_viewDirectory']/b");

	public HomePage(WebDriver driver)

	{
		this.driver = driver;
	}

	public void moveToDirectoryTab() {
		Actions act = new Actions(driver);
		act.moveToElement(driver.findElement(directoryTab)).click().perform();
	}
}

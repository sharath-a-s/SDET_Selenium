package PageObjectModel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;

public class DirectoryPage {
WebDriver driver;
By SearchName= By.xpath("//*[@id='searchDirectory_emp_name_empName']");
By Searchbutton = By.xpath("//*[@id='searchBtn']");
By Reset= By.id("resetBtn");
By ResultTable = By.xpath("//*[@id='resultTable']");
By Content = By.xpath("//*[@id='resultTable']/tbody/tr");
By JobTitle = By.xpath("//*[@id='searchDirectory_job_title']");
public DirectoryPage(WebDriver driver)

{
	this.driver = driver;
}
public void searchByName()
{
Actions act =new Actions(driver);	
act.moveToElement(driver.findElement(SearchName));
}
public void setSearchName(String user) {
    driver.findElement(SearchName).sendKeys(user);
}
public void Searchbuttonclick() {
    driver.findElement(Searchbutton).click();
}
public void Read(String str)
{
	 str = driver.findElement(Content).getText();
	 System.out.println(str);
}

public void Resetbuttonclick() {
    driver.findElement(Reset).click();
}
public void selectTitle() {
	//driver.se
}
}
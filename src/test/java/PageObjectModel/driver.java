package PageObjectModel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class driver {
	static WebDriver driver;
	static LoginPage objLogin;
	static HomePage objHome;
	static DirectoryPage objDir;
	public static void main(String[] args) {
	
		 setup();
		 testDirectoryPage();
	
	}
public static void setup()
{
		System.setProperty("webdriver.edge.driver", "C:\\Users\\adderis\\eclipse-workspace\\Drivers\\edgedriver_win64\\msedgedriver.exe");
		driver = new EdgeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/");
		driver.manage().window().maximize();
}

public static void testDirectoryPage()
	{
		objLogin= new LoginPage(driver);
		objLogin.setUserName("Admin");
		objLogin.setPassword("admin123");
		objLogin.clickOnLoginBtn();
		
		objHome= new HomePage(driver);
		objHome.moveToDirectoryTab();
		
		objDir = new DirectoryPage(driver);
		objDir.setSearchName("peter");
		
		objDir.Searchbuttonclick();
		objDir.Resetbuttonclick();
	}
}

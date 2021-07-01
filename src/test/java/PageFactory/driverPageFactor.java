package PageFactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class driverPageFactor {
	static WebDriver driver;
	static LoginPage1 objLogin1;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		setup();
		testLoginPage();
	}

	public static void setup() {
		System.setProperty("webdriver.edge.driver", "C:\\Users\\adderis\\eclipse-workspace\\Drivers\\edgedriver_win64\\msedgedriver.exe");
		driver = new EdgeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/");
		driver.manage().window().maximize();
	}

	public static  void testLoginPage() {

		objLogin1 = new LoginPage1(driver);
		objLogin1.SetUserName("Admin");
		objLogin1.Setpassword("admin123");
		objLogin1.clickOnLoginButton();

	}
}

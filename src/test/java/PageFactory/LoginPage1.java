package PageFactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage1 {

	WebDriver driver;
	
	@FindBy(id= "txtUsername")
	WebElement username;
	
	@FindBy(id="txtPassword")
	WebElement password;
	
	@FindBy(id= "btnLogin")
	WebElement Loginbutton;
	
	@FindBy(linkText="Forgot your password?")
	WebElement forgotpassword;
	
	public LoginPage1(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	public void SetUserName(String User)
	{
		username.sendKeys(User);
	}
public void Setpassword(String Password) {
	password.sendKeys(Password);
}
public void clickOnLoginButton()
{
	Loginbutton.click();
}
}
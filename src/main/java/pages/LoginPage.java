package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import utility.CommonFunctions;

public class LoginPage extends CommonFunctions {
	WebDriver driver;
	
	public LoginPage(WebDriver d)
	{
		super(d);
		this.driver=d;
	}
	
	public void signON()
	{
		click(By.linkText("SIGN-ON"));
		
	}
	public void register()
	{
		click(By.linkText("REGISTER"));
	}
	public void support()
	{
		driver.findElement(By.linkText("SUPPORT")).click();
	}
	public void contact()
	{
		driver.findElement(By.linkText("CONTACT")).click();
	}
	public void login()
	{
		driver.findElement(By.linkText("SIGN-ON")).click();
	}

}

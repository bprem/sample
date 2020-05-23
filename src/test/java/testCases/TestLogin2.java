package testCases;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import browserSettings.ChooseDriver;
import pages.LoginPage;
import pages.RegistrationPage;

public class TestLogin2 {
	
	
	public void setup()
	{
		//ChooseDriver.browser("chrome", "");
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Prem Kumar\\Downloads\\chromedriver_81\\chromedriver.exe");
		WebDriver  driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		driver.get("");
		LoginPage lp = new LoginPage(driver);
		lp.register();
		RegistrationPage rp = new RegistrationPage(driver);
		rp.contactInformation("prem","kumar","987655","sdfndsf@gmail.com");
		rp.mailingInformation("mdu","madurai","TN","625009","ANGOLA");
	}

}

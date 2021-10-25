package browserSettings;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ChooseDriver {
	
static	WebDriver driver;
	public static WebDriver browser(String bname,String url)
	{
		if(bname.equalsIgnoreCase("chrome"))
		{
		
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\Prem Kumar\\Downloads\\chromedriver_81\\chromedriver.exe");
			 driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
			driver.get(url);
		}
		else if(bname.equalsIgnoreCase("firefox"))
		{
			System.setProperty("webdriver.gecko.driver", "C:\\Users\\Prem Kumar\\Downloads\\chromedriver_81\\chromedriver.exe");
			 driver = new FirefoxDriver();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
			driver.get(url);
		}
		return driver;
	}

}

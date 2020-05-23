package utility;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CommonFunctions {
	
	WebDriver driver;
	public CommonFunctions(WebDriver d)
	{
		this.driver=d;
	}
	public void click(By locType)
	{
		driver.findElement(locType).click();
	}
	public void type(By lovType,String v)
	{
		driver.findElement(lovType).sendKeys(v);
	}
	public void clear()
	{
		
	}

}

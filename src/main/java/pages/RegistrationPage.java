package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import utility.CommonFunctions;
import utility.PropertyFileReader;

public class RegistrationPage extends CommonFunctions{
	WebDriver driver;
	public RegistrationPage(WebDriver d)
	{
		super(d);
		this.driver=d;
	}
	public void contactInformation(String fn,String ln,String ph,String email)
	{
		By FN=By.name(PropertyFileReader.getLocator("firstname_name"));
		type(FN,fn);
		type(By.name(PropertyFileReader.getLocator("lastName_name")),ln);
		type(By.name("phone"),ph);
		type(By.name("userName"),email);
		
	}
	public void mailingInformation(String ad,String c,String S,String pc,String coun)
	{
		type(By.name("address1"),ad);
		type(By.name("city"),c);
		type(By.name("state"),S);
		type(By.name("postalCode"),pc);
	WebElement cou=	driver.findElement(By.name("country"));
	Select s = new Select(cou);
	s.selectByVisibleText(coun);
	}

}

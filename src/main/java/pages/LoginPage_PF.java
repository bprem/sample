package pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class LoginPage_PF {

	
	@FindBy(how=How.LINK_TEXT,using="SIGN-ON") 
private	WebElement signon;
	@FindBy(how=How.LINK_TEXT,using="REGISTER") 
	WebElement register;
	
	@FindBy(how=How.LINK_TEXT,using="REGISTER") 
	@CacheLookup
	List<WebElement> register1;

	
	public void signOn()
	{
		signon.click();
	}
	public void register()
	{
		register.click();
	}
	public void support()
	{
		
	}
	public void contact()
	{
		
	}
	public void login()
	{
	
	}
}

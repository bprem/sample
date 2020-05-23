package testCases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import browserSettings.ChooseDriver;
import pages.LoginPage;
import pages.LoginPage_PF;
import pages.RegistrationPage;

public class TestLogin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		WebDriver d=ChooseDriver.browser("chrome", "http://www.newtours.demoaut.com/");
		LoginPage_PF lp=	PageFactory.initElements(d, LoginPage_PF.class);
		lp.register();
	}

}

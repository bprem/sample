package testCases;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

import browserSettings.ChooseDriver;
import pages.LoginPage;
import pages.RegistrationPage;

public class Sample_Testng {
	WebDriver d;
	ExtentReports report;
	ExtentTest test;

	@BeforeClass
	public void setup()
	{
		report=new ExtentReports(System.getProperty("user.dir")+"\\reports.html");
		test = report.startTest("Selenium Testing Result");
	 d=ChooseDriver.browser("chrome", "http://www.newtours.demoaut.com/");
	}
	@Test(priority=1)
	public void clickReg()
	{
		LoginPage lp = new LoginPage(d);
		lp.register();
		
	}
	@Test(priority=2)
	public void filldata()
	{
		System.out.println("this is new line");
		RegistrationPage rp = new RegistrationPage(d);
		rp.contactInformation("prem","kumar","987655","sdfndsf@gmail.com");
		rp.mailingInformation("mdu","madurai","TN","625009","ANGOLA");	
	}
	
	@AfterMethod
	public void endTest(ITestResult result) throws IOException
	{
		
		if(result.isSuccess())
		{
			
			test.log(LogStatus.PASS, "Test got passed successfully  " + result.getName());
		}
		else
		{
			File scrFile =((TakesScreenshot)d).getScreenshotAs(OutputType.FILE);
			File dest= new File("src/../screenshot/"+System.currentTimeMillis()+".png");
			String fpath =dest.getAbsolutePath();
			FileUtils.copyFile(scrFile, dest);
			test.log(LogStatus.FAIL, "Test got Failed "+result.getName()+ test.addScreenCapture(fpath));
			
		}
		report.endTest(test);
		report.flush();
	}
}

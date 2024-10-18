package tests;


import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pageClasses.HomePage;
import pageClasses.LoginPage;
import pageClasses.RegisterPage;
import pageClasses.RequestQuotationPage;
import utilities.BaseDriver;
import utilities.GenericMethods;


public class ValidateRegisterPage extends BaseDriver 
{
    GenericMethods g;
	
	RegisterPage r;
	
	LoginPage l;
	
	HomePage h;
	
	@BeforeTest
	
	public void beforeTest()
	{
		launchBrowser();
		
		navigateToURL("https://demo.guru99.com/insurance/v1/index.php");
	}
	
	
	@Test (enabled=false)
	
	public  void validateRegisterPage() throws Exception
	{
		g = new GenericMethods(driver);
		
		r = new RegisterPage(driver);
		
	    r.ValidateRegisterPage();
		
		Thread.sleep(3000);
		
	}
	
	@Test (priority = 1)
	public void validateLoginPage() throws Exception
	{
		g = new GenericMethods(driver);
		
		l= new LoginPage(driver);
		
		l.ValidateLoginPage();
		
		Thread.sleep(3000);
	}
	
    
	@Test (priority = 2)
	public void ValidateHomePage() throws Exception
	{
		g = new GenericMethods(driver);
		
		h= new HomePage(driver);
		
		h.ValidateLoginPage();
		
		Thread.sleep(3000);
	}
	
	@Test (priority = 3)
	public void ValidateRequestQuotationPage() throws Exception
	{
		g = new GenericMethods(driver);
		
		RequestQuotationPage r = new RequestQuotationPage(driver);
		
		r.ValidateRequestQuotationPage();
		
		Thread.sleep(3000);
	}
	
	
	
	@AfterTest
	
	public void afterTest()
	{
		closeBrowser();
	}


}

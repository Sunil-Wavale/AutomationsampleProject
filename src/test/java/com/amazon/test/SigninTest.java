package com.amazon.test;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.amazon.base.Baseclass;
import com.amazon.pages.HomePage;
import com.amazon.pages.SigninPage;

public class SigninTest extends Baseclass{
	
	
	SigninPage signinpage;
	
	HomePage homepage;
	public SigninTest() 
	{
		super();
	}
	
	
	@BeforeMethod()
	public void setup() throws InterruptedException
	{
		
		initialization();
		logger.info("Browser launched successfully");
		signinpage=new SigninPage();
		
	}
	
	@Test(priority=1)
	public void signinpagetitletest() 
	{
		String title=signinpage.validateTitle();
		Assert.assertEquals(title,"Amazon.com. Spend less. Smile more.");
		logger.info("Title validated successfully");
	}
	
	@Test(priority=2)
	public void logotest() 
	{
		boolean flag=signinpage.logo1();
		Assert.assertTrue(flag);
		logger.info("logo validated successfully");
	}
	
	@Test(priority=3)
	public void signintest() throws InterruptedException 
	{
		homepage=signinpage.signinmethod(prop.getProperty("username"),prop.getProperty("password"));
		logger.info("Sign  successfully");
	}
	@AfterMethod
	public void teardownmethod() 
	{
		driver.quit();
	}
	

}

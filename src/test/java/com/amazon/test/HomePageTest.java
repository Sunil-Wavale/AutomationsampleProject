package com.amazon.test;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.amazon.base.Baseclass;
import com.amazon.pages.HomePage;
import com.amazon.pages.MobilePage;
import com.amazon.pages.SigninPage;

public class HomePageTest extends Baseclass{
	SigninPage signinpage;
	HomePage homepage;
	MobilePage mobilepage;
	
	public HomePageTest()
	{
		super();
	}
	
	@BeforeMethod
	public void setup() throws InterruptedException 
	{
		initialization();
 	signinpage=new SigninPage();
		homepage=signinpage.signinmethod(prop.getProperty("username"),prop.getProperty("password"));
	}
//	@Test(priority=1)
	public void verifytiltle() 
	{
		String homepagetitletitle = homepage.VerifyHomepagetitle();
		Assert.assertEquals(homepagetitletitle, "amazon.com");
	}
//	@Test(priority=2)
	public void verifylogo() 
	{
		boolean result=homepage.verifyonhomepagelogo();
		Assert.assertTrue(result);
	}
//@Test
public void verifypages() throws InterruptedException 
{
	homepage=new HomePage();
	
	homepage.clickonall();
	Thread.sleep(2000);
	homepage.clickoncloseall();
	Thread.sleep(2000);
	homepage.clicktodaysdeal();
	Thread.sleep(2000);
	homepage.clickonbuyagain();
	Thread.sleep(2000);
	homepage.clickongiftcard();
	Thread.sleep(2000);
	homepage.clickonregistry();
	Thread.sleep(2000);
homepage.clickonsell();
Thread.sleep(2000);
homepage.clickoncustomerservice();
Thread.sleep(2000);
	}

@Test
public void mobileaddingtocart() 
{
	homepage.verifysearchbtn();
	logger.info("add");
	homepage.searchenter();
	

	
}


	@AfterMethod
	public void teardown() 
	{
		driver.quit();
	}
}

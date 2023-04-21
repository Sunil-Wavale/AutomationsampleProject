package com.amazon.test;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.amazon.base.Baseclass;
import com.amazon.pages.AddtocartPage;
import com.amazon.pages.HomePage;
import com.amazon.pages.MobilePage;
import com.amazon.pages.SigninPage;

public class MobilePageTest extends Baseclass {
	
	SigninPage signinpage;
	HomePage homepage;
	MobilePage mobilepage;
	AddtocartPage addtocartpage;
	
	public MobilePageTest() 
	{
		super();
	}
	
	@BeforeMethod
	public void setup() throws InterruptedException 
	{
		initialization();
 	signinpage=new SigninPage();
		homepage=signinpage.signinmethod(prop.getProperty("username"),prop.getProperty("password"));
		homepage.verifysearchbtn();
		mobilepage=homepage.searchenter();
		
		
	}

	
	@Test
	public void realmemobile() 
	{
		mobilepage.clickonrealme();
		addtocartpage.clickonaddrealmemobile();
	}
	
	
//	@AfterMethod
	public void teardown() 
	{
		driver.quit();
	}
}

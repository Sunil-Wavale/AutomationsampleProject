package com.amazon.test;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.amazon.base.Baseclass;
import com.amazon.pages.AddtocartPage;
import com.amazon.pages.HomePage;
import com.amazon.pages.MobilePage;
import com.amazon.pages.SigninPage;

public class RealmeMobilePageTest extends Baseclass {
	SigninPage signinpage;
	HomePage homepage;
	MobilePage mobilepage;
	AddtocartPage addtocartpage;
	
	public RealmeMobilePageTest() 
	{
		
	}
	
	
	@BeforeMethod
	public void setup() throws InterruptedException 
	{
		initialization();
 	signinpage=new SigninPage();
		homepage=signinpage.signinmethod(prop.getProperty("username"),prop.getProperty("password"));
		homepage.verifysearchbtn();
		mobilepage=homepage.searchenter();
		addtocartpage=mobilepage.clickonrealme();
	}

	@Test
	public void addingtocartclick() 
	{
		addtocartpage.clickonaddrealmemobile();
	}

}

package com.amazon.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.amazon.base.Baseclass;


public class SigninPage extends Baseclass {
	
	
 public SigninPage()
	{
		
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="(//a[@data-nav-role='signin'])[1]")
	@CacheLookup
	WebElement sign_in;
	
	@FindBy(xpath="//input[@type='email']")
	@CacheLookup
	WebElement email;
	
	@FindBy(xpath="//input[@id='continue']")
	@CacheLookup
	WebElement cntnuebtn;
	
	@FindBy(xpath="//input[@type='password']")
	@CacheLookup
	WebElement passwrd;
	
	@FindBy(xpath="//input[@id='signInSubmit']")
	@CacheLookup
	WebElement last_signclick;
	
	@FindBy(xpath="//a[@id='nav-logo-sprites']")
	WebElement logo;
	
	
	public String validateTitle() 
	{
		return driver.getTitle();
		
	}
	
	public boolean logo1() 
	{
		return logo.isDisplayed();
	} 
	public HomePage signinmethod(String un,String pw) throws InterruptedException {
		
		sign_in.click();
		Thread.sleep(2000);
		email.sendKeys(un);
		Thread.sleep(2000);
		cntnuebtn.click();
		Thread.sleep(2000);
		passwrd.sendKeys(pw);
		Thread.sleep(2000);
		last_signclick.click();
		Thread.sleep(2000);
		return new HomePage();
	}
	
}

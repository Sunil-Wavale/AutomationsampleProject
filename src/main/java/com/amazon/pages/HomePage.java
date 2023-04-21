package com.amazon.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.amazon.base.Baseclass;

public class HomePage extends Baseclass {
	
	public HomePage()
	{
		
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="(//span[text()='All'])[2]")
	WebElement all;
	
	@FindBy(xpath="//div[@class='nav-sprite hmenu-close-icon']")
	WebElement closeall;
	
	@FindBy(xpath="//a[contains(text(),'Today')]")
	WebElement todaysdeal;
	
	@FindBy(xpath="//a[contains(text(),'Buy Again')]")
	WebElement buyagain;
	
	@FindBy(xpath="//a[contains(text(),'Gift Cards')]")
	WebElement giftcard;
	
	@FindBy(xpath="//a[contains(text(),'Registry')]")
	WebElement registry;
	
	@FindBy(xpath="(//a[contains(text(),'Sell')])[1]")
	WebElement sell;
	
	@FindBy(xpath="(//a[contains(text(),'Customer Service')])[1]")
	WebElement customerservice;
	
	@FindBy(xpath="//h2[contains(text(),'Electronics')]")
	WebElement Electronics;
	
	@FindBy(xpath="(//input[@type='text'])[1]")
	WebElement searchbtn;
	@FindBy(xpath="(//input[@type='submit'])[1]")
	WebElement clickonsearchbtn;
	@FindBy(xpath="//a[@aria-label='Amazon']")
	WebElement onhomepagelogo;
	
	public String VerifyHomepagetitle() 
	{
		return driver.getTitle();
	}
	public boolean verifyonhomepagelogo() 
	{
		return onhomepagelogo.isDisplayed();
	}
	
	public void clickonall() 
	{
		all.click(); 
	} 
	public void clickoncloseall() 
	{
		closeall.click(); 
	} 
	
	public Todaysdeal clicktodaysdeal() 
	{
		todaysdeal.click();
		return new Todaysdeal();
	}
	
	public BuyAgain clickonbuyagain() 
	{
		buyagain.click();
		return new BuyAgain();
	}
	
	public Giftcard clickongiftcard() 
	{
		giftcard.click();
		return new Giftcard();
	}
	public Registry clickonregistry() 
	{
		registry.click();
		return new Registry();
	}
	public Sell clickonsell() 
	{
		sell.click();
		return new Sell();
	}
	
	public Customerservice clickoncustomerservice() 
	{
		customerservice.click();
		return new Customerservice();
	}
	
	public void verifysearchbtn() 
	{
		searchbtn.sendKeys("realme mobiles");
	}
	public MobilePage searchenter() 
	{
		clickonsearchbtn.click();
		return new MobilePage();
	}
	
	
	

}

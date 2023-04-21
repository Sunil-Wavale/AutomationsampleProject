package com.amazon.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.amazon.base.Baseclass;

public class MobilePage extends Baseclass {
	
	
	
	public MobilePage() 
	{
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath="(//span[@class='a-size-medium a-color-base a-text-normal'])[1]")
	WebElement realme;
	
	public AddtocartPage clickonrealme() 
	{
		realme.click();
		return new AddtocartPage();
	}
	@FindBy(xpath="(//input[@class='a-button-input'])[4]")
	WebElement addtocart;

	
	public AddtocartPage clickonaddrealmemobile() 
	{
		addtocart.click();
		return new AddtocartPage();
	}
}

package com.amazon.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.amazon.base.Baseclass;

public class AddtocartPage extends Baseclass {
	
	
	public AddtocartPage() 
	{
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="(//input[@class='a-button-input'])[4]")
	WebElement addtocart;

	
	public void clickonaddrealmemobile() 
	{
		addtocart.click();
	}
}

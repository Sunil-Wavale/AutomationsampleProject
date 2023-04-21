package com.amazon.base;

import java.io.FileInputStream;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Baseclass {
	
public static WebDriver driver;
public static Properties prop;
public Logger logger;

	
	public Baseclass()
	{
		try {
			prop=new Properties();
			FileInputStream ip=new FileInputStream("E:\\JAVA 2023\\AutomationDemo\\src\\main\\java\\com\\amazon\\config\\config.properties");
			prop.load(ip);
			
		}
		catch(Exception e) 
		{
			e.printStackTrace();
		}
		
	}
	
	public  void initialization()
	{
		String browserName=prop.getProperty("browser");
		if(browserName.equals("chrome")) 
		{
			ChromeOptions opt=new ChromeOptions();
			opt.addArguments("--remote-allow-origins=*");
			System.setProperty("webdriver.chrome.driver", "C:\\selenium files\\chromedriver.exe");
			 driver=new ChromeDriver(opt);
			driver.manage().window().maximize();
			logger=Logger.getLogger("amazonProject");
			PropertyConfigurator.configure("log4j.properties");
			
		}
		else if(browserName.equals("firefox")) 
		{
			System.setProperty("webdriver.gecko.driver", "C:\\selenium files\\geckodriver.exe");
			 driver=new FirefoxDriver();
			 driver.manage().window().maximize();
		}
		
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(10,TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		
		driver.get(prop.getProperty("url"));
		
		
	}
}

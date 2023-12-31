package com.GRID;


import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class OHRMApplicationLoginTest {

	//@Parameters("Browser")
	@Test
	public void loginTest(String browserName) throws MalformedURLException 
	{
		/*
		System.out.println("The Name of the Browser is:-"+browserName);
		
		//Described Capabilities is a class used to sent the information of the Browser
		//and the platform which should be considered for the Test Run -NODE Info i set
		
		DesiredCapabilities cap=null;
		if(browserName.equals("chrome"))
		{
			//NODE
			cap=DesiredCapabilities.chrome();
			cap.setBrowserName("chrome");
			cap.setPlatform(Platform.WINDOWS);
		}
		else
		{
			if(browserName.equals("edge"))
			{
				//NODE
				cap=DesiredCapabilities.edge();
				cap.setBrowserName("edge");
				cap.setPlatform(Platform.WINDOWS);
			}
			
			//Remote Webdriver-is use too set client convention between the HUB antee 
		 	RemoteWebDriver driver=new RemoteWebDriver(new URL("http://192.168.43.27:4444/wd/hub"),cap);
			
			String applicationurladdress=("http://127.0.0.1/orangehrm-4.2.0.1/symfony/web/index.php/auth/login");
		driver.get(applicationurladdress);
			
		}
		*/
		
		DesiredCapabilities cap = new DesiredCapabilities();
		cap.setBrowserName("chrome");
		cap.setPlatform(Platform.WINDOWS);
		
		ChromeOptions options=new ChromeOptions();
		options.merge(cap);
		
		String huburl ="http://192.168.43.27:4444/wd/hub";
		WebDriver driver= new RemoteWebDriver(new URL(huburl),options);
		
		driver.get("http://www.freecrm.com");
		System.out.println(driver.getTitle());
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
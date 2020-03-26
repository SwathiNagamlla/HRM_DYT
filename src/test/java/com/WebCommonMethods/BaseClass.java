package com.WebCommonMethods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class BaseClass
{
	public static WebDriver driver;
	
	/*
	 * Author:Deepthi
	 * Description:Invoking browsers as per user request
	 * Date:15/03/2020
	 * 
	 */
	
	public static void getBrowser(String browser)
	{
		if(browser.equalsIgnoreCase("Chrome"))
		{
				System.setProperty("webdriver.chrome.driver", "D:\\workspace\\HRM_DYT\\BrowserDrivers\\chromedriver.exe");
				driver = new ChromeDriver();
				driver.get("https://www.facebook.com");
				System.out.println("Chrome is launched successfully");
		}
				
		else
		{
				System.setProperty("webdriver.ie.driver", "D:\\workspace\\HRM_DYT\\BrowserDrivers\\IEDriverServer.exe");
				driver = new InternetExplorerDriver();
				driver.get("https://www.facebook.com");
				System.out.println("IE is launched successfully");
		}
			
				System.out.println("Browser is not defined");
	}
}

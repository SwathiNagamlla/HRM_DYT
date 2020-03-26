package com.TestRunner;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.Test;

public class Abhibus 
{
	public static WebDriver driver;
	@Test
	public static void abhibus()
	{
	System.setProperty("webdriver.ie.driver", "D:\\workspace\\HRM_DYT\\BrowserDrivers\\IEDriverServer.exe");
	driver = new InternetExplorerDriver();
	driver.get("https://www.abhibus.com");
	System.out.println("IE is launched successfully");
	}
}

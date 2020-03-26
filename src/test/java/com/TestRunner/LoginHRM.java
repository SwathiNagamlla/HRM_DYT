package com.TestRunner;

import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class LoginHRM 
{
  @Test
  public void f() 
  {
	  System.setProperty("webdriver.chrome.driver", "D:\\chromedriver_win32\\chromedriver.exe");  
	    WebDriver driver=new ChromeDriver();  
	       
	    driver.navigate().to("http://www.facebook.com/");  
	            
	    driver.findElement(By.id("email")).sendKeys("swathi@gmail.com");
	    driver.findElement(By.name("pass")).sendKeys("123456");
	            
	    driver.findElement(By.xpath("//input[@value='Log In']")).click(); 
  }
}

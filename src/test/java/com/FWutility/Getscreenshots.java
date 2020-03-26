package com.FWutility;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.io.FileHandler;

import com.WebCommonMethods.BaseClass;

public class Getscreenshots extends BaseClass
{
	public static String path;
	public static TakesScreenshot ts;
	public static File source;
	
	public static String Capturescreenshots(String name)
	{
		path=System.getProperty(("user.dir")+"\\Screenshots\\HRM_\\"+name+".png");
		ts=(TakesScreenshot)driver;
		source=(File) ts.getScreenshotAs(OutputType.FILE);
		try
		{
			FileHandler.copy(source, new File(path));
		}
		catch(IOException e)
		{
			System.out.println("Screen not captured");
		}
		return path;
	}

}

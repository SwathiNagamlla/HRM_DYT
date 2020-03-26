package com.TestRunner;

public class TestngExmplCls
{
	@org.testng.annotations.BeforeSuite
	public static void BeforeSuite()
	{
		System.out.println("BeforeSuite");
	}

	@org.testng.annotations.AfterSuite
	public static void AfterSuite()
	{
		System.out.println("AfterSuite");
	}
}

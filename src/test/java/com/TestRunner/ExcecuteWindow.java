package com.TestRunner;

import com.TestCasesImplementation.hrmLogin;
import com.WebCommonMethods.BaseClass;

public class ExcecuteWindow extends hrmLogin
{
	public static void main(String args[])
	{
		getBrowser("Chrome");
		login();
	}

}

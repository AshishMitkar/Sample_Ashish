package com.tests;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class login {
	
	@BeforeMethod
	public void add()
	{
		System.out.println("Add");
	}
	
	@Test(priority=1)
	public void sub()
	{
		System.out.println("sub");
	}

	@Test(priority=2)
	public void mul()
	{
		System.out.println("mul");
	}

	@AfterMethod
	public void div()
	{
		System.out.println("div");
	}


}

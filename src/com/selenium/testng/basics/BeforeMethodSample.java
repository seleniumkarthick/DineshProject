package com.selenium.testng.basics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.*;

public class BeforeMethodSample {

	WebDriver driver;
	

	@Test(description="to validate the home page",timeOut=1)
	public void TEST_01(){
		System.out.println("test1");
	}
	
	@Test
	public void TEST_02(){
		System.out.println("test2");
	}
	
	@AfterTest
	public void y(){
		System.out.println("after test");
	}
	
	@AfterMethod
	public void y1(){
		System.out.println("after method");
	}
	
	
	
	@BeforeMethod
	public void x1(){
		System.out.println("before method");
	}
	
	@BeforeTest
	public void x(){
		System.out.println("before test");
	}
	
}

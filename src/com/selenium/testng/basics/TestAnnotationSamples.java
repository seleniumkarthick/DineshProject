package com.selenium.testng.basics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.*;

public class TestAnnotationSamples {

	WebDriver driver;
	
	@BeforeTest
	public void x1(){
		System.setProperty("webdriver.gecko.driver", "E:\\software\\geckodriver.exe");
		driver=new FirefoxDriver();
		driver.get("http://localhost/product/");
	}
	
	@Test(description="to validate the home page",enabled=false)
	public void X(){
		System.out.println("1111111");
	}
	
	@Test(invocationCount=5)
	public void x(){
		Assert.assertEquals("Homefgfgfg", "Home");
	}
	
	@Test(dependsOnMethods="x",alwaysRun=true)
	public void x2(){
		Assert.assertEquals("Homefgfgfg", "Homefgfgfg");
	}
	
	
	@AfterTest
	public void y(){
		driver.quit();
	}
	
}

package com.selenium.testng.basics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.*;

public class AnnotationSample {

	WebDriver driver;
	
	@BeforeTest
	public void x(){
		System.setProperty("webdriver.gecko.driver", "E:\\software\\geckodriver.exe");
		driver=new FirefoxDriver();
		driver.get("http://localhost/product/");
	}
	
	@Test(description="to validate the home page",timeOut=1,groups="x")
	public void TEST_01(){
		String title=driver.getTitle();
		System.out.println("The title of site is "+title);
		Assert.assertEquals(title, "Homefgfgfg");
	}
	
	@Test(groups={"y","z"})
	public void TEST_02(){
		Assert.assertEquals("Homefgfgfg", "Homefgfgfg");
	}
	
	@Test(groups="x")
	public void TEST_03(){
		Assert.assertEquals("Homefgfgfg", "Homefgfgfg");
	}
	
	@AfterTest
	public void y(){
		driver.quit();
	}
	
}

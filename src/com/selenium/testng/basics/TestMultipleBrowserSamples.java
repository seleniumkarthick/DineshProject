package com.selenium.testng.basics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.*;

public class TestMultipleBrowserSamples {

	WebDriver driver;
	
	@Parameters("brows")
	@BeforeTest
	public void x1(String browser){
		
		if(browser.equals("firefox")){
			System.setProperty("webdriver.gecko.driver", "E:\\software\\geckodriver.exe");
			driver=new FirefoxDriver();
		}else if(browser.equals("chrome")){
			System.setProperty("webdriver.chrome.driver", "E:\\software\\chromedriver.exe");
			driver=new ChromeDriver();
		}else{
			
		}
		driver.get("http://localhost/product/");
	}
	
	@Test
	public void m1(){
		driver.get("http://localhost/product/");
		String title=driver.getTitle();
		System.out.println("The title of site is "+title);
		Assert.assertEquals(title, "Home");
	}
		
	@AfterTest
	public void y(){
		driver.quit();
	}
	
}

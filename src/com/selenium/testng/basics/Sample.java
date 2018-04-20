package com.selenium.testng.basics;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.*;

public class Sample {


	public static void main(String[] args) throws Exception {
		System.out.println("hai");
		System.setProperty("webdriver.gecko.driver", "E:\\software\\geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		
		driver.get("https://www.homedepot.com");
		//driver.findElement(By.linkText("Login")).click();
		/*WebElement link=driver.findElement(By.linkText("Login"));
		link.click();
		
		driver.findElement(By.name("email")).sendKeys("testing@gmail.com");
		driver.findElement(By.name("pass")).sendKeys("welcome");
		driver.findElement(By.name("submit")).submit();
		*/
		//Thread.sleep(5000);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//input[@id='headerSearch']")).sendKeys("testing");
		
	}
	

}

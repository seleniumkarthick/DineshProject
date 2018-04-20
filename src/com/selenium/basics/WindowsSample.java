package com.selenium.basics;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class WindowsSample {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.gecko.driver", "E:\\software\\geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.get("http://localhost/product/admin/login.php");
		
		driver.findElement(By.id("txtusername")).sendKeys("admin");
		driver.findElement(By.id("txtpassword")).sendKeys("admin");
		driver.findElement(By.id("submit")).click();
		
		driver.findElement(By.linkText("Registered Listings")).click();
		driver.findElement(By.linkText("karthick kumar")).click();
		
		
		// To handle window or new tab
		
		String parent=driver.getWindowHandle();
		System.out.println("==>"+parent);
		
		
		
		for (String handle : driver.getWindowHandles()) {
			
			System.out.println(handle);
			
		    driver.switchTo().window(handle);
		    
		}
		System.out.println(driver.getCurrentUrl());
		driver.close();
		
		driver.switchTo().window(parent);
		System.out.println(driver.getCurrentUrl());
		
		
	}
	
	
}

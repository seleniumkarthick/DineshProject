package com.selenium.basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FormValidation {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.gecko.driver", "E:\\software\\geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.get("http://localhost/product/");
		
		driver.findElement(By.linkText("Sign Up")).click();
		
		driver.findElement(By.id("name")).clear();
		driver.findElement(By.id("name")).sendKeys("testing");
		driver.findElement(By.id("email")).clear();
		driver.findElement(By.id("email")).sendKeys("testingtesting@gmail.com");
		driver.findElement(By.name("password")).clear();
		driver.findElement(By.name("password")).sendKeys("testing123");
		driver.findElement(By.name("mobile")).clear();
		driver.findElement(By.name("mobile")).sendKeys("9999999999");
		driver.findElement(By.name("submit")).click();
		
		String expectedText="Thanks for Registering. Use your Email id and password to Login and post your Deals!!";
		String actualText=driver.findElement(By.xpath("//div[@class='bill_row']/span[3]")).getText();
		if(expectedText.equals(actualText)){
			System.out.println("Test case 1: Pass");
		}else{
			System.out.println("Test case 1: Fail");
		}
		
	}
	
	
}

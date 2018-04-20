package com.selenium.basics;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FrameSample {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.gecko.driver", "E:\\software\\geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.get("https://www.w3schools.com/html/tryit.asp?filename=tryhtml_iframe_height_width");
		
		driver.switchTo().frame(driver.findElement(By.id("iframeResult")));
		
		driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@src='demo_iframe.htm']")));
		
		String actual=driver.findElement(By.xpath("//h1")).getText();
		String expected="This page is displayed in an iframe";
		
		if(actual.equals(expected)){
			System.out.println("pass");
		}else{
			System.out.println("Fail");
		}
		
		driver.switchTo().defaultContent();
		driver.switchTo().defaultContent();
		
		
		
	}
	
	
}

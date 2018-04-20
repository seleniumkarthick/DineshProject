package com.selenium.basics;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

public class RemoteWebdriverSample {

	public static void main(String[] args) throws Exception {
		
		System.setProperty("webdriver.gecko.driver", "E:\\software\\geckodriver.exe");
		
		WebDriver driver =  new RemoteWebDriver(
                 new URL("http://172.11.12.776:4444/wd/hub"), 
                 DesiredCapabilities.firefox());
		
		
		driver.get("http://localhost/product/admin/login.php");
		
		driver.findElement(By.name("submit")).click();
		
		Alert x=driver.switchTo().alert();
		
		String expected="Please enter admin Username.";
		String actual=x.getText();
		
		if(actual.equals(expected)){
			System.out.println("pass");
		}else{
			System.out.println("Fail");
		}
		
		x.accept();
		
		
		
	}
	
	
}

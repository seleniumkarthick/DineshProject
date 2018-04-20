package com.selenium.basics;

import org.apache.log4j.Logger;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class AlertSample {

	public static void main(String[] args) {
		
		 Logger log = Logger.getLogger("devpinoyLogger");
		
		System.setProperty("webdriver.gecko.driver", "E:\\software\\geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.get("http://localhost/product/admin/login.php");
		log.info("url loaded successfully");
		driver.findElement(By.name("submit")).click();
		log.info("Clicked");
		Alert x=driver.switchTo().alert();
		
		String expected="Please enter admin Usernamhghe.";
		String actual=x.getText();
		log.info("Alert handled");
		if(actual.equals(expected)){
			log.info("Alert handled pass");
			System.out.println("pass");
		}else{
			System.out.println("Fail");
			log.error("Alert handled failed");
		}
		
		x.accept();
		
		
		
	}
	
	
}

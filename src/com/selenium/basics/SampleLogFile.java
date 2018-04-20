package com.selenium.basics;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.apache.log4j.Logger;

public class SampleLogFile {

	static Logger logger=Logger.getLogger("SampleLogFile");
	
	
	public static void main(String[] args) {
		logger.info("**********************************************");
		System.setProperty("webdriver.gecko.driver", "E:\\software\\geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.get("http://localhost/product/admin/login.php");
		
		driver.findElement(By.name("submit")).click();
		
		Alert x=driver.switchTo().alert();
		
		String expected="Please enter admin Username.";
		String actual=x.getText();
		
		if(actual.equals(expected)){
			System.out.println("pass");
			logger.info("**********************************************");
		}else{
			System.out.println("Fail");
			//Log.warn("**********************************************");
			logger.error("error message");
		}
		
		x.accept();
		
		
		
		WebElement element = driver.findElement(By.name("source"));
		WebElement target = driver.findElement(By.name("target"));
		
		(new Actions(driver)).dragAndDrop(element, target).perform();
		
		
		(new Actions(driver)).doubleClick(element).build().perform();
		
		
	}
	
	
}

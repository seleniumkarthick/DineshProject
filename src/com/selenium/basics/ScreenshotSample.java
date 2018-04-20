package com.selenium.basics;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.Augmenter;
import org.apache.commons.io.FileUtils;

public class ScreenshotSample {

	public static void main(String[] args) throws Exception {
		
		System.setProperty("webdriver.gecko.driver", "E:\\software\\geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
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
		
		
		WebDriver augmentedDriver = new Augmenter().augment(driver);
        File screenshot = ((TakesScreenshot)augmentedDriver).
                            getScreenshotAs(OutputType.FILE);
        
        File DestFile=new File("E:\\software\\test.png");
        FileUtils.copyFile(screenshot, DestFile);

        
        File scrFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
        // Now you can do whatever you need to do with it, for example copy somewhere
        FileUtils.copyFile(scrFile, new File("c:\\tmp\\screenshot.png"));
        
        
		
		
		
	}
	
	
}

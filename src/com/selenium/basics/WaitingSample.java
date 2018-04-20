package com.selenium.basics;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WaitingSample {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.gecko.driver", "E:\\software\\geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		
		driver.get("http://localhost/product/");
		
		driver.findElement(By.linkText("Login")).click();
		//driver.findElement(By.id("email")).sendKeys("testing@gmail.com");
		
		WebElement emailValue=driver.findElement(By.id("email"));
		emailValue.clear();
		emailValue.sendKeys("testing@gmail.com");
		
		System.out.println(emailValue.getAttribute("value"));
		
		
		driver.findElement(By.id("pass")).sendKeys("welcome");
		driver.findElement(By.name("submit")).click();
		driver.findElement(By.linkText("Post Deals")).click();
		
		Select dropdown=new Select( driver.findElement(By.id("drop_1")));
		dropdown.selectByVisibleText("testing123");
		
		WebElement myDynamicElement = (new WebDriverWait(driver, 10))
				.until(ExpectedConditions.presenceOfElementLocated(By.id("tier_two")));
		
		Select dropdown1=new Select( driver.findElement(By.id("tier_two")));
		dropdown1.selectByVisibleText("hgh");
		
		driver.findElement(By.id("datepicker")).click();
		driver.findElement(By.linkText("27")).click();
		
		
	}
	
	
}

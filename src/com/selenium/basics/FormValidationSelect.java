package com.selenium.basics;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class FormValidationSelect {

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
		//dropdown.selectByVisibleText("ffffffffffffffffffffff");
		//dropdown.selectByValue("28");
		dropdown.selectByIndex(6);
		dropdown.getFirstSelectedOption();
		System.out.println(dropdown.getOptions().get(5));
		
		
		
		
		//file handling 
		driver.findElement(By.id("idImg")).sendKeys("E:\\SeleniumAutomation\\Taiwo\\locators.txt");
		
	}
	
	
}

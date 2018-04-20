package com.selenium.basics;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ListSample {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.gecko.driver", "E:\\software\\geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.get("http://localhost/product");
		
		int count=driver.findElements(By.xpath("//div[@class='moduletable_menu']/ul/li")).size();
		System.out.println(count);
		
		for(int i=1;i<=count;i++){
		
			String category=driver.findElement(By.xpath("//div[@class='moduletable_menu']/ul/li["+i+"]")).getText();
			System.out.println(category);
			
			if(category.equals("Footwears") && i==2){
				driver.findElement(By.xpath("//div[@class='moduletable_menu']/ul/li["+i+"]/a")).click();
				break;
			}
			
		}
			
		
		/*
		 
		 WebElement htmltable=driver.findElement(By.xpath("//*[@id='main']/table[1]/tbody"));
		 List<WebElement> rows=htmltable.findElements(By.tagName("tr"));

			for(int rnum=0;rnum<rows.size();rnum++)
			{
			List<WebElement> columns=rows.get(rnum).findElements(By.tagName("th"));
			System.out.println("Number of columns:"+columns.size());
			
			for(int cnum=0;cnum<columns.size();cnum++)
			{
			System.out.println(columns.get(cnum).getText());
			}
		} 
		 
		 
		 
		 */
		
		
		
	}
	
	
}

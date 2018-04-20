package com.selenium.basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class LinkValidation {

	public static void main(String[] args) {
		/*System.setProperty("webdriver.chrome.driver", "E:\\software\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();*/
		
		System.setProperty("webdriver.gecko.driver", "E:\\software\\geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.get("http://localhost/product/");
		String title=driver.getTitle();
		System.out.println("The title of site is "+title);
		
		if(title.equals("Home")){
			System.out.println("Test case 1: Pass");
		}else{
			System.out.println("Test case 1: Fail");
		}
		
		String expectedAboutUrl="http://localhost/product/aboutus.php";
		
		driver.findElement(By.linkText("About Us")).click();
		String actualAboutUsUrl=driver.getCurrentUrl();
		if(actualAboutUsUrl.equals(expectedAboutUrl)){
			System.out.println("Test case 2: Pass");
		}else{
			System.out.println("Test case 2: Fail");
		}
		
		//validate javascript 
		String expectedJSLink="js/jquery.svUltimateSlider.transitions.js";
		String actualJSLink=driver.getPageSource();
		
		if(actualJSLink.contains(expectedJSLink)){
			System.out.println("Test case 3: Pass");
		}else{
			System.out.println("Test case 3: Fail");
		}
		//*[@id="bottom_info"]/ul/li[1]/a
		String expectedFeedbackUrl="js/jquery.svUltimateSlider.transitions.js";
		driver.findElement(By.xpath("//div[@id='bottom_info']/ul/li/a")).click();
		String actualFeedbackUrl=driver.getCurrentUrl();
		if(actualFeedbackUrl.equals(expectedAboutUrl)){
			System.out.println("Test case 4: Pass");
		}else{
			System.out.println("Test case 4: Fail");
		}
		
		
		
	}
	
	
}

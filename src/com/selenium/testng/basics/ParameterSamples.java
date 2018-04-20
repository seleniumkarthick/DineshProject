package com.selenium.testng.basics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.*;

public class ParameterSamples {

	@Parameters("testing")
	@Test
	public void X(String x1){
		System.out.println("value : "+x1);
	}
	
	
	@Parameters({"testing","testing1"})
	@Test
	public void X(String x1,String x2){
		System.out.println("value : "+x1);
		System.out.println("value1 : "+x2);
	}
	
}

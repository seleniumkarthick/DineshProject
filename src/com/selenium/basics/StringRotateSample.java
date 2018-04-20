package com.selenium.basics;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class StringRotateSample {

	public static void main(String[] args) {
		String x,y;
		 for (int i = 5; i < 6; i++) {
			    //System.out.println(rotate("AppleMangoBanana", i));
			     x=rotate("AppleMangoBanana", i);
			     y=rotate(x, i);
			     System.out.println(x);
			     System.out.println(y);
			  }
		 
	}
	
	public static String rotate(String s, int offset) {
		  int i = offset % s.length();
		  //System.out.println(i);
		  return s.substring(i) + s.substring(0, 5);
		}
	
	
	
	
	
	
	
	
	
	
	
	
	
	/*
	
	
	Actual = AppleMangoBanana
	
	
	
	
			AppleMangoBannaaApple
	
	
	
	
	
	
	
	
	Expected = MangoBananaApple
	
	*/
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}

package com.java.basics;

import java.io.*;
import java.util.*;

public class PropertyFileSample {

	
	public void xxxxxxx() throws Exception{
		
		try {
			Properties prop = new Properties();
			prop.load(new FileInputStream("E:\\SeleniumAutomation\\feb_batch\\DineshProject\\src\\test.properties"));
			
			System.out.println(prop.get("fname"));
			System.out.println(prop.get("lname"));
			
		
		} catch (Exception e) {
			System.out.println("Exception: " + e);
		} finally {
			
		}
	}
	
	
	public static void main(String[] args) throws Exception {
		PropertyFileSample obj=new PropertyFileSample();
		obj.xxxxxxx();
	}
	
}

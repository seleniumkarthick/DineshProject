package com.java.basics;

import java.io.*;

public class FileConcept {

	public static void main(String[] args) throws Exception {
		FileInputStream in = null;
	      FileOutputStream out = null;

	      in = new FileInputStream("E:\\SeleniumAutomation\\feb_batch\\DineshProject\\src\\test.properties");
	         out = new FileOutputStream("E:\\SeleniumAutomation\\feb_batch\\DineshProject\\src\\test1.txt");
	         
	         int c;
	         while ((c = in.read()) != -1) {
	            out.write(c);
	         }
	      
	}
	
}

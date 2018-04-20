package com.java.basics;

public class SampleConstructor {

	/*
	 * 
	 * 1.classname and method name should be same
	 * 2.it doesnot have return type
	 * 3.no need to create object
	 * 4.it will run first
	 * 
	 */
	
	SampleConstructor(){
		System.out.println("111");
	}
	
	public void add(){
		System.out.println("add");
	}
	
	public static void main(String[] args) {
		SampleConstructor obj =new SampleConstructor();
		obj.add();
		
		
	}
	
	
}

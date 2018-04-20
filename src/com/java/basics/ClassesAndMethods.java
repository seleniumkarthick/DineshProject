package com.java.basics;

public class ClassesAndMethods {

	int x;
	
	/*
	 * 
	 * 1. method without arguments
	 * 2. method with arguments
	 * 3. method without return type
	 * 4. method with return type
	 */
	
	public void m1(){
		System.out.println("1111");
	}
	
	public static void m2(int x,int y){
		System.out.println("222");
	}
	
	public int m3(){
		int z=2+3;
		return z;
	}
	
	public static void main(String[] args) {
		ClassesAndMethods obj=new ClassesAndMethods();
		obj.m1();
		m2(10,20);
		System.out.println(obj.m3());
		
	}
	
	
	
	
}

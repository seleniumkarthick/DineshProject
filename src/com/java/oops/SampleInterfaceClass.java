package com.java.oops;

public class SampleInterfaceClass implements SampleInterface,SampleInterface1 {

	@Override
	public void m1() {
		// TODO Auto-generated method stub
		System.out.println("11111");
	}

	@Override
	public void m2() {
		// TODO Auto-generated method stub
		System.out.println("2222");
	}
	
	public static void main(String[] args) {
		SampleInterfaceClass obj=new SampleInterfaceClass();
		obj.m1();
	}

	@Override
	public void m3() {
		// TODO Auto-generated method stub
		
	}

}

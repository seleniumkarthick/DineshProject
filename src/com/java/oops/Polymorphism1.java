package com.java.oops;

public class Polymorphism1 extends Polymorphism2 {

	public void m1(){
		System.out.println("Poly1");
	}

	public void m1(int x){
		System.out.println("Poly2");
	}
	
	public void m1(boolean x){
		System.out.println("Poly3");
	}
	
	public void m1(int x,int y){
		System.out.println("Poly4");
	}

	public static void main(String[] args) {
		Polymorphism1 obj=new Polymorphism1();
		obj.m1();
		obj.m1(10);
		
		//overriding
		Polymorphism2 obj1=new Polymorphism2();
		obj1.m1();
		obj1.m1(20);
		
		Polymorphism2 obj2=new Polymorphism1();
		obj2.m1();
		obj2.m1(20);
		
	}
	
}

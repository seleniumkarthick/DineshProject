package com.java.basics;

import java.io.FileNotFoundException;

public class ExceptionHandling {
	
	public static void main(String[] args) {
		
		//System.out.println("111111111");
		//System.out.println("2222222");
		
/*		try{
			int x=10/0;
		}catch(Exception e){
			//System.out.println(e);
			e.printStackTrace();
		}
				
		System.out.println("333333");
		//System.out.println("hi"+x);
		
		
		try{
			int x1[]={10,20,30};
			System.out.println(x1[10]);
		}catch(ArithmeticException e1){
			e1.printStackTrace();
		}catch(ArrayIndexOutOfBoundsException e2){
			e2.printStackTrace();
		}catch(NumberFormatException e3){
			e3.printStackTrace();
		}catch(Exception e4){
			e4.printStackTrace();
		}
		*/
		
		
		/*try{
			int z=10/0;
			System.out.println("1111");
		}catch(Exception e){
			e.printStackTrace();
		}
		System.out.println("222222");*/
		try{
			int z=10/0;
		}catch(Exception e){
			e.printStackTrace();
		}finally{
			System.out.println("1111");
		}
		
		System.out.println("222222");
		
		
	}
	
}

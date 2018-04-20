package com.java.basics.collections;

public class SampleArray {

	public static void main(String[] args) {
		int x=10;
		System.out.println(x);
		
		int xx[]={10,20,30,40,10,20,30,40,10,20,30,40,10,20,30,40,10,20,30,40,10,20,30,40,10,20,30,40,10,20,30,40,10,20,30,40,10,20,30,40,
				10,20,30,40,10,20,30,40,10,20,30,
				40,10,20,30,40,10,20,30,40,10,
				20,30,40,10,20,30,40};
		/*System.out.println(xx[1]);
		
		for(int i=0;i<=3;i++){
			System.out.println(xx[i]);
		}
		
		for(int i=0;i<xx.length;i++){
			System.out.println(xx[i]);
		}*/
		
		for(int z:xx){
			System.out.println(z);
		}
		
		
		
	}
	
	
	
	
}

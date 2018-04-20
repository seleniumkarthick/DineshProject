package com.java.basics.collections;

import java.util.*;

public class SampleCollection {

	public static void main(String[] args) {
		/*
		 * ArrayList
		 * LinkedList
		 * Set
		 * Map
		 */
		
		List x=new ArrayList();
		x.add(10);
		x.add(20);
		x.add(30);
		x.add(40);
		x.add(50);
		x.remove(3);
		System.out.println(x);
		
		
		List x1=new LinkedList();
		x1.add(100);
		x1.add(200);
		x1.add(300);
		x1.add(400);
		x1.add(500);
		x1.remove(3);
		System.out.println(x1);
		
		
		Set x2=new HashSet();
		x2.add("zara");
		x2.add("zarae");
		x2.add("balu");
		x2.add(10);
		System.out.println(x2);
		
		Map m1 = new HashMap(); 
	      m1.put("Zara", "8");
	      m1.put("Mahnaz", "31");
	      System.out.println();
	      System.out.println(" Map Elements");
	      System.out.print("\t" + m1.get("Zara"));
	
		
		
	}
	
	
	
	
}

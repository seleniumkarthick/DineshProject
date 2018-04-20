package com.java.basics;

import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class IteratorSample {
	
	public static void main(String[] args) {
	
		
		 // ArrayList 
	      List a1 = new ArrayList();
	      a1.add("Zara");
	      a1.add("Zara1");
	      a1.add("Zara2");
	      
	      System.out.println(" ArrayList Elements");
	      System.out.print("\t" + a1);
	      
	      
	      Iterator itr = a1.iterator();
	      
	      /*System.out.println(itr.hasNext());
	      System.out.println(itr.next());
	      System.out.println(itr.next());
	      System.out.println(itr.next());
	      System.out.println(itr.next());
	      */
	      while(itr.hasNext()){
	    	  
	    	  System.out.println(itr.next());
	      }
	      
	      
	      
	      
	      
	      
	      
	      
	      
	      
	      
	      
	      
	      
	      
	      
	      /*while(itr.hasNext()) {
	          Object element = itr.next();
	          System.out.print(element + " ");
	       }*/
	      
	      
	
	}
	
}

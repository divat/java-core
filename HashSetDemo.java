package com.codemantra;

import java.util.HashSet;

//HashSet implements the Set interface. It doesn't maintain any order.
//Doesn't allow duplicates. If we try to add a duplicate element, the
//old value would be overwritten. It allows null element 
//It is non-synchronized. Itertor returned by this class is fail-fast
public class HashSetDemo {

	public static void main(String args[]) {
	      // HashSet declaration
	      HashSet<String> hset = 
	               new HashSet<String>();

	      // Adding elements to the HashSet
	      hset.add("Apple");
	      hset.add("Mango");
	      hset.add("Grapes");
	      hset.add("Orange");
	      hset.add("Fig");
	      //Addition of duplicate elements
	      hset.add("Apple");
	      hset.add("Mango");
	      //Addition of null values
	      hset.add(null);
	      hset.add(null);

	      //Displaying HashSet elements
	      System.out.println(hset);
	    }
}

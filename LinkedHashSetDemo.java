package com.codemantra;

import java.util.ArrayList;
import java.util.LinkedHashSet;

//LinkedHashSet is also similar like HashSet,TreeSet but it maintains the insertion order
//Elements get sorted in the same sequence in which they have been added to the set.
public class LinkedHashSetDemo {

	public static void main(String[] params){
		ArrayList<String> duplicateList = new ArrayList<String>();
	
		//Adding duplicate elements to the list
		duplicateList.add("diva");
		duplicateList.add("jahan");
		duplicateList.add("kavi");
		duplicateList.add("jahan");
		duplicateList.add("diva");
		
		System.out.println("Before removing the duplicate elements");
		System.out.println("ArrayList contains :: " +duplicateList);
		
		//Creating HashSet to remove the duplicates from list
		LinkedHashSet<String> lhs = new LinkedHashSet<String>();
		lhs.addAll(duplicateList);
		
		//Removing the duplicate list elements
		duplicateList.clear();
		
		//Adding LinkedHashSet elements to the arraylist
		duplicateList.addAll(lhs);
		
		System.out.println("After removing the duplicate elements");
		System.out.println("ArrayList contains :: " +duplicateList);
	}
}

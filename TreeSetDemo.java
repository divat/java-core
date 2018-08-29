package com.codemantra;

import java.util.TreeSet;

//TreeSet is similar to HashSet it implements the set interface.
//It sort the elements in ascending order and it allows null element.
//It is not synchronized.
public class TreeSetDemo {

	public static void main(String[] params){
		TreeSet<String> tset = new TreeSet<String>();
		
	   // Adding elements to TreeSet<String>
        tset.add("ABC");
        tset.add("String");
        tset.add("Test");
        tset.add("Pen");
        tset.add("Ink");
        tset.add("Jack");
        
        for(String s : tset){
        	System.out.println("Treeset elements :: " + s);
        }
	}
}

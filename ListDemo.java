package com.codemantra;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

//ArrayList is a resizable array implemenatation. It maintains the insertion order
//and does allow the duplicate elements. It permits all elements
public class ListDemo {

	public static void main(String[] params){
		List<String> list = addValuesInList();
		
		//Iterate list 
		for(String str : list){
			System.out.println("List values without sorting :: " +str);
		}
		
		//Sort arraylist
		Collections.sort(list);
		for(String str : list){
			System.out.println("List values after sorting :: " +str);
		}
		
		//Sort ArrayList in Descending order
		Collections.sort(list, Collections.reverseOrder());
		for(String str : list){
			System.out.println("List values after desc sorting :: " +str);
		}
		
		
		//Add elements to particular index
		list.add(0, "test");
		 System.out.println("Elements after adding string test:"+ list);
		
		//Sort the collections using custom objects with comparable
		List<Employee> elist = new ArrayList<Employee>();
		elist.add(new Employee("diva", 31, 60000));
		elist.add(new Employee("jahan", 32, 80000));
		elist.add(new Employee("kavi", 26, 100000));
		
		Collections.sort(elist);
		for(Employee e : elist){
			System.out.println("Comparable sorting by employee age :: " +e.getName()+ "-" + e.getAge());
		}
		
		//Sort the collections using custom objects with 
		//employee name comparator
		List<Employee> empList = new ArrayList<Employee>();
		empList.add(new Employee("diva", 31, 60000));
		empList.add(new Employee("jahan", 32, 80000));
		empList.add(new Employee("kavi", 26, 100000));
		empList.add(new Employee("dhivakar", 28, 150000));
		
		Collections.sort(empList, Employee.empComparator);
		for(Employee e : empList){
			System.out.println("Comparator sorting by employee name :: " +e.getName()+ "-" + e.getAge());
		}
		
		//Sort the collections using custom objects with 
		//employee salary comparator
		List<Employee> empSalList = new ArrayList<Employee>();
		empSalList.add(new Employee("diva", 31, 60000));
		empSalList.add(new Employee("jahan", 32, 110000));
		empSalList.add(new Employee("kavi", 26, 100000));
		empSalList.add(new Employee("dhivakar", 28, 150000));
				
		Collections.sort(empSalList, Employee.salaryComparator);
		for(Employee e : empSalList){
			System.out.println("Comparator sorting by employee salary :: " +e.getName()+ "-" + e.getAge());
		}
		
		//Compare two arraylist
		List<String> list1 = new ArrayList<String>();
		list1.add("sundaram");
		list1.add("diva");
		list1.add("jahan");
		ArrayList<String> compareList = new ArrayList<String>();
		for(String temp : list){
			compareList.add(list1.contains(temp) ? "Yes" : "No");
		}
		
		System.out.println(compareList);
	}
	
	public static List<String> addValuesInList(){
		List<String> list = new ArrayList<String>();
		list.add("kavi");
		list.add("test");
		list.add("sundaram");
		list.add("diva");
		list.add("jahan");
		return list;
	}
}

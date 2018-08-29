package com.codemantra;

import java.util.Comparator;

public class Employee implements Comparable<Employee>{

	private String name;
	private int age;
	private double salary;
	
	public Employee(){
		
	}
	
	public Employee(String name, int age, double salary){
		this.name = name;
		this.age = age;
		this.salary = salary;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	
	@Override
	public int compareTo(Employee o) {
		return (this.age - o.age);
	}
	
	//Applying the sorting logic for more than one employee object
	public static Comparator<Employee> empComparator = new Comparator<Employee>() {
		public int compare(Employee e1, Employee e2){
			//ascending order
			return e1.getName().compareTo(e2.getName());
			
			//descending order
		    //return e2.getName().compareTo(e1.getName());
		}
	};
	
	public static Comparator<Employee> salaryComparator = new Comparator<Employee>() {
		public int compare(Employee e1, Employee e2){
			int s1 = (int)e1.getSalary();
			int s2 = (int)e2.getSalary();
			//ascending order
			return s1-s2;
			
			//descending order
			//return s2-s1;
		}
	};
}

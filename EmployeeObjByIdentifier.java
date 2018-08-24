package com.codemantra;

import java.util.ArrayList;
import java.util.List;

class Employee {
	String name;
	int age;
	double salary;
	
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
	
}

public class EmployeeObjByIdentifier {

	private static List<Employee> eList;
	static{
		eList = populateEmployee();
	}
	
	public static void main(String[] args){
		eList = employeeList(eList, "salary");
		for(Employee e : eList){
			System.out.println(e.getSalary());
		}
	}
	
	public static List<Employee> employeeList(List<Employee> list, String identifier){
		
		List<Employee> eList = new ArrayList<Employee>();
		List<String> nameList = new ArrayList<String>();
		
		Employee e = null;
		if(identifier.equals("name")){
			
			for(Employee ename : list){
				e = new Employee();
				e.setName(ename.getName());
				eList.add(e);
			}
		}else if(identifier.equals("age")){
			for(Employee ename : list){
				e = new Employee();
				e.setAge(ename.getAge());
				eList.add(e);
			}
		}else{
			for(Employee ename : list){
				e = new Employee();
				e.setSalary(ename.getSalary());
				eList.add(e);
			}
		}
		return eList;
	}
	
	public static List<String> names(ArrayList<Employee> list){
		List<String> nameList = new ArrayList<String>();
		for(Employee ename : list){
			nameList.add(ename.getName());
		}
		return nameList;
	}
	
	private static List<Employee> populateEmployee(){
		List<Employee> eList = new ArrayList<Employee>();
		eList.add(new Employee("diva", 31, 45000));
		eList.add(new Employee("jahan", 32, 50000));
		return eList;
	}
}

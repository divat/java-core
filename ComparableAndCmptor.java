package com.codemantra;

import java.util.Arrays;
import java.util.Comparator;

class Employee implements Comparable<Employee>{
	private int id;
	private String name;
	private int age;
	private long salary;
	public Employee(int i, String string, int j, int k) {
		this.id = i;
		this.name = string;
		this.age = j;
		this.salary = k;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
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
	public long getSalary() {
		return salary;
	}
	public void setSalary(long salary) {
		this.salary = salary;
	}
	@Override
	public int compareTo(Employee o) {
		return (this.id - o.id);
	}
	
	@Override
    //this is required to print the user friendly information about the Employee
    public String toString() {
        return "[id=" + this.id + ", name=" + this.name + ", age=" + this.age + ", salary=" +
                this.salary + "]";
    }
	
	public static Comparator<Employee> salaryComparator = new Comparator<Employee>() {

		@Override
		public int compare(Employee o1, Employee o2) {
			return (int) (o1.getSalary() - o2.getSalary());
		}
		
	};
	
}

public class ComparableAndCmptor {

	public static void main(String[] args) {
		Employee[] empArr = new Employee[4];
		empArr[0] = new Employee(10, "Mikey", 25, 10000);
		empArr[1] = new Employee(20, "Arun", 29, 20000);
		empArr[2] = new Employee(5, "Lisa", 35, 5000);
		empArr[3] = new Employee(1, "Pankaj", 32, 50000);
		
		Arrays.sort(empArr);
		System.out.println("Default Sorting of Employees list:\n"+Arrays.toString(empArr));
	}

}

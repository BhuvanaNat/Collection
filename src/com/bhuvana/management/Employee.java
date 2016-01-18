package com.bhuvana.management;

public class Employee implements Comparable<Employee>{
	private String name;
	private int age;
	private String department;
	
	public Employee(String name, int age, String department){
		this.name = name;
		this.age = age;
		this.department = department;
	}

	public int compareTo(Employee emp) {
		if(this.age > emp.age)
			return -1;
		else if(this.age < emp.age)
			return 1;
		else
			return 0;		
	}
	
	public String toString() {
		return "name=" + name + ", age=" + age + ", department="
				+ department;		
	}
	
	public String getDepartment() {
		return department;
	}
	
	public int getAge(){
		return age;
	}
	
	public String getName(){
		return name;
	}
}
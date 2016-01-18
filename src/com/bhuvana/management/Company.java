package com.bhuvana.management;

import java.util.ArrayList;

public class Company {
	
	private ArrayList<Department> department; 
	
	public Company(){
		department = new ArrayList<Department>();		
	}
	
	public ArrayList<Department> getDepartment(){
		return department;
	}
	
	public void addDepartment(Department d){
		department.add(d);
	}
	
	public static void main(String[] args) {
		Company comp = new Company();
		
		Department accounting = new Department();
		Department marketing = new Department();
		Department hr = new Department();
		Department info = new Department();	
		
		comp.addDepartment(accounting);
		comp.addDepartment(marketing);
		comp.addDepartment(hr);
		comp.addDepartment(info);
		
		
		Employee countGuru = new Employee("Counting Guru", 55, "Accounting");
		Employee countPro = new Employee("Counting Pro", 45, "Accounting");
		Employee countSavvy = new Employee("Counting Savvy", 40, "Accounting");
		Employee countNovice = new Employee("Counting Novice", 25, "Accounting");		
		Employee salesGuru = new Employee("Sales Guru", 50, "Marketing");
		Employee salesPro = new Employee("Sales Pro", 48, "Marketing");
		Employee salesSavvy = new Employee("Sales Savvy", 38, "Marketing");
		Employee hireGuru = new Employee("Hiring Guru", 58, "Human Resources");
		Employee hirePro = new Employee("Hiring Pro", 47, "Human Resources");
		Employee hackPro = new Employee("Hacking Pro", 46, "Information Systems" );
		Employee hackGuru = new Employee("Hacking Guru", 51, "Information Systems" );
		Employee hackSavvy = new Employee("Counting Guru", 38, "Information Systems" );
		Employee hackNovice = new Employee("Counting Guru", 23, "Information Systems" );
		
		
		accounting.addEmployee(countGuru);
		accounting.addEmployee(countPro);
		accounting.addEmployee(countSavvy);
		accounting.addEmployee(countNovice);
		marketing.addEmployee(salesGuru);		
		marketing.addEmployee(salesPro);
		marketing.addEmployee(salesSavvy);		
		hr.addEmployee(hireGuru);
		hr.addEmployee(hirePro);				
		info.addEmployee(hackPro);
		info.addEmployee(hackGuru);
		info.addEmployee(hackSavvy);
		info.addEmployee(hackNovice);
		
		System.out.printf("%-20s %-20s %-4s","Department","Name","Age");
		System.out.println();
		
		ArrayList<Department> depart=comp.getDepartment();
		
		for(Department dept: depart){
			for(Employee emp: dept.getEmployees() ){
			
				System.out.printf("%-20s %-20s %-4d",emp.getDepartment(),emp.getName(),emp.getAge());
				System.out.println();
			}
			
		}		
	}	
}
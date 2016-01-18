package com.bhuvana.management;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Department {
	private List<Employee> employees;

	public Department() {
		employees = new ArrayList<Employee>();
	}

	
	//getEmployee method returns a sorted list of Employees based on the age
	public ArrayList<Employee> getEmployees() {
		ArrayList<Employee> sortedEmployee = new ArrayList<Employee>(employees.size());
		// creating a copy of the list of employees

		for(Employee e : employees) {
			Employee employee = e;
			sortedEmployee.add(employee);
		}
		Collections.sort(sortedEmployee);
		return sortedEmployee;
	}

	public void addEmployee(Employee e) {
		String deptName = e.getDepartment();
		if (deptName.equals("Accounting") || deptName.equals("Marketing")
				|| deptName.equals("Human Resources")
				|| deptName.equals("Information Systems"))
			employees.add(e);
		else
			System.out.println("Department "+deptName+ " not found.");
	}
	
	public String toString() {
		return "Department [employees=" + employees + "]";
	}

}

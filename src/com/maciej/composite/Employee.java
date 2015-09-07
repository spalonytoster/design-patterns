package com.maciej.composite;

import java.util.ArrayList;
import java.util.List;

public class Employee {
	
	private String name;
	private String department;
	private int salary;
	private List<Employee> subordinates;
	
	public Employee(String name, String department, int salary) {
		
		this.name = name;
		this.department = department;
		this.salary = salary;
		subordinates = new ArrayList<Employee>();
	}
	
	public void add(Employee employee) {
		
		subordinates.add(employee);
	}
	
	public void remove(Employee employee) {
		
		subordinates.remove(employee);
	}
	
	public List<Employee> getSubordinates() {
		
		return subordinates;
	}
	
	public String toString() {
		
		return name + " --- " + department + " --- " + salary;
	}

}

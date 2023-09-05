package com.demo.collections.list;

import java.util.Objects;

public class Employee {
	private int empId;
	private String name;
	private String location;
	private double salary;

	public Employee() {

	}

	public Employee(int empId, String name, String location, double salary) {
		this.empId = empId;
		this.name = name;
		this.location = location;
		this.salary = salary;
	}

	public int getEmpId() {
		return empId;
	}

	public void setEmpId(int empId) {
		this.empId = empId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "{"+empId+" "+name+"}";
	}

	@Override
	public int hashCode() {
		System.out.println("hashcode called..");
		return Objects.hash(empId);
	}

	@Override
	public boolean equals(Object obj) {
		System.out.println("equals() called..");
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Employee other = (Employee) obj;
		return empId == other.empId;
	}
	
	
	
}

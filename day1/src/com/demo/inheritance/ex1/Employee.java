package com.demo.inheritance.ex1;

public class Employee extends Person {

	private double salary;

	public Employee(int id, String name, double salary) {
		super(id, name);
		this.salary = salary;

	}

	@Override
	public String printDetails() {
		return super.printDetails() + " " + this.salary;
	}

}

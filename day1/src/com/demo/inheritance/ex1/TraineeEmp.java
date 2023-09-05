package com.demo.inheritance.ex1;

public class TraineeEmp extends Employee {
	private String performance;

	public TraineeEmp(int id, String name, double salary, String performance) {
		super(id, name, salary);
		this.performance = performance;

	}

	@Override
	public String printDetails() {
		return super.printDetails()+" "+this.performance;
	}

}

package com.demo.inheritance.ex1;

public class Person {
	private int id;
	private String name;
	

	public Person(int id, String name) {
		this.id = id;
		this.name = name;
	}



	public String printDetails() {
		return id + " " + name;
	}

}

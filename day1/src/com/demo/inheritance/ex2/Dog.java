package com.demo.inheritance.ex2;

public class Dog extends Animal{

	public Dog(String name) {
		super(name);
	}

	@Override
	public void speak() {
		System.out.println(name+" "+"barks");
		
	}
}

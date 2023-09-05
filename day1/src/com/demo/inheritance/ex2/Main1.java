package com.demo.inheritance.ex2;

public class Main1 {

	public static void main(String[] args) {
		Animal animal = null;

		animal = new Dog("Spike");

		animal.speak();

		animal = new Cat("Tom");

		animal.speak();

	}

}

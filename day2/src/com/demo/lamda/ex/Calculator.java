package com.demo.lamda.ex;

public class Calculator {

	public static void main(String[] args) {

		// logic for add, subtract, multiply and divide

		Math add = (a, b) -> a + b;
		Math subtract = (a, b) -> a - b;
		Math multiply = (a, b) -> a * b;
		Math divide = (a, b) -> a / b;
		
		System.out.println(add.doMath(3,9));
	}
}

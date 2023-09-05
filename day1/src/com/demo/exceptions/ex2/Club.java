package com.demo.exceptions.ex2;

public class Club {

	public static void main(String[] args) {
		AgeValidator validator = new AgeValidator();
		//try {
			String message = validator.validateAge(10);
			/*
			 * } catch (Exception e) { //System.out.println(e); e.printStackTrace(); }
			 */
		System.out.println("This is ABC Club");

	}

}

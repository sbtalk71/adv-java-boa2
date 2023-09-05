package com.demo.exceptions.ex2;

public class AgeValidator {

	public String validateAge(int age) {
		String message = "";
		try {
			if (age < 18 || age > 60) {
				throw new AgeNotAllowedException("Age not permitted..");
			} else {
				message = "Welcome to the club";
			}

		} catch (AgeNotAllowedException e) {
			System.out.println("We got situation here..");
			throw new RuntimeException(e);
		}

		return message;
	}
}

package com.demo.exceptions.ex2;

public class AgeNotAllowedException extends Exception {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public AgeNotAllowedException() {

	}

	public AgeNotAllowedException(String message) {
		super(message);
	}

	@Override
	public String toString() {
		
		return this.getClass().getName()+" : "+"Your age is not valid";
	}
}

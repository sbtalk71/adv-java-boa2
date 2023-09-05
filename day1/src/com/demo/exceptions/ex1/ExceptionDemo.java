package com.demo.exceptions.ex1;

public class ExceptionDemo {

	public static void main(String[] args) {

		try {
			int a = 10;
			int b = 20;
			double result = a / b;

			String[] names = new String[5];
			String[] names1 = { "a", "b", "c" };
			 names[2].length();

			// String s=names1[3];

			//int x = Integer.parseInt("hello");

			System.out.println("No Exceptions...");
		} catch (ArithmeticException | NullPointerException ex) { // print(String s){}
			System.out.println(ex);
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println(e.getMessage());
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			System.out.println("finally block executes...");
		}
		System.out.println("Normal execution flow resumed...");

	}

}

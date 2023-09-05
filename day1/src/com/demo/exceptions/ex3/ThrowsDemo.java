package com.demo.exceptions.ex3;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class ThrowsDemo {

	public static void main(String[] args) {
		/*
		 * FileInputStream fos = null; try { fos = new FileInputStream("abc.txt");
		 * 
		 * } catch (FileNotFoundException e) { e.printStackTrace(); } finally { try {
		 * fos.close(); } catch (IOException e) { e.printStackTrace(); } }
		 * System.out.println("all done");
		 */

		// try with resource

		try (FileInputStream fis = new FileInputStream("abc.txt");) {

		} catch (FileNotFoundException e) {
			e.printStackTrace();

		} catch (IOException e) {
			e.printStackTrace();
		}
		System.out.println("all done");

	}

}

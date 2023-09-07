package com.demo.io.serialization.ex1;

import java.io.EOFException;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class EmployeeDeSerializer2 {

	public static void main(String[] args) {

		try (FileInputStream fis = new FileInputStream("employees2.ser");
				ObjectInputStream ois = new ObjectInputStream(fis);) {

			while (true) {
				Object obj = ois.readObject();
				Employee emp = (Employee) obj;

				System.out.println(emp);
			}

		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (EOFException e) {
			System.out.println("Objects DeSerialized successfully");
			//e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}

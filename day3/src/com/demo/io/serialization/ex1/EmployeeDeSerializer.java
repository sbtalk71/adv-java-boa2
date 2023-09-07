package com.demo.io.serialization.ex1;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class EmployeeDeSerializer {

	public static void main(String[] args) {

		try (FileInputStream fis = new FileInputStream("employees.ser");
				ObjectInputStream ois = new ObjectInputStream(fis);) {
			
			Object obj=ois.readObject();
			Employee emp=(Employee)obj;
			
			System.out.println(emp);
			System.out.println("Object DeSerialized successfully");

		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}

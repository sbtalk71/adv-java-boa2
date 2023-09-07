package com.demo.io.serialization.ex1;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class EmployeeSerializer {

	public static void main(String[] args) {

		try (FileOutputStream fos = new FileOutputStream("employees.ser");
				ObjectOutputStream oos = new ObjectOutputStream(fos);
			) 
		{
			Employee emp = new Employee(100, "James", "Bangalore", 590000);
			oos.writeObject(emp);
			System.out.println("Object Serialized successfully");
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}

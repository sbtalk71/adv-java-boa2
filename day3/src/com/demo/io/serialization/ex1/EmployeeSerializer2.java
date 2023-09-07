package com.demo.io.serialization.ex1;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class EmployeeSerializer2 {

	public static void main(String[] args) {

		try (FileOutputStream fos = new FileOutputStream("employees2.ser");
				ObjectOutputStream oos = new ObjectOutputStream(fos);
			) 
		{
			Employee emp = new Employee(100, "James", "Bangalore", 590000);
			Employee emp1 = new Employee(101, "Mary", "Hyderabad", 590000);
			Employee emp2 = new Employee(102, "Luke", "Bangalore", 590000);
			Employee emp3 = new Employee(103, "Kiaan", "Bangalore", 590000);
			
			oos.writeObject(emp);
			oos.writeObject(emp1);
			oos.writeObject(emp2);
			oos.writeObject(emp3);
			
			System.out.println("Object Serialized successfully");
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}

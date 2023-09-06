package com.demo.streams.ex2;

import java.util.Arrays;
import java.util.List;

public class StreamsWithObjectsDemo {

	public static void main(String[] args) {
		List<Employee> empList=Arrays.asList(

				new Employee(100, "Ranganathan", "Chennai", 56000),
				new Employee(101, "Pavan", "Hyderabad", 76000),
				new Employee(102, "Raja", "Chennai", 78000),
				new Employee(103, "Shivaraj", "Bangalore", 35000),
				new Employee(104, "Arjuna", "Bangalore", 530000),
				new Employee(105, "Karan", "Hyderabad", 430000),
				new Employee(106, "Jeevan", "Chennai", 98000),
				new Employee(107, "Shambhu", "Hyderabad", 46000),
				new Employee(108, "Rahguram", "Chennai", 36000),
				new Employee(109, "Charan", "Hyderabad", 86000)
				
				);

		//List all the employees from Hyderabad
		//List all the employees where salary is less than 50000
		//add 10000 bonus to all the employees who has salary less than 40000
		//calculate the sum of salary of all the employees
		//sort the employees based on their name
		//find the employee with max salary and change its location to Gurugram
		
		Employee emp=empList.stream().max((e1,e2)->Double.compare(e1.getSalary(),e2.getSalary())).get();
		emp.setLocation("Gurugram");
		empList.stream().forEach(System.out::println);
		
	}

}

package com.demo.collections.list;

import java.util.HashSet;
import java.util.Set;

public class EmpSetApp {

	public static void main(String[] args) {
		Set<Employee> empSet=new HashSet<Employee>();
		empSet.add(new Employee(100, "james", "bangaore", 45000));
		empSet.add(new Employee(101, "karan", "gurugram", 85000));
		empSet.add(new Employee(100, "nitin", "hyderabad", 55000));
		empSet.add(new Employee(102, "pavan", "bangaore", 45000));
		empSet.add(new Employee(103, "Raja", "Hyderabad", 55000));
		System.out.println(empSet);

	}

}

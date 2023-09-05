package com.demo.inheritance.ex1;

public class Main1 {

	public static void main(String[] args) {
		Employee e= new Employee(100, "Karan", 69000);
		
		System.out.println(e.printDetails());
		
		TraineeEmp te= new TraineeEmp(102, "Pavan",45000, "good");
		
		System.out.println(te.printDetails());
		
		
		Person p= e;
		
		System.out.println(p.printDetails());
		
		p=te;
		
		System.out.println(p.printDetails());
		
		
		
		EmpInfo empInfo=new EmpInfo();
		empInfo.getInfo(e);
		
		empInfo.getInfo(te);
		

	}

}

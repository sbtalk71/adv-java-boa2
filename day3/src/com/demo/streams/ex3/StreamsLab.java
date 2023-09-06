package com.demo.streams.ex3;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class StreamsLab {

	public static void main(String[] args) {
		
		Student st1=
				new Student(100,"Karan",new Address("500059","Hyderabad"),Arrays.asList(new MobileNumber("234566"),new MobileNumber("565656")));
		Student st2=
				new Student(101,"Puja",new Address("500079","Hyderabad"),Arrays.asList(new MobileNumber("787898"),new MobileNumber("908990")));
		Student st3=
				new Student(102,"Nirav",new Address("500097","Hyderabad"),Arrays.asList(new MobileNumber("123321"),new MobileNumber("989876")));
		Student st4=
				new Student(103,"Lekha",new Address("500079","Hyderabad"),Arrays.asList(new MobileNumber("222333"),new MobileNumber("445544")));

		List<Student> studentsList=Arrays.asList(st1,st2,st3,st4);
		//Find the first student whose name matches "Puja", if not found then print "not found"
		
		Optional<Student> student=studentsList.stream().filter(st->st.getName().equals("Puja")).findFirst();
		System.out.println(student.isPresent()?student.get().getName():"Not Found");
		
		//List all the students with pincode 500079
		//find the student whose mobile number is 123321
		
		Optional<Student> st5=studentsList.stream().filter(st->st.getMobileNumbers().stream().anyMatch(n->n.getNumber().equals("123321"))).findFirst();
		
		System.out.println(st5.isPresent()?st5.get().getName():"No Student found");
		
		
	}

}

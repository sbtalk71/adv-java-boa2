package com.demo.streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamsDemo3 {

	public static void main(String[] args) {
	List<String> namesList=Arrays.asList("shantanu","pavan","Ranganathan","dharam","srinivas","piku","tiku","pinki");
	
	//List all the names having length more than 10 chars
	namesList.stream().filter(name->name.length()>10).forEach(System.out::println);
	
	//find the word which has maximum length
	System.out.println(namesList.stream().max((s1,s2)->s2.compareTo(s1)).get());
	
	System.out.println(namesList.stream().max((s1,s2)->Integer.compare(s1.length(),s2.length())).get());
	
	//select all the names containing 'a' and collect them in another list
	namesList.stream().filter(name->name.contains("a")).collect(Collectors.toList()).forEach(System.out::println);
	//find the last entry "pinki" from the list
	System.out.println(namesList.stream().reduce((first,second)->second).get());

	}

}

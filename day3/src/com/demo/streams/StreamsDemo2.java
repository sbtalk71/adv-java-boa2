package com.demo.streams;

import java.util.Arrays;
import java.util.List;

public class StreamsDemo2 {

	public static void main(String[] args) {
		
		List<Integer> intList=Arrays.asList(1,3,5,6,4,7,8,2,34,67,98,24);
		
		
		intList.stream().forEach(a->System.out.println(a));
		
		//Method Reference
		intList.stream().forEach(System.out::println);
		
		intList.stream().filter(x->x%2==0).forEach(System.out::println);
		
		//find all odd numbers and count them
		Long intCount=intList.stream().filter(x->x%2!=0).count();
		System.out.println("Count ="+intCount);
		
		//find all odd numbers and add 2 to each number and then add all, print the sum
		int sum=intList.stream().filter(x->x%2!=0).mapToInt(x->x.intValue()).map(x->x+2).sum();
		System.out.println("Sum = "+sum);
		
		//find the largest even number and odd number
		System.out.println("Max Value = "+intList.stream().max((x,y)->x.compareTo(y)).get());
		
		//first and last element
		System.out.println(intList.stream().findFirst().get());
		
		System.out.println(intList.stream().map(x->x).reduce(10,(first, second)->first+second));
		
		System.out.println(intList.stream().mapToInt(x->x.intValue()).reduce((first, second)->second).getAsInt());
		
		
		
		
		

	}

}

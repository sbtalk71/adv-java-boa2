package com.demo.lamda.ex;

import java.util.function.BiFunction;
import java.util.function.Consumer;
import java.util.function.IntPredicate;
import java.util.function.Supplier;

public class FunctionalIntrefacesDemo {

	public static void main(String[] args) {
		
		int[] nums= {1,3,4,6,7,9,8,54,32,45,34,90};
		
		IntPredicate p= value->  value%2==0;
		
		//EvenChecker p= new EvenChecker();
		for(int i=0;i<nums.length;i++) {
			
			if(p.test(nums[i])) {
				System.out.println(nums[i]+" is Even");
			}
		}

		
		//implement BiFunction using lambda to add any 2 integers
		BiFunction<Integer, Integer, Integer> adder= (a,b)->a+b;
		
		BiFunction<Integer, Integer, String> adder2=(a,b)-> ""+(a+b);
		
		System.out.println(adder2.apply(4, 5));
		
		Supplier<String> message=()->"Hello World";
		
		System.out.println(message.get());
		
		Consumer<String> printer=(s)->System.out.println(s);
		
		printer.accept("Hi There");
		
		
		
		
		
	}

}

class EvenChecker implements IntPredicate{

	@Override
	public boolean test(int value) {
		
		return value%2==0;
	}
	
}

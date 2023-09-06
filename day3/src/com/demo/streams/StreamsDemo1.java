package com.demo.streams;

import java.util.function.Consumer;
import java.util.stream.Stream;

public class StreamsDemo1 {

	public static void main(String[] args) {
		
		Stream<Integer> intStream=Stream.of(1,3,5,6,4,7,8,2,34,67,98,24);
		
		//System.out.println(intStream.getClass().getName());
		
		;
		
		//intStream.forEach(a->System.out.println(a));
		
		//Method Reference
		intStream.forEach(System.out::println);
		

	}

}

class MyDataPrinter implements Consumer<Integer>{

	@Override
	public void accept(Integer t) {
		System.out.println(t);
		
	}
	
}
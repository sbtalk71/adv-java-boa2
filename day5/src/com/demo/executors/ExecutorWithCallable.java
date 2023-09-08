package com.demo.executors;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class ExecutorWithCallable {

	public static void main(String[] args) throws Exception{
		// ExecutorService ex = Executors.newSingleThreadExecutor();
		// ExecutorService ex = Executors.newFixedThreadPool(5);
		ExecutorService ex = Executors.newCachedThreadPool();

		Future<String> futureResult=ex.submit(new UppercaseWithCallable("shantanu"));
		System.out.println(" call made async way....");
		
		System.out.println(futureResult.get());
		while(!futureResult.isDone()) {
			System.out.println("Waiting for the result.....");
			Thread.sleep(2000);
		}
		
		System.out.println(futureResult.get());
		ex.shutdown();
		

	}

}

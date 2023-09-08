package com.demo.executors;

import java.util.concurrent.Callable;

public class UppercaseWithCallable implements Callable<String> {

	private String name;

	public UppercaseWithCallable(String name) {
		this.name = name;
	}

	@Override
	public String call() {
		String message = "";
		try {
			Thread.sleep(10000);
			message=name.toUpperCase();
			System.out.println(Thread.currentThread().getName() + " : " +message );

		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		return message;
	}

}

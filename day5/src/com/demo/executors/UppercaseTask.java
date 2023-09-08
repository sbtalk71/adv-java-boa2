package com.demo.executors;

public class UppercaseTask implements Runnable {

	private String name;

	public UppercaseTask(String name) {
		this.name = name;
	}

	@Override
	public void run() {

		try {
			Thread.sleep(2000);
			System.out.println(Thread.currentThread().getName()+" : "+name.toUpperCase());
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

}

package com.demo.threads.basic;

public class MyWorker implements Runnable {
	
	@Override
	public void run() {
		System.out.println(Thread.currentThread().getName()+" starts");
		String threadName=Thread.currentThread().getName();
		try {
			for (int i = 0; i < 15; i++) {

				System.out.println(threadName+" Executing loop no " + i);
				Thread.sleep(2000); //TIMED_WAITING
				
			}
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println(Thread.currentThread().getName()+" exits");
	}
}

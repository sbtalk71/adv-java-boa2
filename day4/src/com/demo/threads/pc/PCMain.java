package com.demo.threads.pc;

public class PCMain {

	public static void main(String[] args) throws Exception {
		SharedData sd = new SharedData();
		
		Consumer c= new Consumer(sd);
		
		Producer p = new Producer(sd);
		
		Thread t1= new Thread(p);
		Thread t2 = new Thread(c);
		
		t1.start();
		t2.start();
		
		t1.join();
		t2.join();

	}

}

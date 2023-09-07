package com.demo.threads.basic;

public class ThreadMain01 {

	public static void main(String[] args) throws InterruptedException{
		System.out.println(Thread.currentThread().getName()+" starts");
		System.out.println("Main thread priority is "+Thread.currentThread().getPriority());
		Thread.currentThread().setPriority(8);
		MyThread t1=new MyThread();  //NEW
		MyThread t2= new MyThread();
		System.out.println("Thread State is "+t1.getState());
		
		
		System.out.println("t1 priority is "+t1.getPriority());
		
		System.out.println("t2 priority is "+t2.getPriority());
		t1.start();  //RUNNABLE
		t2.start();
		
		t1.join();
		t2.join();

		System.out.println(Thread.currentThread().getName()+" exits");
	}

}

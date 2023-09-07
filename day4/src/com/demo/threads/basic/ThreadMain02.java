package com.demo.threads.basic;

public class ThreadMain02 {

	public static void main(String[] args) throws Exception{
		
		MyWorker runnableTarget=new MyWorker();
		
		Thread t1= new Thread(runnableTarget);
		
		Thread t2=new Thread(runnableTarget);
		
		t1.start();
		t2.start();
		
		
		t1.join();
		t2.join();
		

	}

}

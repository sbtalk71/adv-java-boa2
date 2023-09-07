package com.demo.threads.priority;

public class HiLoPriorityMain {

	public static void main(String[] args) throws Exception{
		
		Thread.currentThread().setPriority(Thread.MAX_PRIORITY);
		
		Clicker c1= new Clicker();
		Clicker c2= new Clicker();
		
		Thread hi=new Thread(c1);
		hi.setPriority(Thread.NORM_PRIORITY+2);//7
		
		Thread lo=new Thread(c2);
		lo.setPriority(Thread.NORM_PRIORITY-2); //3
		
		hi.start();
		lo.start();
		
		Thread.sleep(10000);
		
		c1.stop();
		c2.stop();
		
		hi.join();
		lo.join();
		
		System.out.println("Hi Thread run count : "+c1.click);
		System.out.println("Lo Thread run count : "+c2.click);
		System.out.println("Diff is "+(c1.click-c2.click));

	}

}

package com.demo.executors;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

import com.demo.threads.basic.MyWorker;

public class ExecutorDemo1 {

	public static void main(String[] args) {
		ExecutorService ex= Executors.newCachedThreadPool();
		
		System.out.println(ex.getClass().getName());
		//ex.execute(new MyWorker());
		//ex.execute(new MyWorker());
		//ex.execute(new MyWorker());
		ex.shutdown();

	}

}

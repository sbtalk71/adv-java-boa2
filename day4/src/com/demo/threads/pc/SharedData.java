package com.demo.threads.pc;

public class SharedData {
	private int data = 0;

	public void put(int data) {
		this.data = data;
		System.out.println("PUT :"+data);
	}
	
	public void get() {
		System.out.println("GOT : "+data);
	}
	
	
}

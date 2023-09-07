package com.demo.threads.priority;

public class Clicker implements Runnable {

	long click=0;
	
	private volatile boolean running=true;
	@Override
	public void run() {
	
		while(running) {
		click++;
		}
		
	}
	
	public void stop() {
		running=false;
	}
	
}

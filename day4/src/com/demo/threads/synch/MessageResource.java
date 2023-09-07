package com.demo.threads.synch;

public class MessageResource {

	public synchronized void printMessage(String message) {
		try {
			System.out.print("[" + message);
			Thread.sleep(5000);
			System.out.println("]");
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}

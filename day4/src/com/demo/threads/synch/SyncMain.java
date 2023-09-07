package com.demo.threads.synch;

public class SyncMain {

	public static void main(String[] args) throws Exception {

		MessageResource messageResource = new MessageResource();

		PrintWorker p1 = new PrintWorker(messageResource, "Hello");
		PrintWorker p2 = new PrintWorker(messageResource, "Good");
		PrintWorker p3 = new PrintWorker(messageResource, "World");

		Thread t1 = new Thread(p1);
		Thread t2 = new Thread(p2);
		Thread t3 = new Thread(p3);

		t1.start();
		t2.start();
		t3.start();

		t1.join();
		t2.join();
		t3.join();

	}

}

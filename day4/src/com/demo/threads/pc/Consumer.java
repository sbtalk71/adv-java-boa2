package com.demo.threads.pc;

public class Consumer implements Runnable {
	private SharedData sharedData;

	public Consumer(SharedData sharedData) {
		this.sharedData = sharedData;
	}

	@Override
	public void run() {
		try {
			while (true) {
				sharedData.get();
				Thread.sleep(200);
			}
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

}

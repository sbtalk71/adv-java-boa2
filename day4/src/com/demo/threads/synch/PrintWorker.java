package com.demo.threads.synch;

public class PrintWorker implements Runnable {

	private MessageResource messageResource;
	private String message;
	
	
	public PrintWorker(MessageResource messageResource, String message) {
		this.messageResource = messageResource;
		this.message = message;
	}


	@Override
	public void run() {
		messageResource.printMessage(message);

	}

}

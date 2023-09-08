package com.demo.executors;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ExecutorWithRunnable {

	public static void main(String[] args) {
		// ExecutorService ex = Executors.newSingleThreadExecutor();
		// ExecutorService ex = Executors.newFixedThreadPool(5);
		ExecutorService ex = Executors.newCachedThreadPool();

		List<String> names = Arrays.asList("karana", "rabbo", "monika", "james", "nitin", "sukhi", "pinki", "tiku");

		for (int i = 0; i < names.size(); i++) {
			ex.execute(new UppercaseTask(names.get(i)));
		}
		
		
		ex.shutdown();
		System.out.println(" processing done...");

	}

}

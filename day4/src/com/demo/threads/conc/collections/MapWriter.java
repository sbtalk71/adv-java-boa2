package com.demo.threads.conc.collections;

import java.util.Map;

public class MapWriter implements Runnable {

	private Map<String, String> map;

	public MapWriter(Map<String, String> map) {
		this.map = map;
	}

	@Override
	public void run() {
		String threadName = Thread.currentThread().getName();
		try {
			for (int i = 0; i < 100; i++) {
				map.put(threadName + i, threadName + i);
				Thread.sleep(100);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}

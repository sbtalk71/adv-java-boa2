package com.demo.threads.conc.collections;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class ThreadSafeCollectionsDemo {

	public static void main(String[] args) throws Exception {
		
		Map<String, String> map = new HashMap<String, String>();
		
		Map<String, String> map1=Collections.synchronizedMap(map);
		
		Map<String, String> map2=new ConcurrentHashMap<String, String>();

		Thread t1 = new Thread(new MapWriter(map2));
		Thread t2 = new Thread(new MapWriter(map2));
		Thread t3 = new Thread(new MapWriter(map2));

		t1.start();
		t2.start();
		t3.start();

		t1.join();
		t2.join();
		t3.join();
		
		System.out.println("Map size : "+map2.size());

	}

}

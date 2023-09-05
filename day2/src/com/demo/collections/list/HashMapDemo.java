package com.demo.collections.list;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class HashMapDemo {

	public static void main(String[] args) {
		Map<Integer, String> fruitsMap=new HashMap<Integer, String>();
		fruitsMap.put(1,"apple");
		fruitsMap.put(2, "orange");
		fruitsMap.put(3, "mango");
		fruitsMap.put(4, "pear");
		fruitsMap.put(5, "banana");
		fruitsMap.put(2, "kiwi");
		fruitsMap.put(6, "mango");
		
		System.out.println(fruitsMap);
		
		System.out.println(fruitsMap.get(4));
		
		System.out.println(fruitsMap.containsKey(5));
		System.out.println(fruitsMap.containsValue("kiwi"));
		
		Set<Integer> keys=fruitsMap.keySet();
		
		for(Integer key:keys) {
			System.out.println(key+"----->"+fruitsMap.get(key));
		}
		
		System.out.println(fruitsMap.size());

	}

}

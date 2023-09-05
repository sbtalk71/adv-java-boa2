package com.demo.collections.list;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class ArrayListDemo {

	public static void main(String[] args) {
		//List<String> fruits=new ArrayList<String>();
		List<String> fruits=new LinkedList<String>();
		
		fruits.add("apple");
		fruits.add("banana");
		fruits.add(1,"orange");
		fruits.add("kiwi");
		fruits.add(0,"pear");
		fruits.add("banana");
		
		//List<String> fruits1=Arrays.asList("apple","banana","pear","mango","orange");
		
		System.out.println(fruits);
		fruits.remove(3);
		System.out.println(fruits);
		
		System.out.println(fruits.get(3));
		
		Iterator<String> itr=fruits.iterator();
		
		while(itr.hasNext()) {
			String fruit=itr.next();
			System.out.println(fruit);
		}
		
		for(String fruit:fruits) {
			System.out.println(fruit);
		}
		
		
		Collections.sort(fruits, new FruitsSorter());
		
		System.out.println(fruits);
		
		
		Collections.sort(fruits,new Comparator<String>() {

			@Override
			public int compare(String o1, String o2) {
				
				return o2.compareTo(o1);
			}
			
		});
		
		System.out.println(fruits);
		
		
		
		
	}
	
}

class FruitsSorter implements Comparator<String>{

	@Override
	public int compare(String s1, String s2) {
		
		return s1.compareTo(s2);
	}
	
}

package com.demo.collections.list;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.SortedSet;
import java.util.TreeSet;

public class SetDemo {

	public static void main(String[] args) {
		//Set<String> fruits=new HashSet<String>();
		
		SortedSet<String> fruits=new TreeSet<String>();
		
		fruits.add("apple");
		fruits.add("kiwi");
		fruits.add("orange");
		fruits.add("banana");
		fruits.add("pear");
		fruits.add("banana");
		
		//List<String> fruits1=Arrays.asList("apple","banana","pear","mango","orange");
		
		System.out.println(fruits);
		
		
		
		Iterator<String> itr=fruits.iterator();
		
		while(itr.hasNext()) {
			String fruit=itr.next();
			System.out.println(fruit);
		}
		
		for(String fruit:fruits) {
			System.out.println(fruit);
		}
		
	}
}

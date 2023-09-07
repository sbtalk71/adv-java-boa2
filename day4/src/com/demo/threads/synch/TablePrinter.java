package com.demo.threads.synch;

public class TablePrinter {

	public void printTable(int num) {
		
		for(int i=1;i<11;i++) {
			System.out.println(num+" x "+i+" = "+(num*i));
		}
	}
}

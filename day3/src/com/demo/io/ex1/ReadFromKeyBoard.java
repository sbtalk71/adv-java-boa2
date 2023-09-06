package com.demo.io.ex1;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class ReadFromKeyBoard {

	public static void main(String[] args) throws Exception {
		
		InputStreamReader isr=new InputStreamReader(System.in);
		
		BufferedReader br=new BufferedReader(isr);
		
		String line="";
		
		while(!(line=br.readLine()).equals("exit")) {
			System.out.println(line);
		}
		
		

	}

}

package com.demo.io.ex1;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileRederWriterDemo2 {

	public static void main(String[] args) {
		FileReader fis = null;
		FileWriter fos = null;
		BufferedReader bis=null;
		BufferedWriter bos=null;
		try {
			bis = new BufferedReader(new FileReader("demo.txt"));
			bos=new BufferedWriter(new FileWriter("demo_3.txt"));
			int data = 0;
			while ((data = bis.read()) != -1) {

				bos.write(data);
				bos.flush();
				System.out.print((char) data);
			}
		} catch (FileNotFoundException e) {
			System.out.println("File does not exist..");
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				bis.close();
				bos.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}

	}

}

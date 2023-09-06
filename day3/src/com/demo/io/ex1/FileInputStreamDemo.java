package com.demo.io.ex1;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileInputStreamDemo {

	public static void main(String[] args) {
		FileInputStream fis = null;
		FileOutputStream fos = null;
		BufferedInputStream bis=null;
		BufferedOutputStream bos=null;
		try {
			bis = new BufferedInputStream(new FileInputStream("demo.txt"));
			bos=new BufferedOutputStream(new FileOutputStream("demo_2.txt"));
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

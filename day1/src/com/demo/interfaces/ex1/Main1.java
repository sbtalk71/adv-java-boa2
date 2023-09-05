package com.demo.interfaces.ex1;

public class Main1 {

	public static void main(String[] args) {

		MyDriver driver = new MySQLDBDriver();
		
		System.out.println(driver.getCOnnectionInfo());
		System.out.println(driver.getDBDetails());
	}

}

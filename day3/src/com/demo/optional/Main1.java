package com.demo.optional;

import java.util.Optional;

public class Main1 {

	public static void main(String[] args) {

		Optional<MyDriver> driver = DriverFactory.getDB("mysql");
		
		if(driver.isPresent()) {
			MyDriver drv=driver.get();
		System.out.println(drv.getCOnnectionInfo());
		System.out.println(drv.getDBDetails());
		}else {
			System.out.println("Driver not supported");
		}
	}

}

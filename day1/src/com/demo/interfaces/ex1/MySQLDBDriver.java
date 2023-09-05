package com.demo.interfaces.ex1;

public class MySQLDBDriver implements MyDriver {

	@Override
	public String getCOnnectionInfo() {
		
		return "MySQL DB Connected...";
	}

	@Override
	public String getDBDetails() {
		
		return "MySQL DB 8.0.1";
	}

}

package com.demo.interfaces.ex1;

public class MyOracleDbDriver implements MyDriver {

	@Override
	public String getCOnnectionInfo() {
		
		return "Oracle DB Connected";
	}

	@Override
	public String getDBDetails() {
		
		return " Oracle 12c";
	}

}

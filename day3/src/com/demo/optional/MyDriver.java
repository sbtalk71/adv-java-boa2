package com.demo.optional;

public interface MyDriver {

	String version="1.0.2";
	
	public String getCOnnectionInfo();
	public String getDBDetails();
	
	public default String getColumnInfo() {
		return "Not yet implemented..";
	};
}

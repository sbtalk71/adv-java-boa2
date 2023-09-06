package com.demo.optional;

import java.util.Optional;

public class DriverFactory {

	public static  Optional<MyDriver> getDB(String dbType) {
		if(dbType.equals("mysql")) {
			return Optional.of( new MySQLDBDriver());
		}else if(dbType.equals("oracle")) {
			return Optional.of(new MyOracleDbDriver());
		}else {
			return Optional.empty();
		}
		
	}
}

package com.cognizant.DPT02a;

public class DBConn {
	private static DBConn instance=new DBConn();
	public static DBConn getInstance(){
		return instance;
	}
	
	private DBConn() {
		
	}
	
	public String toString(){
		return "DBConn instance created";
	}
}

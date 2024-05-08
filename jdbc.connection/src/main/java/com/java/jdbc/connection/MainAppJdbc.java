package com.java.jdbc.connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;

import java.sql.Statement;

public class MainAppJdbc {

	public static void main(String[] args) throws ClassNotFoundException, SQLException{
		 //connect java with jdbc
		
		String un = "root";
		String pass = "root";
		String driver = "com.mysql.cj.jdbc.Driver";
		String url = "jdbc:mysql://localhost:3310/fullstackdemo";
		
		Connection conn = null;
		Statement stmt = null; 
		ResultSet rs = null;
		String name = null;
		String password = null;
		 
		//Step 1: load the driver
		Class.forName(driver);
		System.out.println("Before connetcion connection object "+conn);
		
		//Step 2:Make the connection
		conn = DriverManager.getConnection(url,un,pass);
        System.out.println(conn);
	    System.out.println("After connetcion connection object "+conn);
	    
	    //Step 3:Create Statement
	    stmt = conn.createStatement();
	    System.out.println("Statement object "+stmt);
	    
	    String s = "select * from loginEx";
	    
	    //Step 4: Execute Query
	    rs = stmt.executeQuery(s);
	    System.out.println("Name\tPassword");
	    System.out.println("_________________");
	    while(rs.next()) {
	    	name = rs.getString("username");
	    	password = rs.getString("userpassword");
	    	System.out.println(name+"\t"+password);
	    	
	    }
	    
}
}
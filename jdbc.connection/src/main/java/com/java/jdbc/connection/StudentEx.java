package com.java.jdbc.connection;

import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class StudentEx {
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		String username = "root";
		String password = "root";
		String driver = "com.mysql.cj.jdbc.Driver";
		String url = "jdbc:mysql://localhost:3310/fullstackdemo";
		
		Connection conn = null;
		Statement stmt = null;
		ResultSet rs = null;
		int id = 0;
		String name = null;
		String email = null;
		float fees = 0;
		Date dob = null;
		
		Class.forName(driver);
		
		conn = DriverManager.getConnection(url,username,password);
		
		stmt = conn.createStatement();
		
		String s = "select * from student";
		
		rs = stmt.executeQuery(s);
		
		System.out.println("ID\tName\tEmail\tFees\tDOB");
		
		while(rs.next()) {
			id = rs.getInt(1);
			name = rs.getString(2);
			email = rs.getString(3);
			fees = rs.getFloat(4);
			dob = rs.getDate(5);
			
			System.out.println(id+"\t"+name+"\t"+email+"\t"+fees+"\t"+dob);
		}
	}
}

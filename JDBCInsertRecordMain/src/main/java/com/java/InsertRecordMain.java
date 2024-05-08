package com.java;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class InsertRecordMain {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		
		String driver ="com.mysql.cj.jdbc.Driver";
		String  url ="jdbc:mysql://localhost:3310/fullstackdemo";
        String un="root";
		String pass ="root";
		Connection conn = null;
		Statement stmt = null;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter username");
		String n =sc.next();
		
		System.out.println("Enter password");
		String p =sc.next();
		
		Class.forName(driver);
		conn = DriverManager.getConnection(url,un,pass);
		stmt = conn.createStatement();
		//insert into login values('sharddha','sh123');
		//check name exists in database
		
		String r = "select * from loginEx where username='"+n+"'";
		ResultSet rs = stmt.executeQuery(r);
		
		if(rs.next()) {
			System.out.println(n+" user already exists");
		}else {
		String ins = "insert into loginEx values('"+n+"','"+p+"')";
		int i = stmt.executeUpdate(ins);
		
		System.out.println("i="+i);
		
		if(i>0) {
			System.out.println("Record added");
		}else {
			System.out.println("Error occured");
		}
		}
		
	}
}
package com.java;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class DeleteRecord {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
				
			String driver ="com.mysql.cj.jdbc.Driver";
			String  url ="jdbc:mysql://localhost:3310/fullstackdemo";
			String un="root";
			String pass ="root";
			Connection conn = null;
			Statement stmt = null;
				
			//update password
			String newpass,uname;
			Scanner sc = new Scanner(System.in);
				
			System.out.println("Enter name to delete record");
			uname = sc.next();
						
			Class.forName(driver);
			conn = DriverManager.getConnection(url,un,pass);
			stmt = conn.createStatement();
				
			//check user exists
			//using select statement
				
			String s = "select * from loginEx where username='"+uname+"'";
			ResultSet rs = stmt.executeQuery(s);
				
			if(rs.next()) { //true user exists, then go for update

		   	   String del = "delete from loginEx where username = '"+uname+"'";
				
	   		   int i = stmt.executeUpdate(del);
			 	if(i>0) {
		 			System.out.println("Record is deleted");
	 			}
					
 			}else {
					System.out.println("User not exists");
				}
				
			}

	}
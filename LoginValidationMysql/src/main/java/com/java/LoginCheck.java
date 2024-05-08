package com.java;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class LoginCheck {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		String driver ="com.mysql.cj.jdbc.Driver";
		String  url ="jdbc:mysql://localhost:3310/fullstackdemo";
		String un="root";
		String pass ="root";
		Connection conn = null;
		Statement stmt = null;
		ResultSet rs =null;
		String name, password;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter user name for login");
		name = sc.next();
		
		System.out.println("Enter user password");
		password = sc.next();

Class.forName(driver);
		
		 conn = DriverManager.getConnection(url,un,pass);
		 stmt = conn.createStatement();
		 
		 //select * from loginEx where username ='riya' and userpassword='riya123';
		 String s = "select * from loginEx where username='"+name +"' and userpassword='"+password+"'";
		 
		 rs = stmt.executeQuery(s);
		 
		 if(rs.next()) { //record exist
			 System.out.println("Registered user"); 
		 }
		 else {
			 System.out.println("User is not registered, please regisgiter first");
		 }
		 
		 

	}

}



/*
 String s = "select * from login where username=? and userpassword=?;

PreparedStatement pst = conn.prepareStatement(s);

   pst.setString(1,name );
   pst.setString(2,password);
		 
		 rs = pst.executeQuery();
*/

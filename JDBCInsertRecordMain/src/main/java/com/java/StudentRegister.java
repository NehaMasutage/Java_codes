package com.java;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class StudentRegister {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		String driver ="com.mysql.cj.jdbc.Driver";
		String  url ="jdbc:mysql://localhost:3310/fullstackdemo";
		String un="root";
		String pass ="root";
		Connection conn = null;
		Statement stmt = null;
		
		int sid=0;
		String sname;
		float sfees;
		String semail;
		String dob; //yyyy-mm-dd
		
		//input data
		Scanner sc = new Scanner(System.in);
		//System.out.println("Enter id");
		//sid=sc.nextInt();
		
		System.out.println("Enter name ");
		sname = sc.next();
		
		System.out.println("Enter fees");
		sfees = sc.nextFloat();
		System.out.println("Enter email");
		semail = sc.next();
		System.out.println("Enter dob");
		dob = sc.next(); //yyyy-mm-dd
		
		//add record to student table
		Class.forName(driver);
		conn = DriverManager.getConnection(url,un,pass);
		stmt = conn.createStatement();
		
		String s = "select max(id)+1 as id from student";
		
		ResultSet rs = stmt.executeQuery(s);
		
		if(rs.next()) {
			sid = rs.getInt("id");
		}
String ins = "insert into student(id,name,email,fees,dob) values("+sid+",'"+sname+"','"+semail+"',"+sfees+",'"+dob+"')";
		System.out.println(ins);
	    int i = stmt.executeUpdate(ins);
	    if(i>0) {
	    	System.out.println("Student registered Successfully");
	    }else {
	    	System.out.println("Not Registered");
	    }
	
	}

}
package jdbcConnectionEx;

import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class EmployeeEx {
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
		float salary = 0;
		int deptId = 0;
		
		Class.forName(driver);
		
		conn = DriverManager.getConnection(url,username,password);
		
		stmt = conn.createStatement();
		
		String s = "select * from employee";
		
		rs = stmt.executeQuery(s);
		
		System.out.println("ID\tEmp.Name\tSalary\tDept.ID");
		
		while(rs.next()) {
			id = rs.getInt(1);
			name = rs.getString(2);
			salary = rs.getFloat(3);
			deptId = rs.getInt(4);
			
			System.out.println(id+"\t"+name+"\t"+salary+"\t"+deptId);
		}
	}
}

package com.java;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
//create table student(studentid int primary key, studentname varchar(255) ;
@Entity //makes as table
@Table(name="st_table") //change the table name @table
public class Student {
	@Id
	@Column(name="sid") //change the column name
private int studentId;
	@Column(name="sname",length = 40,nullable = false)
private String studentName;
public Student() {
	super();
	// TODO Auto-generated constructor stub
}
public Student(int studentId, String studentName) {
	super();
	this.studentId = studentId;
	this.studentName = studentName;
}
public int getStudentId() {
	return studentId;
}
public void setStudentId(int studentId) {
	this.studentId = studentId;
}
public String getStudentName() {
	return studentName;
}
public void setStudentName(String studentName) {
	this.studentName = studentName;
}
@Override
public String toString() {
	return "Student [studentId=" + studentId + ", studentName=" + studentName + "]";
}


}
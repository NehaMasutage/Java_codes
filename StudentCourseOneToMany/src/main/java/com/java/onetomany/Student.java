package com.java.onetomany;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table
public class Student {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int studentid;
	@Column(name="studentname",length=50,nullable=false)
	private String studentname;
	
	@ManyToOne
	@JoinColumn(name="courseid")
	private Course course;//setter and getter
	
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Student(String studentname) {
		super();
		this.studentname = studentname;
	}

	public int getStudentid() {
		return studentid;
	}

	public void setStudentid(int studentid) {
		this.studentid = studentid;
	}

	public String getStudentname() {
		return studentname;
	}

	public void setStudentname(String studentname) {
		this.studentname = studentname;
	}

	public Course getCourse() {
		return course;
	}
	public void setCourse(Course course) {
		this.course = course;
	}

	@Override
	public String toString() {
		return "Student [studentid=" + studentid + ", studentname=" + studentname + ", getStudentid()=" + getStudentid()
				+ ", getStudentname()=" + getStudentname() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode()
				+ ", toString()=" + super.toString() + "]";
	}
	
	
	
	
}

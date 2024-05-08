package com.java;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="studentTable")
public class Student {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="studentid")
	private int studentId;
	
	@Column(name="studentname", length = 50,nullable=false)
	private String studentName;
	
	@Column(name="studentage")
	private int studentAge;
	
	//courseid in studenttable
	
	@OneToOne
	@JoinColumn(name="courseid")
	private Course course;
	
	
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Student(String studentName, int studentAge) {
		super();
		this.studentName = studentName;
		this.studentAge = studentAge;
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
	public int getStudentAge() {
		return studentAge;
	}
	public void setStudentAge(int studentAge) {
		this.studentAge = studentAge;
	}
	
	//generate setter and getter method for course
	public Course getCourse() {
		return course;
	}
	public void setCourse(Course cobj) {
		this.course = course;
	}
	
	@Override
	public String toString() {
		return "Student [studentId=" + studentId + ", studentName=" + studentName + ", studentAge=" + studentAge
				+ ", getStudentId()=" + getStudentId() + ", getStudentName()=" + getStudentName() + ", getStudentAge()="
				+ getStudentAge() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()="
				+ super.toString() + "]";
	}
	
}

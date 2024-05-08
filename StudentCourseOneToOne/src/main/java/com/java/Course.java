package com.java;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.Generated;

@Entity
@Table(name="CourseTable")
public class Course {
	@Id //primary key
//(	@GeneratedValue //auto increment
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="courseid")
	private int courseId;
	
	@Column(name="coursename", length=50, nullable=false)
	private String courseName;
	private float courseFees;
	public Course() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Course(String courseName, float courseFees) {
		super();
		this.courseName = courseName;
		this.courseFees = courseFees;
	}
	public int getCourseId() {
		return courseId;
	}
	public void setCourseId(int courseId) {
		this.courseId = courseId;
	}
	public String getCourseName() {
		return courseName;
	}
	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}
	public float getCourseFees() {
		return courseFees;
	}
	public void setCourseFees(float courseFees) {
		this.courseFees = courseFees;
	}
	@Override
	public String toString() {
		return "Course [courseId=" + courseId + ", courseName=" + courseName + ", courseFees=" + courseFees + "]";
	}
	
}

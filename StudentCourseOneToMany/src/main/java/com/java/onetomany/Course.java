package com.java.onetomany;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;

@Entity
public class Course {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int courseid;
	@Column(name="coursename", length=50, nullable=false)
	private String coursename;
	@Column(name="coursefees", length=25, nullable=false)
	private float coursefees;

	//one course many student
	
	@OneToMany(cascade = CascadeType.ALL)
	@JoinColumn(name="courseid")
	private List<Student> stdlist;//setter and getter method for this
	
	
	public Course() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	public Course(String coursename, float coursefees) {
		super();
		this.coursename = coursename;
		this.coursefees = coursefees;
	}
	
	
	public int getCourseid() {
		return courseid;
	}
	public void setCourseid(int courseid) {
		this.courseid = courseid;
	}
	public String getCoursename() {
		return coursename;
	}
	public void setCoursename(String coursename) {
		this.coursename = coursename;
	}
	public float getCoursefees() {
		return coursefees;
	}
	public void setCoursefees(float coursefees) {
		this.coursefees = coursefees;
	}
	
	public List<Student> getStdlist() {
		return stdlist;
	}
	public void setStdlist(List<Student> stdlist) {
		this.stdlist = stdlist;
	}


	@Override
	public String toString() {
		return "Course [courseid=" + courseid + ", coursename=" + coursename + ", coursefees=" + coursefees
				+ ", getCourseid()=" + getCourseid() + ", getCoursename()=" + getCoursename() + ", getCoursefees()="
				+ getCoursefees() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()="
				+ super.toString() + "]";
	}
	
}

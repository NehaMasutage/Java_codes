package com.java;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity

public class MyCrudEntity {

	@Id
	private int id;
    private String StudentName;
	private int marks;
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getStudentName() {
		return StudentName;
	}

	public void setStudentName(String studentName) {
		StudentName = studentName;
	}

	public int getMarks() {
		return marks;
	}

	public void setMarks(int marks) {
		this.marks = marks;
	}

	@Override
	public String toString() {
		return "MyCrudEntity [id=" + id + ", StudentName=" + StudentName + ", marks=" + marks + "]";
	}

	
}





//{
//    "id" : " ",
//    "StudentName" : " ",
//    "marks" : ""
//}

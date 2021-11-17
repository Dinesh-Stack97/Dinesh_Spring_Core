package com.Spring_IOC_dependency_Injection.Dependancy_Injection_demo;

public class Student {
	
	private int id;
	private String studentName;
	

	
	public void setId(int id) {
		this.id = id;
	}
	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}
	public void dispalyStudentInfo() {
		System.out.println("Student Name "+studentName +" id is "+id);
	}
	

}

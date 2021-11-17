package com.Spring_IOC_dependency_Injection.Spring_Constructor_Injection;

public class Student {
	
	private int id;
	private String studentName;
	
    
	
	
	public Student(int id, String studentName) {
		
		this.id = id;
		this.studentName = studentName;
	}




	public void dispalyStudentInfo() {
		System.out.println("Student Name "+studentName +" id is "+id);
	}

}

package com.Spring_Dependancy_Injection.Dependency_Injection_Ex;

public class Student {
	private String studentName;

	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}
    public void displayStudentInfo()
    {
    	System.out.println("Student Name is "+studentName);
    }
	
}

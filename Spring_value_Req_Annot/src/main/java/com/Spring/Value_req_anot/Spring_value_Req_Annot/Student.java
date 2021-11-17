package com.Spring.Value_req_anot.Spring_value_Req_Annot;

import org.springframework.beans.factory.annotation.Required;
import org.springframework.beans.factory.annotation.Value;

public class Student {
	/*Adding annotations using this way will reduce the job of using setter method to inject literal values
	 * 
	 * 
	 */
	@Value("${Student.name}")
	private String name;
	
	@Value("${Student.interestedCourse}")
	private String interestedCourse;
	
	@Value("${Student.hobby}")
	private String hobby;
	
	//@Value("${Student.name}")
	public void setName(String name) {
		this.name = name;
	}
	
	@Required//Its getting depricated why sir
	//@Value("${Student.interestedCourse}")
	public void setInterestedCourse(String interestedCourse) {
		this.interestedCourse = interestedCourse;
	}
	//@Value("${Student.hobby}")
	public void setHobby(String hobby) {
		this.hobby = hobby;
	}
	
	public void displayStudentInfo()
	{
		System.out.println("Student Name: "+name);
		System.out.println("Student Intersted Course: "+interestedCourse);
		System.out.println("Student Hobbies: "+hobby);


	}
	
	

}

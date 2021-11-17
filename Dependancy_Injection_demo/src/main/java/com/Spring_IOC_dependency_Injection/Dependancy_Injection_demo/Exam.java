package com.Spring_IOC_dependency_Injection.Dependancy_Injection_demo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Exam {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
	 Student dinesh =	context.getBean("Student",Student.class);
	 dinesh.dispalyStudentInfo();
	 Student ashish =	context.getBean("Ashish",Student.class);
	 ashish.dispalyStudentInfo();
		

	}

}

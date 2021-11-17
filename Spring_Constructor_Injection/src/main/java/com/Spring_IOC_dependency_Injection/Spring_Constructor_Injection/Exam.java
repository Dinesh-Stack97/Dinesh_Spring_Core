package com.Spring_IOC_dependency_Injection.Spring_Constructor_Injection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;



public class Exam {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
		Student abhi = context.getBean("Student",Student.class);
		abhi.dispalyStudentInfo();
		
	}
	
}

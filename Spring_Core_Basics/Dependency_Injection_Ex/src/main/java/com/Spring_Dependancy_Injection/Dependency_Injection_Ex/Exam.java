package com.Spring_Dependancy_Injection.Dependency_Injection_Ex;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Exam {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
		Student dinesh = context.getBean("Student",Student.class);
		dinesh.displayStudentInfo();

	}

}

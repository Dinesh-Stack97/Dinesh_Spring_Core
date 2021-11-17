package com.Spring.Value_req_anot.Spring_value_Req_Annot;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	//	Student student = new Student();
		//CodeCheat cheat = new CodeCheat();
		//student.setCodecheat(cheat);
		//student.cheating();
		

		
		ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
		System.out.println("Bean is loaded");
		Student student = context.getBean("Student",Student.class);
		student.displayStudentInfo();
		
		

	}

}

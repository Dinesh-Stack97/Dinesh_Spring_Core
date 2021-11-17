package com.Spring.Value_common_annotations.Spring_Common_Annotations;

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
		College college = context.getBean("collegeBean", College.class);
		
		System.out.println("College object created "+college);
		
		

	}

}

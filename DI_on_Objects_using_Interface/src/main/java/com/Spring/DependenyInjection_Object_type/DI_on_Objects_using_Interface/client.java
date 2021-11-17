package com.Spring.DependenyInjection_Object_type.DI_on_Objects_using_Interface;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	//	Student student = new Student();
		//CodeCheat cheat = new CodeCheat();
		//student.setCodecheat(cheat);
		//student.cheating();
		

		@SuppressWarnings("resource")
		ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
		System.out.println("Bean is loaded");
		Student student = context.getBean("Stu",Student.class);
		student.cheating();
		

	}

}

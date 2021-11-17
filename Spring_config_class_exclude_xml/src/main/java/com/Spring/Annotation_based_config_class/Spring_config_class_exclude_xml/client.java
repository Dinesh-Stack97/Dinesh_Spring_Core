package com.Spring.Annotation_based_config_class.Spring_config_class_exclude_xml;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	//	Student student = new Student();
		//CodeCheat cheat = new CodeCheat();
		//student.setCodecheat(cheat);
		//student.cheating();
		

		
		ApplicationContext context = new AnnotationConfigApplicationContext(CollegeConfig.class);
		System.out.println("Bean is loaded");
		College college = context.getBean("collegeBean", College.class);
		
		System.out.println("College object created "+college);
		college.Test();
		

	}

}

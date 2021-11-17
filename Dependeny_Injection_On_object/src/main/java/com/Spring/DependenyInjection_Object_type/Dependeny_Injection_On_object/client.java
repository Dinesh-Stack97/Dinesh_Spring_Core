package com.Spring.DependenyInjection_Object_type.Dependeny_Injection_On_object;

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
		Student student = context.getBean("Stu",Student.class);
		student.cheating();
		

	}

}

package com.Spring_IOC_demo.Spring_demo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Mobile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
		Sim sim = context.getBean("Sim",Sim.class);
		sim.calling();
		sim.data();
		

	}

}

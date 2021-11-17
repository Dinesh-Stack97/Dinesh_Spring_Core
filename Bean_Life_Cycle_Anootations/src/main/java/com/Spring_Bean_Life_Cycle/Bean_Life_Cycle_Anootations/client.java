package com.Spring_Bean_Life_Cycle.Bean_Life_Cycle_Anootations;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;



public class client {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		
		ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
		System.out.println("Bean is loaded");
		StudentDAO con = context.getBean("StudentBean", StudentDAO.class);
		
		con.selectAllRows();
		con.deleteAccountHolder(111);
		
		System.out.println("Connection object created "+con);
		
		

	}

}

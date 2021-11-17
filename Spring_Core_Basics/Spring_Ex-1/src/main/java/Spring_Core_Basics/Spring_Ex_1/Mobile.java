package Spring_Core_Basics.Spring_Ex_1;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Mobile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
		System.out.println("Config loaded");
		Sim sim = (Sim)context.getBean("Sim");
		sim.calling();
		sim.data();

	}

}

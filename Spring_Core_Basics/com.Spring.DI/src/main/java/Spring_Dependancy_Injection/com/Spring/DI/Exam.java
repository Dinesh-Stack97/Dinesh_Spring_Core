package Spring_Dependancy_Injection.com.Spring.DI;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Exam {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Exam class wants to add name of student
		//Student student = new Student();
		//injecting value using setter method
	//student.setStudentName("Dinesh Kumar");
		//student.displayStudentInfo();
		
		ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
		Student abhi = context.getBean("Student",Student.class);
		abhi.displayStudentInfo();

	}

}

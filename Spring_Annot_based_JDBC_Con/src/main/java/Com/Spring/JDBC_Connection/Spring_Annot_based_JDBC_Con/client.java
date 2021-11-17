package Com.Spring.JDBC_Connection.Spring_Annot_based_JDBC_Con;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;



public class client {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		
		ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
		System.out.println("Bean is loaded");
		JDBCConnection con = context.getBean("ConnecrtionBean", JDBCConnection.class);
		con.display();
		con.geJDBCConnection();
		
		System.out.println("Connection object created "+con);
		
		

	}

}

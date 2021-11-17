package Com.Spring.JDBC_Connection.Spring_Annot_based_JDBC_Con;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import org.springframework.beans.factory.annotation.Value;

public class JDBCConnection {
	@Value("msql.url")
	
	private String url;
	
	
	@Value("${mysql.username}")
	private String userName;
	
	
	@Value("${mysql.password}")
	private String password;
	
	@Value("${mysql.driver}")
	private String driver;
	
	public void display()
	{
		System.out.println(userName+" "+password+" "+driver);
	}
	
	public void geJDBCConnection() 
	{
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			Connection con1 = DriverManager.getConnection("jdbc:mysql://localhost:3301/bankapplication","root","root123");
			System.out.println("Connection successfull: "+con1);
	}
	catch (ClassNotFoundException | SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	}
}




package com.Spring_Bean_Life_Cycle_annotation.Spring_bean_Life_cycle_annotations;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import org.springframework.beans.factory.annotation.Value;
import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
public class StudentDAO {
	Connection con1;
	
	@Value("${mysql.driver}")
	private String driver;
	
	@Value("${mysql.url}")
	private String url;
	
	@Value("${mysql.username}")
	private String userName;
	
	@Value("${mysql.password}")
	private String password;
	
	@PostConstruct
	public void init() throws ClassNotFoundException, SQLException
	{
		System.out.println("custom init method is called");
		createDBConn();
	}
	public void createDBConn() throws ClassNotFoundException, SQLException
	{
		Class.forName(driver);
		
		con1 = DriverManager.getConnection("jdbc:mysql://localhost:3301/bankapplication","root","root123");
		System.out.println("connection has been established with database"+con1);
	}
	
	public void selectAllRows() throws ClassNotFoundException, SQLException
	{
		
			
			
			//execute query
		 
			Statement stmt = con1.createStatement();
			
			ResultSet rs = stmt.executeQuery("SELECT * FROM abcbank");
			
			while(rs.next())
			{
				String name =  rs.getString(1);
				String custid = rs.getString(2);
				int accno = rs.getInt(3);
				String password = rs.getString(4);
				int balance = rs.getInt(5);
				String email = rs.getString(6);
				
				System.out.println(name+" "+custid+" "+" "+accno+" "+password+" "+" "+balance+" "+" "+email);
				
			}
			
			
			
		} 
		
		
		public void deleteAccountHolder(int accno) throws ClassNotFoundException, SQLException
		{      
			
			
			//execute query
			Statement stmt = con1.createStatement();
			stmt.executeUpdate("delete from abcbank where accno='"+accno+"'");
			System.out.println("record with "+accno+" deleted");
			
			
	}
		
		public void closeconn() throws SQLException
		{
			con1.close();
			System.out.println("connection terminated");
		}
       
		@PreDestroy
		public void destroy() throws SQLException
		{
			closeconn();
		}
}

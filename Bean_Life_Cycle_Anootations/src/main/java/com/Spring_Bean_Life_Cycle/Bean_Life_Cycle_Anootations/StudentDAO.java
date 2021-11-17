package com.Spring_Bean_Life_Cycle.Bean_Life_Cycle_Anootations;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import org.springframework.beans.factory.annotation.Value;

public class StudentDAO {
	
	@Value("${mysql.driver}")
	private String driver;
	
	@Value("${mysql.url}")
	private String url;
	
	@Value("${mysql.username}")
	private String userName;
	
	@Value("${mysql.password}")
	private String password;
	
	public void selectAllRows() throws ClassNotFoundException, SQLException
	{
		
			Class.forName(driver);
			
			Connection con1 = DriverManager.getConnection("jdbc:mysql://localhost:3301/bankapplication","root","root123");
			System.out.println("connection has been established with database"+con1);
			
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
			con1.close();
			
			
		} 
		
		
		public void deleteAccountHolder(int accno) throws ClassNotFoundException, SQLException
		{      
			Class.forName(driver);
			
			Connection con1 = DriverManager.getConnection("jdbc:mysql://localhost:3301/bankapplication","root","root123");
			System.out.println("connection has been established with database"+con1);
			
			//execute query
			Statement stmt = con1.createStatement();
			stmt.executeUpdate("delete from abcbank where accno='"+accno+"'");
			System.out.println("record with "+accno+" deleted");
			
			con1.close();
	}

}

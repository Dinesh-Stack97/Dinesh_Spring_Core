package Sping_Boot_Hibernate_MySQL_CRUD_REST_API.Spring_Boot_CURD.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Data// it reduces the work of creating geters setter or constructor 
@Entity //it is used to make class jpa entity
@Table(name="employees")//To provide table name 
public class Employee {
	
	@Id//To set a primary key
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	
	@Column(name = "first_name")
	private String firstName;
	
	@Column(name = "last_name")
	private String lastName;
	
	@Column(name = "email")
	private String email;

}

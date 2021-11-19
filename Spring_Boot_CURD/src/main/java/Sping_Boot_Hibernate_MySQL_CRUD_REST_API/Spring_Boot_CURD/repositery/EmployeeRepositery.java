package Sping_Boot_Hibernate_MySQL_CRUD_REST_API.Spring_Boot_CURD.repositery;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import Sping_Boot_Hibernate_MySQL_CRUD_REST_API.Spring_Boot_CURD.model.Employee;
//jpa repositry internally provides @reposetry
//@Repository //this provides crud methods for employee jpa entity
public interface EmployeeRepositery extends JpaRepository<Employee, Long> {

	
	
	

}

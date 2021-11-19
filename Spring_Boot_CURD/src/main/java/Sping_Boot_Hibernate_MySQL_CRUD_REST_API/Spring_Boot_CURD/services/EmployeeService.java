package Sping_Boot_Hibernate_MySQL_CRUD_REST_API.Spring_Boot_CURD.services;

import java.util.List;

import Sping_Boot_Hibernate_MySQL_CRUD_REST_API.Spring_Boot_CURD.model.Employee;
public interface EmployeeService {


	Employee saveEmployee(Employee employee);

	List<Employee> getAllEmployees();
	
	
	

}

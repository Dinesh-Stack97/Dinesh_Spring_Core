package Sping_Boot_Hibernate_MySQL_CRUD_REST_API.Spring_Boot_CURD.services.impl;

import java.util.List;

import org.springframework.stereotype.Service;

import Sping_Boot_Hibernate_MySQL_CRUD_REST_API.Spring_Boot_CURD.model.Employee;
import Sping_Boot_Hibernate_MySQL_CRUD_REST_API.Spring_Boot_CURD.repositery.EmployeeRepositery;
import Sping_Boot_Hibernate_MySQL_CRUD_REST_API.Spring_Boot_CURD.services.EmployeeService;

@Service
public class EmployeeServiceImpl implements EmployeeService{

	private EmployeeRepositery employeeRepositry;
	
	
	public EmployeeServiceImpl(EmployeeRepositery employeeRepositry) {
		super();
		this.employeeRepositry = employeeRepositry;
	}


	
	public Employee saveEmployee(Employee employee) {
		// TODO Auto-generated method stub
		return employeeRepositry.save(employee);
	}



	
	public List<Employee> getAllEmployees() {
		return employeeRepositry.findAll();
	}

}

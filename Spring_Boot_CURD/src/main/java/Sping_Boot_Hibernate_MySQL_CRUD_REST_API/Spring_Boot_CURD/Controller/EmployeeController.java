package Sping_Boot_Hibernate_MySQL_CRUD_REST_API.Spring_Boot_CURD.Controller;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import Sping_Boot_Hibernate_MySQL_CRUD_REST_API.Spring_Boot_CURD.model.Employee;
import Sping_Boot_Hibernate_MySQL_CRUD_REST_API.Spring_Boot_CURD.services.EmployeeService;

@RestController
@RequestMapping("/api/employees")
public class EmployeeController {
	
	private EmployeeService employeeService;

	public EmployeeController(EmployeeService employeeService) {
		super();
		this.employeeService = employeeService;
	}
	
	
	//build create employee rest API
	@PostMapping
	public ResponseEntity<Employee> saveEmployee(@RequestBody Employee employee)//we can provide complete response in this class like status,header
	{
		return new ResponseEntity<Employee>(employeeService.saveEmployee(employee), HttpStatus.CREATED);
		
	}
	
	//build all employees REST API
	@GetMapping
	public List<Employee> getAllEmployees()
	{
		
		return employeeService.getAllEmployees();
	}

}

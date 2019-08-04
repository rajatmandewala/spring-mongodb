package com.rajat.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.rajat.model.Employee;
import com.rajat.service.EmployeeService;

@RestController
@RequestMapping(value="/employee")
public class EmployeeController {
	
	private EmployeeService employeeService;

	@Autowired
	public EmployeeController(EmployeeService employeeService) {		
		this.employeeService = employeeService;
	}

	@GetMapping(value="")
	public List<Employee> getAllEmployees(){		
		return employeeService.getAllEmployees();
	}
	
	@PostMapping()
	public void addEmployee(@RequestBody Employee employee) {		
		employeeService.addEmployee(employee);
	}
	
	@DeleteMapping()
	public String deleteEmployee(@RequestBody Employee employee) {
		employeeService.deleteEmployee(employee);		
		return "sd";
	}
	
	@PutMapping()
	public void updateEmployee(@RequestBody Employee employee) {
		employeeService.updateEmployee(employee);		
	}
}

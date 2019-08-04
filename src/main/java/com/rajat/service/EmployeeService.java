package com.rajat.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.rajat.model.Employee;
import com.rajat.repository.EmployeeRepository;

@Service
@Transactional
public class EmployeeService {

	private EmployeeRepository employeeRepository;
	
	@Autowired
	public EmployeeService(EmployeeRepository employeeRepository) {		
		this.employeeRepository = employeeRepository;
	}

	public boolean addEmployee(Employee employee) {
		if (employeeRepository.save(employee) != null)
			return true;
		return false;
	}
	
	public List<Employee> getAllEmployees(){		
		return employeeRepository.findAll();
	}
	
	public void deleteEmployee(Employee employee) {		
		employeeRepository.delete(employeeRepository.findById(employee.getEmployeeId()).get());		
	}	
	
	public boolean updateEmployee(Employee employee) {
		if (employeeRepository.save(employee) != null)
			return true;
		return false;		
	}
}

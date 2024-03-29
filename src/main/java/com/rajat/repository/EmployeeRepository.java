package com.rajat.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;
import com.rajat.model.Employee;

@Repository
public interface EmployeeRepository extends MongoRepository<Employee, Integer> {}

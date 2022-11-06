package com.employeeManagement.springboot.service;

import java.util.List;

import com.employeeManagement.springboot.model.Employee;

public interface EmployeeService {
	
	Employee saveEmployee(Employee employee);
	List<Employee> getAllEmployees();
	Employee getEployeeById(long id);
	Employee updateEmployee(Employee employee, long id);
	void deleteEmployee(long id);

}

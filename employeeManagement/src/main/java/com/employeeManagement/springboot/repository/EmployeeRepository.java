package com.employeeManagement.springboot.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.employeeManagement.springboot.model.Employee;

public interface EmployeeRepository extends JpaRepository <Employee, Long>{

}

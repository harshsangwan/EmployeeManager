package com.project.employeeManager.repo;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.project.employeeManager.model.Employee;

public interface EmployeeRepo extends JpaRepository<Employee, Long>{
	Optional<Employee> findEmployeeById(Long id);
}

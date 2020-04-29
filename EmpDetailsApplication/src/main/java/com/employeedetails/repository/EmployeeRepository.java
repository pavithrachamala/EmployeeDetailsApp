package com.employeedetails.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.employeedetails.entities.Employee;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Long> {
	public Employee findByEmpId(Long id);

	public Employee findByName(String name);
}

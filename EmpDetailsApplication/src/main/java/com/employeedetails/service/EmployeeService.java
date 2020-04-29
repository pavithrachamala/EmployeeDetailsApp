package com.employeedetails.service;

import java.util.List;
import com.employeedetails.entities.Employee;

public interface EmployeeService {
	public List<Employee> findAll();

	public List<Employee> salaryLimit(Double salary);

	public Employee findByEmpId(Long id);

	public Employee findByEmpName(String name);

}

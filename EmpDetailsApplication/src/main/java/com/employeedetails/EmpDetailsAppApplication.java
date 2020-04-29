package com.employeedetails;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import com.employeedetails.entities.Employee;
import com.employeedetails.repository.EmployeeRepository;

@SpringBootApplication
public class EmpDetailsAppApplication implements CommandLineRunner {
	@Autowired
	private EmployeeRepository employeeRepository;

	public static void main(String[] args) {
		SpringApplication.run(EmpDetailsAppApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {

//		Employee emp1 = new Employee("pavi", "abc", 10000, "bangalore");
//		Employee emp2 = new Employee("sai", "def", 20000, "chennai");
//		Employee emp3 = new Employee("veera", "ghi", 30000, "hyderabad");
//		Employee emp4 = new Employee("meghana", "frt", 40000, "kerala");
//		Employee emp5 = new Employee("veer", "cmp", 35000, "kolkata");
//		Employee emp6 = new Employee("megh", "ngt", 45000, "mysore");
//
//		employeeRepository.save(emp1);
//		employeeRepository.save(emp2);
//		employeeRepository.save(emp3);
//		employeeRepository.save(emp4);
//		employeeRepository.save(emp5);
//		employeeRepository.save(emp6);

	}
}
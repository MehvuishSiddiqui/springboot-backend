package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Employee;
import com.example.demo.repository.EmployeeRepsitory;

@RestController
@RequestMapping("/api/v1/")
public class EmployeeController {
 
	@Autowired
	private EmployeeRepsitory  employeeRepository; 
	
	
	// get all employees
	@GetMapping("/employee")
	public List<Employee> getAllEmployees(){
		 return employeeRepository.findAll();
		
	}
}
	 

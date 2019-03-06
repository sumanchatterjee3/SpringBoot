package com.boot.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.boot.model.Employee;
import com.boot.service.EmployeeRegistrationService;

@RestController
@RequestMapping(value="/employees")
public class EmployeeController {
	
	@Autowired 
	private EmployeeRegistrationService employeeRegistrationService;
	
	@PostMapping(value="/employee/create")
	public Employee createEmployee(@RequestBody Employee employee) {
		return employeeRegistrationService.createEmployee(employee);
	}
	@GetMapping(value="/employee/getallemployees")
	public Iterable<Employee> getAllEmployees(){
		Iterable<Employee> resultsetIterable = employeeRegistrationService.getAllEmployees();
		for (Employee employee : resultsetIterable) {
			System.out.println(employee);
		}
		return employeeRegistrationService.getAllEmployees();
	}
	@GetMapping(value="/employee/getemployeebyid/{employeeid}")
	public List<Employee> getEmployeeById(@PathVariable("employeeid") Integer employeeid) {
		return employeeRegistrationService.getEmployeeById(employeeid);
	}
	@PutMapping(value="/employee/updateemail/{employeeid}/{newemail:.+}")
	public List<Employee> updatEmployeeEmail(@PathVariable("employeeid") Integer employeeid,@PathVariable("newemail") String email) {
		return employeeRegistrationService.updateEmployeeEmail(employeeid,email);
	}
}

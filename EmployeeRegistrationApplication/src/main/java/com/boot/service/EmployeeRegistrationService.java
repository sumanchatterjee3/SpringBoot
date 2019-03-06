package com.boot.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.boot.dao.EmployeeRegistrationDAO;
import com.boot.model.Employee;

@Service
public class EmployeeRegistrationService {

	@Autowired 
	private EmployeeRegistrationDAO employeeregistrationDAO;
	
	public Employee createEmployee(Employee employee) {
		
		return employeeregistrationDAO.save(employee);
	}

	public Iterable<Employee> getAllEmployees() {
		// TODO Auto-generated method stub
		//return employeeregistrationDAO.findAll();
		return employeeregistrationDAO.getAllEmployees();
	}

	public List<Employee> getEmployeeById(Integer employeeid) {
		return employeeregistrationDAO.getEmployeeById();
	}

	public List<Employee> updateEmployeeEmail(Integer employeeid, String email) {

		Employee uEmployee = employeeregistrationDAO.findById(employeeid).get();
		uEmployee.setEmail(email);
		employeeregistrationDAO.save(uEmployee);
		
		return getEmployeeById(employeeid);
	}

	

}

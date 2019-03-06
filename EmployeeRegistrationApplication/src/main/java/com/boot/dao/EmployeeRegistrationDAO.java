package com.boot.dao;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.Repository;

import com.boot.model.Employee;


public interface EmployeeRegistrationDAO  extends Repository<Employee, Integer>,CrudRepository<Employee, Integer> {
	
	@Query(value="select e from Employee e where e.firstname=?1")
	List<Employee> getEmployeeByFirstName(String firstname);
	
	@Query(value="select * from employee",nativeQuery=true)
	Iterable<Employee> getAllEmployees();
	
	@Query(value="select e from Employee e where e.employeeid=?1")
	List<Employee> getEmployeeById();
}

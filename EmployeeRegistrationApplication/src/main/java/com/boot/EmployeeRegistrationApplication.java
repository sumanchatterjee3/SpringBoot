package com.boot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.boot.model.Employee;
import com.boot.service.EmployeeRegistrationService;

@SpringBootApplication
public class EmployeeRegistrationApplication {

	public static void main(String[] args) {
		SpringApplication.run(EmployeeRegistrationApplication.class, args);
//		ConfigurableApplicationContext applicationContext=SpringApplication.run(EmployeeRegistrationApplication.class, args);
//		EmployeeRegistrationService employeeRegistrationService= applicationContext.getBean("employeeRegistrationService",EmployeeRegistrationService.class);
//		
//		Employee employee = new Employee();
//		employee.setFirstname("Suman");
//		employee.setLastname("Chatterjee");
//		employee.setCity("Kolkata");
//		employee.setEmail("suman@abc.com");
//		
//		employeeRegistrationService.createEmployee(employee);
	}

}

package boot.spring;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import boot.spring.service.StudentRegistrationService;

@SpringBootApplication
public class StudentRegistrationApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext applicationContext = SpringApplication.run(StudentRegistrationApplication.class, args);
		
		StudentRegistrationService studentRegistrationService = applicationContext.getBean("studentRegistrationService", StudentRegistrationService.class);
	}

}

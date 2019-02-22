package boot.spring;

import java.util.Date;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import boot.spring.event.Student;
import boot.spring.service.StudentRegistrationService;

@SpringBootApplication
public class StudentRegistrationApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext applicationContext = SpringApplication.run(StudentRegistrationApplication.class, args);
		
		StudentRegistrationService studentRegistrationService = applicationContext.getBean("studentRegistrationService", StudentRegistrationService.class);
	
		Student student = new Student();
		student.setSt_dob(new Date());		
		student.setSt_f_name("Suman");
		student.setSt_l_name("Chatterjee");
		student.setSt_email("suman@suman.com");
		student.setSt_course("Engineering");
		student.setSt_year("Final Year");
		
		studentRegistrationService.createStudent(student);
	
	}

}

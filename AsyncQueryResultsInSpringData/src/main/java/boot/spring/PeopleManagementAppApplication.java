package boot.spring;

import java.util.Arrays;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import boot.spring.model.Person;
import boot.spring.service.PeopleManagementService;

@SpringBootApplication
public class PeopleManagementAppApplication implements CommandLineRunner {

	@Autowired
	private PeopleManagementService peoplemanagementservice;
	
	public static void main(String[] args) {
		SpringApplication.run(PeopleManagementAppApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
	}
		
}


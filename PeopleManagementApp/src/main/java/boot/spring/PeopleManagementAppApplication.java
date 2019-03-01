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
//		createPerson();
		createPersons();
		}
		
		private void createPersons() {
		List<Person> personList = Arrays.asList(new Person("Suman", "Chatterjee", "suman1@suman.com", new Date()),
				new Person("Sreemoyee", "Banerjee", "sree@suman.com", new Date()));
		Iterable<Person> createPersons = peoplemanagementservice.createPersons(personList);
		for (Person person : createPersons) {
			System.out.println(person);			
		}
		
	}

		public void createPerson() {
			Person person1 = new Person(1, "Suman", "Chatterjee", "suman@suman.com", new Date());
			Person personDb = peoplemanagementservice.createPerson(person1);
			System.out.println(personDb);
		}
		
}


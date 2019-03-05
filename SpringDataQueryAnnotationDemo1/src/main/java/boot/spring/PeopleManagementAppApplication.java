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
//		createPersons();
		getPersonsInfoByLastName();
		getPersonsInfoByFirstNameAndEmail();
		}

	private void getPersonsInfoByFirstNameAndEmail() {
		List<Person> personList = peoplemanagementservice.getPersonsInfoByFirstNameAndEmail("Kishan","kishan.cs2019@yahoo.com");
		 
		 personList.forEach(System.out::println);
		
	}

/*	private void createPerson() {
		Person person1 = new Person("Sean", "Muphy", "sean.m2017@gamil.com", new Date());
		Person personDb = peoplemanagementservice.createPerson(person1);
		System.out.println(personDb);
	}
	
	private void createPersons() {
		List<Person> personList = Arrays.asList(new Person("Barry", "Johnson", "barry.j2019@Gmail.com", 
				new Date()),new Person("Kishan", "Kumar", "kishan.cs2019@yahoo.com", new Date()));
		Iterable<Person> createPersons = peoplemanagementservice.createPersons(personList);
		for (Person person : createPersons) {
			System.out.println(person);
		}
		
	} */
	
	private void getPersonsInfoByLastName() {
		 List<Person> personList = peoplemanagementservice.getPersonsInfoByLastName("Kumar");
		 
		 personList.forEach(System.out::println);
		
	}
		
}


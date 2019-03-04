package boot.spring.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import boot.spring.DAO.PeopleManagementDAO;
import boot.spring.model.Person;

@Service
public class PeopleManagementService {

	@Autowired
	private PeopleManagementDAO peoplemanagementdao;
	
	public Person createPerson(Person person1) {
		return peoplemanagementdao.save(person1);
	}

	public Iterable<Person> createPersons(List<Person> personList) {
		Iterable<Person> list = peoplemanagementdao.saveAll(personList);
		return list;
	}

	public List<Person> getPersonsInfoByLastName(String lastName) {
		
		return peoplemanagementdao.findByLastName(lastName);
	}
	
}

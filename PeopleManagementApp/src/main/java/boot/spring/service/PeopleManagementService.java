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
		Iterable<Person> pList= peoplemanagementdao.saveAll(personList);
		return pList;
		
	}
	public Iterable<Person> getPersonsById(List<Integer> idsIntegers) {
		Iterable<Person> personListIterable = peoplemanagementdao.findAllById(idsIntegers);
		return personListIterable;
	}
	public void deletePerson(Person person) {
		peoplemanagementdao.delete(person);
		
	}
	public void updatePersonEmailById(Integer idInteger ,String newEmailString) {
		Person person = peoplemanagementdao.findById(idInteger).get();
		person.setEmail(newEmailString);
		peoplemanagementdao.save(person);
	}
	
	
	

}

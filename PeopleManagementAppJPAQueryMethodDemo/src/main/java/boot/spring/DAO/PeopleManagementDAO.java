package boot.spring.DAO;

import java.util.List;

import org.springframework.data.repository.Repository;

import boot.spring.model.Person;

public interface PeopleManagementDAO extends Repository<Person, Integer> {
	
	List<Person> findByLastName(String lastName);

}

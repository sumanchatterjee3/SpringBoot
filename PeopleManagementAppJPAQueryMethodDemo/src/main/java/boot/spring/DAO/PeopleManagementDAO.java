package boot.spring.DAO;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import boot.spring.model.Person;

public interface PeopleManagementDAO extends CrudRepository<Person, Integer> {
	
	List<Person> findByLastName(String lastName);

}

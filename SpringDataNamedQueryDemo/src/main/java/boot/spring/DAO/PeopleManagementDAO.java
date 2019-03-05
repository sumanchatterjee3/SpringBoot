package boot.spring.DAO;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.Repository;

import boot.spring.model.Person;

//public interface PeopleManagementDAO extends CrudRepository<Person, Integer> {
//	
//	List<Person> findByLastName(String lastName);
//
//	List<Person> getPersonsInfoByFirstNameAndEmail(String firstName, String email);
//
//}

public interface PeopleManagementDAO extends Repository<Person, Integer> {

List<Person> findByLastName(String lastName);

List<Person> getPersonsInfoByFirstNameAndEmail(String firstName, String email);

}

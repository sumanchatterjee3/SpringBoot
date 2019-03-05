package boot.spring.DAO;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
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


//	@Query (value="SELECT p FROM Person p WHERE p.lastName=?1")
	@Query (value="select * from person where last_name=?1", nativeQuery=true)
	List<Person> findByLastName(String lastName);

//	@Query (value="SELECT p FROM Person p WHERE p.firstName=?1 AND p.email=?2")
	@Query (value="select * from person where first_name=?1 & email=?2", nativeQuery=true)
	List<Person> getPersonsInfoByFirstNameAndEmail(String firstName, String email);

}

package boot.spring.DAO;

import org.springframework.data.repository.CrudRepository;

import boot.spring.model.Person;

public interface PeopleManagementDAO extends CrudRepository<Person, Integer> {

}

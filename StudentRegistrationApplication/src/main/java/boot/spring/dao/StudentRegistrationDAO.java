package boot.spring.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import boot.spring.event.Student;

@Repository
public interface StudentRegistrationDAO extends CrudRepository<Student, Integer>{

}

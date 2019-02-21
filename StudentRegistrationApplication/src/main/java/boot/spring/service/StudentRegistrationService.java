package boot.spring.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import boot.spring.dao.StudentRegistrationDAO;
import boot.spring.event.Student;

@Service
public class StudentRegistrationService {

	@Autowired
	private StudentRegistrationDAO studentRegistrationDAO;
	
	public Student createStudent(Student student) {
		return studentRegistrationDAO.save(student);
	}

	public Student getAllStudents() {
		return (Student)studentRegistrationDAO.findAll();
	}

	public Student getStudentById(Integer student_Id) {
		return studentRegistrationDAO.findById(student_Id).get();
	}

	public Student getStudentByFName(String st_f_name) {
		// TODO Auto-generated method stub
		return null;
	}

}

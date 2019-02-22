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

	public Student getStudentById(Integer student_Id) {
		return studentRegistrationDAO.findById(student_Id).get();
	}

	public Student getStudentByFName(String st_f_name) {
		Student st = null;
		for(Student stu : studentRegistrationDAO.findAll()) {
			st = stu;
		}
		return studentRegistrationDAO.findById(st.getStudent_id()).get();
	}

	public Iterable<Student> getAllStudents() {
		return studentRegistrationDAO.findAll();
	}

}

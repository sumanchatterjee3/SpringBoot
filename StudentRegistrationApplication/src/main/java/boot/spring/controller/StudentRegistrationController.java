package boot.spring.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import boot.spring.event.Student;
import boot.spring.service.StudentRegistrationService;

@RestController
@RequestMapping(value="/students")
public class StudentRegistrationController {
	
	@Autowired
	private StudentRegistrationService studentRegistrationService;
	
	@GetMapping(value="/student/create")
	public Student createStudent(@RequestBody Student student) {
		return studentRegistrationService.createStudent(student);
	}
	
	@SuppressWarnings("unchecked")
	@GetMapping(value="/student/getAllStudents")
	public Iterable<Student> getAllStudent() {
		return (Iterable<Student>) studentRegistrationService.getAllStudents();
	}
	
	@GetMapping(value="/student/getStudentById/{student_Id}")
	public Student getStudentById(@PathVariable("student_Id") Integer student_Id) {
		return studentRegistrationService.getStudentById(student_Id);	
	}
	@GetMapping(value="/student/getStudentByFName/{st_f_name}")
	public Student getStudentByFName(@PathVariable("st_f_name") String st_f_name) {
		return studentRegistrationService.getStudentByFName(st_f_name);
	}
}

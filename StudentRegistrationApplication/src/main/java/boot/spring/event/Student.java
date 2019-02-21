package boot.spring.event;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="student")
public class Student {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="student_id")
	private Integer student_id;
	
	@Column(name="st_f_name")
	private String st_f_name;
	
	@Column(name="st_l_name")
	private String st_l_name;
	
	@Column(name="st_course")
	private String st_course;
	
	@Column(name="st_year")
	private String st_year;
	
	@Column(name="st_email")
	private String st_email;
	
	@Column(name="st_dob")
	private Date st_dob;

	public Integer getStudent_id() {
		return student_id;
	}

	public void setStudent_id(Integer student_id) {
		this.student_id = student_id;
	}

	public String getSt_f_name() {
		return st_f_name;
	}

	public void setSt_f_name(String st_f_name) {
		this.st_f_name = st_f_name;
	}

	public String getSt_l_name() {
		return st_l_name;
	}

	public void setSt_l_name(String st_l_name) {
		this.st_l_name = st_l_name;
	}

	public String getSt_course() {
		return st_course;
	}

	public void setSt_course(String st_course) {
		this.st_course = st_course;
	}

	public String getSt_year() {
		return st_year;
	}

	public void setSt_year(String st_year) {
		this.st_year = st_year;
	}

	public String getSt_email() {
		return st_email;
	}

	public void setSt_email(String st_email) {
		this.st_email = st_email;
	}

	public Date getSt_dob() {
		return st_dob;
	}

	public void setSt_dob(Date st_dob) {
		this.st_dob = st_dob;
	}

	@Override
	public String toString() {
		return "Student [student_id=" + student_id + ", st_f_name=" + st_f_name + ", st_l_name=" + st_l_name
				+ ", st_course=" + st_course + ", st_year=" + st_year + ", st_email=" + st_email + ", st_dob=" + st_dob
				+ "]";
	}
	
	
}

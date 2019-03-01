package boot.spring.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonFormat;

@Entity
@Table(name="person")
public class Person {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="person_id")
	private int id;
	@Column(name="first_name",length =60,nullable=false)
	private String firstname;
	@Column(name="last_name",length =60,nullable=false)
	private String lastname;
	@Column(name="email",unique=true)
	private String email;
	@Column(name="creation_date")
	@JsonFormat(pattern="yyyy-MM-dd")
	private Date creationdate;
	
	public Person() {
		
	}
	
	public Person(int id, String firstname, String lastname, String email, Date creationdate) {
		super();
		this.id = id;
		this.firstname = firstname;
		this.lastname = lastname;
		this.email = email;
		this.creationdate = creationdate;
	}
	
	
	
	
	public Person(String firstname, String lastname, String email, Date creationdate) {
		super();
		this.firstname = firstname;
		this.lastname = lastname;
		this.email = email;
		this.creationdate = creationdate;
	}

	public int getId() {
		return id;
	}
	public String getFirstname() {
		return firstname;
	}
	public String getLastname() {
		return lastname;
	}
	public String getEmail() {
		return email;
	}
	public Date getCreationdate() {
		return creationdate;
	}

	public void setId(int id) {
		this.id = id;
	}


	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}


	public void setLastname(String lastname) {
		this.lastname = lastname;
	}


	public void setEmail(String email) {
		this.email = email;
	}


	public void setCreationdate(Date creationdate) {
		this.creationdate = creationdate;
	}


	@Override
	public String toString() {
		return "Person [id=" + id + ", firstname=" + firstname + ", lastname=" + lastname + ", email=" + email
				+ ", creationdate=" + creationdate + ", getId()=" + getId() + ", getFirstname()=" + getFirstname()
				+ ", getLastname()=" + getLastname() + ", getEmail()=" + getEmail() + ", getCreationdate()="
				+ getCreationdate() + "]";
	}
	
	
	
}

package com.boot.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import org.hibernate.annotations.DynamicUpdate;

@Entity
@DynamicUpdate
@Table(name="employee")
public class Employee {
	@Id
	@Column(name="employeeid",unique=true)
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int employeeid;
	@Column(name="firstname",length=100,nullable=false)
	private String firstname;
	@Column(name="lastname",length=100,nullable=false)
	private String lastname;
	@Column(name="city",length=100,nullable=true)
	private String city;
	@Column(name="email",unique=true,length=200)
	private String email;
	
	public Employee() {
		
	}

	public Employee(int employeeid, String firstname, String lastname, String city, String email) {
		
		this.employeeid = employeeid;
		this.firstname = firstname;
		this.lastname = lastname;
		this.city = city;
		this.email = email;
	}

	public Employee(String firstname, String lastname, String city, String email) {
		
		this.firstname = firstname;
		this.lastname = lastname;
		this.city = city;
		this.email = email;
	}

	public int getEmployeeid() {
		return employeeid;
	}

	public void setEmployeeid(int employeeid) {
		this.employeeid = employeeid;
	}

	public String getFirstname() {
		return firstname;
	}

	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}

	public String getLastname() {
		return lastname;
	}

	public void setLastname(String lastname) {
		this.lastname = lastname;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	@Override
	public String toString() {
		return "Employee [employeeid=" + employeeid + ", firstname=" + firstname + ", lastname=" + lastname + ", city="
				+ city + ", email=" + email + ", getEmployeeid()=" + getEmployeeid() + ", getFirstname()="
				+ getFirstname() + ", getLastname()=" + getLastname() + ", getCity()=" + getCity() + ", getEmail()="
				+ getEmail() + "]";
	}
	
		

}

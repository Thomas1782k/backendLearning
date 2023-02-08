package com.backend.employee.modal;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;


@Data
@Entity
@Table(name="Employee")
public class Employee {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	@Column(name="name")
	private String Name;
	@Column(name="email")
	private String Email;
	@Column(name="location")
	private String Location;
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getName() {
		return Name;
	}
	public void setName(String Name) {
		this.Name = Name;
	}
	public String getEmail() {
		return Email;
	}
	public void setEmail(String Email) {
		this.Email = Email;
	}
	public String getLocation() {
		return Location;
	}
	public void setLocation(String Location) {
		this.Location = Location;
	}
	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + Name + ", email=" + Email + ", location=" + Location + "]";
	}
	
	
	
	
}

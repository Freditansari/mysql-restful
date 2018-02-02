package com.fredy.training.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Person {
	@Id
	@GeneratedValue
	int ID;
	String FirstName;
	String LastName;
	
	public Person()
	{
		
	}
	
	public Person(int iD, String firstName, String lastName) {
		super();
		ID = iD;
		FirstName = firstName;
		LastName = lastName;
	}
	
	public int getID() {
		return ID;
	}
	public void setID(int iD) {
		ID = iD;
	}
	public String getFirstName() {
		return FirstName;
	}
	public void setFirstName(String firstName) {
		FirstName = firstName;
	}
	public String getLastName() {
		return LastName;
	}
	public void setLastName(String lastName) {
		LastName = lastName;
	}
	@Override
	public String toString() {
		return "Person [ID=" + ID + ", FirstName=" + FirstName + ", LastName=" + LastName + "]";
	}
	
	
}

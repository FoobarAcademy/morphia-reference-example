package com.foobaracademy.morphia;

import java.util.Date;

import org.bson.types.ObjectId;
import org.mongodb.morphia.annotations.Entity;
import org.mongodb.morphia.annotations.Id;
import org.mongodb.morphia.annotations.Reference;

@Entity("user")
public class User {

	@Id
	private ObjectId objectId;
	
	private String firstName;
	
	private String lastName;

	@Reference
	private Company employer;
	
	
	/**
	 * keep an empty constructor so that morphia 
	 * can recreate this entity when you want to 
	 * fetch it from the database
	 */
	public User(){}
	
	
	/**
	 * full constructor 
	 * (without objectId, we let morphia generate this one for us) 
	 * 
	 * @param firstName
	 * @param lastName
	 * @param birthDate
	 * @param hasPremiumAccess
	 */
	public User(String firstName, String lastName, Company employer) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.employer = employer;
	}
	
	
	

	public ObjectId getObjectId() {
		return objectId;
	}

	public void setObjectId(ObjectId objectId) {
		this.objectId = objectId;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}


	public Company getEmployer() {
		return employer;
	}

	public void setEmployer(Company employer) {
		this.employer = employer;
	}

}

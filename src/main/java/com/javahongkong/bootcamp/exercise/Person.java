package com.javahongkong.bootcamp.exercise;

import java.util.Objects;

public class Person extends AccountHolder {
	private String firstName;
	private String lastName;
	private int idNumber;

	public Person(String firstName, String lastName, int idNumber) throws Exception {
		// complete the function
		super(idNumber);
		this.firstName = firstName;
		this.lastName = lastName;
		this.idNumber = idNumber;
		if (firstName == null || lastName == null)
			throw new Exception("firstName or lastName can not be null");
	}

	public String getFirstName() {
		return this.firstName;
	}

	public String getLastName() {
		return this.lastName;
	}

	public int getIDNumber() {
		return this.idNumber;
	}

	@Override
	public boolean equals(Object o) {
		if (this == o)
			return true;
		if (!(o instanceof Person))
			return false;
		Person person = (Person) o;
		return idNumber == person.idNumber && //
				firstName.equals(person.getFirstName()) && //
				lastName.equals(person.getLastName());
	}

	@Override
	public int hashCode() {
		return Objects.hash(firstName, lastName, idNumber);
	}

}

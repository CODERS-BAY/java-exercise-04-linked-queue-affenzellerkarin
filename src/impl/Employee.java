package impl;

import java.util.UUID;
import skeleton.Person;

public class Employee extends Person {

	UUID ID;
	String departement;
	String description;

	public Employee(String firstName, String lastName, String departement, String description) {

		super (firstName, lastName);
		this.ID = UUID.randomUUID();
		this.departement = departement;
		this.description = description;
	}

	@Override
	public String toString() {
		return (ID.toString() + ": " + super.toString()+" "+ this.departement +" "+ this.description);
	}
}


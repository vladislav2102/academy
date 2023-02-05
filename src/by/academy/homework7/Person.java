package by.academy.homework7;

import java.time.LocalDate;
import java.time.Period;

public class Person {

	private String firstName;
	private String lastName;
	private int age;
	private LocalDate dateOfBirth;

	public Person() {
		super();
	}

	public Person(String firstName, String lastName, int day, int month, int year) {
		this.firstName = firstName;
		this.lastName = lastName;
		dateOfBirth = LocalDate.of(year, month, day);
		age = Period.between(dateOfBirth, LocalDate.now()).getYears();
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName (String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public int getAge() {
		return age;
	}

	public LocalDate getDateOfBirth() {
		return dateOfBirth;
	}

	public void setDateOfBirth(int day, int month, int year) {
		dateOfBirth = LocalDate.of(year, month, day);
		age = Period.between(dateOfBirth, LocalDate.now()).getYears();
	}



	@Override
	public String toString() {
		return "Person{" +
				"firstName='" + firstName + '\'' +
				", lastName='" + lastName + '\'' +
				", age=" + age +
				", dateOfBirth=" + dateOfBirth +
				'}';
	}
}

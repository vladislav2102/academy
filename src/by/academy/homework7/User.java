package by.academy.homework7;

import java.util.Scanner;

public class User extends Person {

	private String login;
	private String password;
	private String email;

	public User () {
		super();
	}

	public User (String firstName, String lastName, int day, int month, int year, String login, String password, String email) {
		super(firstName, lastName, day, month, year);
		this.login = login;
		this.password = password;
		this.email = email;
	}

	public String getLogin() {
		return login;
	}

	public void setLogin(String login) {
		this.login = login;
	}

	public void setPassword(String password1) {
		if(equalsPassword(password1)) {
			Scanner sc = new Scanner(System.in);
			password = sc.nextLine();
		} else {
			System.out.println("Пароли не совпадают");
		}
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	@Override
	public String toString() {
		return "User{" +
				"login='" + login + '\'' +
				", password='" + password + '\'' +
				", email='" + email + '\'' +
				"} " + super.toString();
	}

	public void printUserInfo () {
		System.out.println("Данные пользователя:\n" + "Имя: " + getFirstName() + "\nФамилия: " + getLastName()
				+ "\nДата рождения: " + getDateOfBirth() + "\nВозраст: " + getAge() + " лет\nЛогин: " + login
				+ "\nemail: " + email);
	}

	public boolean equalsPassword (String password1) {
		if(password.equals(password1)) {
			return true;
		} else {
			return false;
		}
	}


}

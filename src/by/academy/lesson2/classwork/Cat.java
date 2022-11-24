package by.academy.lesson2.classwork;

public class Cat {

	private int age; //возраст кота
	private String nickname; //имя кота
	private double money; //деньги выделенные на содержание кота
	private char initial; //первая буква имени кота
	private boolean isHomeAnimal; //свойство указывающее кот домашнее животное или нет

	public Cat() {  //конструктор для создания кота без свойств
	}

	public Cat (String nickname) {  //конструктор для создания кота со свойством "имя"
		this.nickname = nickname;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getNickname() {
		return nickname;
	}

	public void setNickname(String nickname) {
		this.nickname = nickname;
	}

	public double getMoney() {
		return money;
	}

	public void setMoney(double money) {
		this.money = money;
	}

	public char getInitial() {
		return initial;
	}

	public void setInitial(char initial) {
		this.initial = initial;
	}

	public boolean isHomeAnimal() {
		return isHomeAnimal;
	}

	public void setHomeAnimal(boolean isHomeAnimal) {
		this.isHomeAnimal = isHomeAnimal;
	}

	public void grow() {
		age++;
	}

	public void sleep() {
		System.out.println(nickname + " is sleeping");
	}

	public void eat() {
		System.out.println(nickname + " is eating");
	}

	public void walk() {
		System.out.println(nickname + " is walking");
	}
}

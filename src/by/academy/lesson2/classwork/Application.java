package by.academy.lesson2.classwork;

public class Application {
	public static void main(String[] args) {

		Cat cat1 = new Cat(); //создание кота без имени

		Cat cat2 = new Cat("Tom"); //создание кота с именем

		cat1.setNickname("Jerry"); //присвоение коту без имени имя "Jerry"

		cat2.sleep();
		cat2.eat();
		cat2.walk();

		while (cat1.getAge() < 3) {
			cat1.grow();
		}

		System.out.println(cat1.getNickname() + " " + cat1.getAge() + " года");

	}
}

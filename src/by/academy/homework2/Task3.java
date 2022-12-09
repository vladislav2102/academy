package by.academy.homework2;

import java.util.Scanner;

public class Task3 {
	public static void main(String[] args) {

		String word1 = null;
		String word2 = null;
		String word3;

		Scanner scan = new Scanner(System.in);

		boolean isOn = true;

		while (isOn) {
			System.out.println("Введите первое слово состоящее из четного количества букв");
			word1 = scan.nextLine();
			if (word1.length() % 2 == 0 && word1.indexOf(' ', 0) == -1 && !word1.isEmpty()) {
				isOn = false;
			} else {
				System.out.println("Введенное слово не соотвествует требованиям, читайте внимательнее!");
			}
		}

		while (!isOn) {
			System.out.println("Введите второе слово состоящее из четного количества букв");
			word2 = scan.nextLine();
			if (word2.length() % 2 == 0 && word2.indexOf(' ', 0) == -1 && !word2.isEmpty()) {
				isOn = true;
			} else {
				System.out.println("Введенное слово не соотвествует требованиям, читайте внимательнее!");
			}
		}

		scan.close();

		word3 = word1.substring(0, word1.length() / 2) + word2.substring(word2.length() / 2);

		System.out.println(word3);
	}
}

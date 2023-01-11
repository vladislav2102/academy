package by.academy.homework4.task1;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ValidateDate {

	public static String dateInput() {
		System.out.println("Введите дату в формате: ДД-ММ-ГГГГ");
		Scanner scanner = new Scanner(System.in);
		String dateInput = scanner.nextLine();
		Pattern pattern = Pattern.compile("[0-9]{2}-[0-9]{2}-[0-9]{4}");
		Matcher matcher = pattern.matcher(dateInput);
		while (matcher.matches() == false) {
			System.out.println("Дата введена в неверном формате. Повторите попытку.");
			dateInput = scanner.nextLine();
			matcher = pattern.matcher(dateInput);
		}
		return dateInput;
	}
}

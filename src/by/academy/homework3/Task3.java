package by.academy.homework3;
import java.util.Scanner;

public class Task3 {
	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		System.out.println("Введите дату в формате");

		String date = scanner.nextLine();

		Task3support.test(date);
	}
}

package by.academy.homework1;
import java.util.Scanner;

public class Task3 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Введите число:");

		int a = sc.nextInt();

		sc.close();

		System.out.println("Таблица умножения числа " + a + ":");

		for(int i = 1; i <= 10; i++) {
			System.out.println(a + " * " + i + " = " + (a * i));
		}
	}
}

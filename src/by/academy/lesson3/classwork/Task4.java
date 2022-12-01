package by.academy.lesson3.classwork;
import java.util.Scanner;

public class Task4 {
	public static void main(String[] args) {

		int a;

		Scanner sc = new Scanner(System.in);

		System.out.println("Введите число");

		a = sc.nextInt();
		sc.close();

		if (a % 2 == 0) {
			System.out.println("Число четное");
		} else {
			System.out.println("Число нечетное");
		}
	}
}

package by.academy.homework1;
import java.util.Scanner;

public class Task4 {

	public static void main(String[] args) {

		int a;
		int b;

		Scanner sc = new Scanner(System.in);

		System.out.println("Введите число:");

		a = sc.nextInt();

		sc.close();

		b = a;

		for(int i = 1; b <= 1_000_000; i++) {
			b = (int) Math.pow(a, i);
			System.out.println(a + " в степени " + i + " = " + b);
		}
	}
}

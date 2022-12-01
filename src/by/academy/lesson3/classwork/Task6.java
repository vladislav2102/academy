package by.academy.lesson3.classwork;
import java.util.Scanner;

public class Task6 {
	public static void main(String[] args) {

		double a;
		double b;

		Scanner sc = new Scanner(System.in);

		System.out.println("Введите первое число");
		a = sc.nextDouble();

		System.out.println("Введите второе чило");
		b = sc.nextDouble();

		sc.close();

		if (a > b) {
			System.out.println("число " + a + " больше чем число " + b);
		} else if (a == b) {
			System.out.println("Введенные Вами числа равны");
		} else {
			System.out.println("число " + a + " меньше чем число " + b);
		}

		System.out.println("Среднее арифметическое введенных чисел: " + ((a + b) / 2));
	}
}

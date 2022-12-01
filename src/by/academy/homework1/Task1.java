package by.academy.homework1;
import java.util.Scanner;

public class Task1 {
	public static void main(String[] args) {

		double totalPrice;
		int age;

		Scanner scan = new Scanner(System.in);

		System.out.println("Введите итоговую сумму покупки:");
		totalPrice = scan.nextDouble();

		System.out.println("Введите возраст покупателя:");
		age = scan.nextInt();
		scan.close();

		if(totalPrice < 100) {
			totalPrice *= 0.95;
			System.out.println("Итоговая сумма покупки с учетом скидки: " + totalPrice + ", спасибо, приходите к нам еще.");
		} else if (totalPrice >= 100 && totalPrice < 200) {
			totalPrice *= 0.93;
			System.out.println("Итоговая сумма покупки с учетом скидки: " + totalPrice + ", спасибо, приходите к нам еще.");
		} else if (totalPrice >= 200 && totalPrice < 300) {
			if (age >= 18) {
				totalPrice *= 0.84;
				System.out.println("Итоговая сумма покупки с учетом скидки: " + totalPrice + ", спасибо, приходите к нам еще.");
			} else {
				totalPrice *= 0.91;
				System.out.println("Итоговая сумма покупки с учетом скидки: " + totalPrice + ", спасибо, приходите к нам еще.");
			}
		} else {
			totalPrice *= 0.8;
			System.out.println("Итоговая сумма покупки с учетом скидки: " + totalPrice + ", спасибо, приходите к нам еще.");
		}

	}
}

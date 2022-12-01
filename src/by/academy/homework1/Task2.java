package by.academy.homework1;

import java.util.Scanner;

public class Task2 {

	public static void main(String[] args) {

		String type;
		boolean isOn;

		Scanner scanner = new Scanner(System.in);
		Scanner sc = new Scanner(System.in);

		isOn = true;

		while (isOn) {
			System.out.println("Введите тип переменной:");
			type = scanner.nextLine();
			if (type.equals("int") | type.equals("double") | type.equals("float") | type.equals("char") | type.equals("String")) {
				switch (type) {
					case "int":
						while (isOn) {
							System.out.println("Введите значение переменной:");
							if (sc.hasNextInt()) {
								int a = sc.nextInt();
								System.out.println("Остаток от деления на 2 = " + (a % 2));
								break;
							} else {
								System.out.println("Введенное значение недопустимо для выбранного типа переменной");
								sc.nextLine();
							}
						}
						break;
					case "double":
						while (isOn) {
							System.out.println("Введите значение переменной:");
							if (sc.hasNextDouble()) {
								double b = sc.nextDouble();
								System.out.println("70% от введенного числа = " + (b * 0.7));
								break;
							} else {
								System.out.println("Введенное значение недопустимо для выбранного типа переменной");
								sc.nextLine();
							}
						}
						break;
					case "float":
						while (isOn) {
							System.out.println("Введите значение переменной:");
							if (sc.hasNextFloat()) {
								float c = sc.nextFloat();
								System.out.println("Введенное число в квадрате = " + (Math.sqrt(c)));
								break;
							} else {
								System.out.println("Введенное значение недопустимо для выбранного типа переменной");
								sc.nextLine();
							}
						}
						break;
					case "char":
						System.out.println("Введите значение переменной:");
						String s = sc.next();
						char e = s.charAt(0);
						System.out.println("Код введенного символа: " + e + " - " + ((int) e));
						break;
					case "String":
						System.out.println("Введите значение переменной:");
						String d = sc.nextLine();
						System.out.println("Hello " + d);
						break;
				}
				while (isOn) {
					System.out.println("Желаете продолжить?\n1) Да\n2) Нет");
					String s = scanner.nextLine();
					if (s.equals("1")) {
						System.out.println("Продолжаем.");
						break;
					} else if (s.equals("2")){
						isOn = false;
						sc.close();
						scanner.close();
					} else  {
						System.out.println("Нет такого варианта ответа. Введите '1' или '2'");
					}
				}
			} else {
				System.out.println("Нет такого типа переменной, попробуйте еще раз");

			}
		}
	}
}

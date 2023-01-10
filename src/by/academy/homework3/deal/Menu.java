package by.academy.homework3.deal;

import java.util.Scanner;

public class Menu {


	public static void mainMenuPrint() {
		System.out.println("\n1. Открыть каталог.\n2. Добавить товар.\n3. Удалить товар.\n4. Открыть корзину.\n" +
				"5. Купить.\n6. Очистить корзину.\n7. Выйти из магазина.\nСделайте выбор.");
	}

	public static void catalogPrint(Person seller) {
		int help = 1;
		for (int i = 0; i < seller.products.length; i++) {
			if (seller.products[i] != null) {
				System.out.println("\n" + help + ". " + seller.products[i].toString());
				help++;
			}
		}
	}

	public static void basketPrint(Person buyer) {
		int help = 1;
		for (int i = 0; i < buyer.products.length; i++) {
			if (buyer.products[i] != null) {
				System.out.println("\n" + help + ". " + buyer.products[i].toString());
				help++;
			}
		}
		if (help == 1) {
			System.out.println("Корзина пуста.");
		}
	}

	public static void mainMenu(Person seller, Person buyer) {
		mainMenuPrint();
		int helpMenu;
		Scanner scanner = new Scanner(System.in);
		boolean isHelp = true;
		while (isHelp) {
			switch (helpMenu = scanner.nextInt()) {
				case 1:
					catalogPrint(seller);
					mainMenuPrint();
					break;
				case 2:
					System.out.println("Введите номер товара.");
					int index = scanner.nextInt() - 1;
					System.out.println("Введите количество товара.");
					int quantity = scanner.nextInt();
					buyer.addInBasket(index, quantity, seller);
					catalogPrint(seller);
					mainMenuPrint();
					break;
				case 3:
					basketPrint(buyer);
					System.out.println("\nВведите номер товара.");
					int indexBasket = scanner.nextInt() - 1;
					System.out.println("Введите количество товара.");
					int quantityBasket = scanner.nextInt();
					buyer.deleteInBasket(indexBasket, quantityBasket, seller);
					catalogPrint(seller);
					mainMenuPrint();
					break;
				case 4:
					basketPrint(buyer);
					mainMenuPrint();
					break;
				case 5:
					buyer.deal(seller);
					mainMenuPrint();
					break;
				case 6:
					buyer.deleteAllInBasket(seller);
					mainMenuPrint();
					break;
				case 7:
					isHelp = false;
					break;
			}
		}
	}
}

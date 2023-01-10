package by.academy.homework3.deal;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Person {

	private String name;            // Поле "Имя" персоны.
	private double money;           // Поле "Деньги" персоны.

	public Product[] products;

	public Person() {
	}

	public Person(String name, double money, int index) {
		this.name = name;
		this.money = money;
		this.products = new Product[index];
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getMoney() {
		return money;
	}

	public void setMoney(double money) {
		this.money = money;
	}

	public String getProducts(int index) {
		return products[index].toString();
	}

	public void setProducts(int index, Product product) {
		this.products[index] = product;
	}

	public void addInBasket(int index, int quantity, Person seller) {
		boolean isHelp = false;
		if (seller.products[index].getQuantity() < quantity) {
			System.out.println("Нет такого количества выбранного товара.");
			return;
		}
		for (int i = 0; i < products.length; i++) {
			if (products[i] != null && products[i].getModel().equals(seller.products[index].getModel())) {
				products[i] = products[index].clone();
				products[i].setQuantity(products[i].getQuantity() + quantity);
				seller.products[index].setQuantity(seller.products[index].getQuantity() - quantity);
				products[i].setPrice(products[i].discount(seller.products[index].getPrice()));
				isHelp = true;
				break;
			}
		}
		for (int i = 0; i < products.length; i++) {
			if (isHelp) {
				break;
			} else if (products[i] == null) {
				products[i] = seller.products[index].clone();
				products[i].setQuantity(quantity);
				seller.products[index].setQuantity(seller.products[index].getQuantity() - quantity);
				products[i].setPrice(products[i].discount(seller.products[index].getPrice()));
				break;
			}
		}
	}

	public void deleteInBasket(int index, int quantity, Person seller) {
		if (products[index] == null) {
			System.out.println("На выбранной позиции нет товара.");
		}
		if (products[index].getQuantity() < quantity) {
			System.out.println("В вашей корзине нет такого количества выбранного товара.");
			return;
		}
		for (int i = 0; i < seller.products.length; i++) {
			if (products[index].getModel().equals(seller.products[i].getModel())) {
				seller.products[i].setQuantity(seller.products[i].getQuantity() + quantity);
				if (products[index].getQuantity() == quantity) {
					products[index] = null;
				} else {
					products[index].setQuantity(products[index].getQuantity() - quantity);
					products[index].setPrice(products[index].discount(seller.products[i].getPrice()));
				}
				break;
			}
		}
		for (int i = 0; i < products.length; i++) {
			if (products[i] == null) {
				for (int j = i + 1; j < products.length; j++) {
					if (products[j] != null) {
						products[i] = products[j];
						products[j] = null;
					}
				}
			}
		}
	}

	public void deleteAllInBasket(Person seller) {
		for (int i = 0; i < products.length; i++) {
			if (products[i] != null) {
				for (int j = 0; j < seller.products.length; j++) {
					if (seller.products[j].getModel().equals(products[i].getModel())) {
						seller.products[j].setQuantity(seller.products[j].getQuantity() + products[i].getQuantity());
						products[i] = null;
						break;
					}
				}
			}
		}
		System.out.println("Корзина очищена");
	}

	public void deal(Person seller) {
		double totalPrice = 0;
		for (int i = 0; i < products.length; i++) {
			if (products[i] != null) {
				totalPrice += products[i].getPrice();
			}
		}
		if (totalPrice == 0) {
			System.out.println("Чтобы что-то купить, необходимо добавить товар в корзину.");
			return;
		} else if (totalPrice > money) {
			System.out.println("У Вас недостаточно средств.");
			return;
		} else {
			money -= totalPrice;
			seller.setMoney(seller.getMoney() + totalPrice);
			int help = 1;
			System.out.println(" __________________________________________________");
			System.out.printf("| %-1s | %-10s| %-10s| %-11s| %-8s| %n", "№", "Бренд", "Модель", "Количество", "Цена");
			System.out.println("|--------------------------------------------------|");
			for (int i = 0; i < products.length; i++) {
				if (products[i] != null) {
					System.out.printf("| %-1s | %-10s| %-10s| %-11s| %-8.2f| %n", help, products[i].getBrand(),
							products[i].getModel(), products[i].getQuantity(), products[i].getPrice());
					products[i] = null;
					help++;
				}
			}
			System.out.println("|--------------------------------------------------|");
			System.out.printf("| %-26s| %-11s| %-8.2f| %n", "", "Итого", totalPrice);
			System.out.println("|--------------------------------------------------|");
			System.out.println("|     Спасибо за покупку, приходите к нам еще!     |");
			System.out.println("|--------------------------------------------------|");
			date();
		}

	}

	public static void date() {
		LocalDateTime date = LocalDateTime.now().plusDays(10);
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd, MMMM, yyyy HH:mm:ss");
		System.out.printf("|%37s             |%n", date.format(formatter));
		System.out.println(" ¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯ ");
	}
}

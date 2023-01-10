package by.academy.homework3.deal;

public class Application {

	public static void main(String[] args) {

		Person seller = new Person("Mike", 3000, 3);
		Person buyer = new Person("Nick", 10000, 10);

		seller.setProducts(0, new Monitor("Philips", "223V", 5, 700.444, 21, 60));
		seller.setProducts(1, new CPU("Intel", "i7", 3, 500, 8, 2100));
		seller.setProducts(2, new Memory("Toshiba", "P300", 10, 300, 1000, 200, 100));

		System.out.println("Добро пожаловать в наш магазин!");

		Menu.mainMenu(seller, buyer);

		System.out.println(seller.getMoney() + "\n" + buyer.getMoney());
	}
}
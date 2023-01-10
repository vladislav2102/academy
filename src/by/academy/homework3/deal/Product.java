package by.academy.homework3.deal;

public abstract class Product {

	private String brand;           // Поле "Бренд" продукта.
	private String model;           // Поле "Модель" продукта.
	private int quantity;           // Поле "Количество" продукта.
	private double price;           // Поле "Цена" продукта.


	public Product() {              // Пустой конструктор продукта.
	}

	public Product(String brand, String model, int quantity, double price) {    // Конструктор продукта с входными параметрами.
		super();
		this.brand = brand;
		this.model = model;
		this.quantity = quantity;
		this.price = price;
	}

	public String getBrand() {                  // Геттер на поле "Бренд".
		return brand;
	}

	public void setBrand(String brand) {        // Сеттер на поле "Бренд".
		this.brand = brand;
	}

	public String getModel() {                  // Геттер на поле "Модель".
		return model;
	}

	public void setModel(String model) {        // Сеттер на поле "Модель".
		this.model = model;
	}

	public int getQuantity() {                  // Геттер на поле "Количество".
		return quantity;
	}

	public void setQuantity(int quantity) {     // Сеттер на поле "Количество".
		this.quantity = quantity;
	}

	public double getPrice() {                  // Геттер на поле "Цена".
		return price;
	}

	public void setPrice(double price) {        // Сеттер на поле "Цена".
		this.price = price;
	}

	@Override
	public String toString() {
		return brand + " " + model + " " + ", количество: " + quantity + ", цена: " + price;
	}

	public abstract double discount(Double priceInSeller);// Абстрактный метод подсчета скидки (Реализовать в дочерних классах).

	public abstract Product clone();            // Абстрактный метод клонирования (Реализовать в дочерних классах).
	// Необходим для перемещения продуктов со склада в корзину и обратно.
}

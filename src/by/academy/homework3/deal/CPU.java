package by.academy.homework3.deal;

public class CPU extends Product {

	private int quantityCore;       // Поле "Количество ядер" процессора.
	private int frequencyCore;      // Поле "Частота ядра" процессора.

	public CPU() {                  // Пустой конструктор.
	}

	public CPU(String brand, String model, int quantity, double price, int quantityCore, int frequencyCore) {   // Конструктор с входными параметрами.
		super(brand, model, quantity, price);
		this.quantityCore = quantityCore;
		this.frequencyCore = frequencyCore;
	}

	public int getQuantityCore() {                      // Геттер на поле "Количество ядер".
		return quantityCore;
	}

	public void setQuantityCore(int quantityCore) {     // Сеттер на поле "Количество ядер".
		this.quantityCore = quantityCore;
	}

	public int getFrequencyCore() {                     // Геттер на поле "Частота ядра".
		return frequencyCore;
	}

	public void setFrequencyCore(int frequencyCore) {   // Сеттер на поле "Частота ядра".
		this.frequencyCore = frequencyCore;
	}

	@Override
	public String toString() {
		return "Процессор: " + super.toString() + ", Количество ядер:" + quantityCore + ", Частота ядра: " + frequencyCore;
	}

	public double discount(Double priceInSeller) {                  // Метод подсчета скидки. Переопределен.
		if (getQuantity() > 3) {
			return getQuantity() * 0.9 * priceInSeller;
		}
		return getQuantity() * priceInSeller;
	}

	public CPU clone () {                                   // Метод клонирования. Переопределен.
		return new CPU (getBrand(), getModel(), getQuantity(), getPrice(), quantityCore, frequencyCore);
	}
}

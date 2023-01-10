package by.academy.homework3.deal;

public class Monitor extends Product {

	private int diagonal;               // Поле "Диагональ" монитора.
	private int frequency;              // Поле "Частота" монитора.

	public Monitor() {                  // Пустой конструктор монитора.
	}

	public Monitor(String brand, String model, int quantity, double price, int diagonal, int frequency) {   // Конструктор монитора с входными параметрами.
		super(brand, model, quantity, price);
		this.diagonal = diagonal;
		this.frequency = frequency;
	}

	public int getDiagonal() {                  // Геттер на поле "Диагональ".
		return diagonal;
	}

	public void setDiagonal(int diagonal) {     // Сеттер на поле "Диагональ".
		this.diagonal = diagonal;
	}

	public int getFrequency() {                 // Геттер на поле "Частота".
		return frequency;
	}

	public void setFrequency(int frequency) {   // Сеттер на поле "Частота".
		this.frequency = frequency;
	}

	@Override
	public String toString() {
		return "Монитор: " + super.toString() + ", Диагональ:" + diagonal + ", Частота: " + frequency;
	}

	public double discount(Double priceInSeller) {                  // Метод подсчета скидки. Переопределен.
		if (getQuantity() > 2) {
			return getQuantity() * 0.85 * priceInSeller;
		}
		return getQuantity() * priceInSeller;
	}



	public Monitor clone() {                    // Метод клонирования монитора. Переопределен.
		return new Monitor(getBrand(), getModel(), getQuantity(), getPrice(), diagonal, frequency);
	}
}


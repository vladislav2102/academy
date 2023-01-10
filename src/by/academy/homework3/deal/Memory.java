package by.academy.homework3.deal;

public class Memory extends Product {

	private int memorySize;         // Поле "Объем памяти".
	private int downloadSpeed;      // Поле "Скорость скачивания".
	private int uploadSpeed;        // Поле "Скорость загрузки".

	public Memory() {               // Пустой конструктор.
		super();
	}

	public Memory(String brand, String model, int quantity, double price, int memorySize, int downloadSpeed, int uploadSpeed) {     // Конструктор с входными параметрами.
		super(brand, model, quantity, price);
		this.memorySize = memorySize;
		this.downloadSpeed = downloadSpeed;
		this.uploadSpeed = uploadSpeed;
	}

	public int getMemorySize() {                        // Геттер на поле "Объем памяти".
		return memorySize;
	}

	public void setMemorySize(int memorySize) {         // Сеттер на поле "Объем памяти".
		this.memorySize = memorySize;
	}

	public int getDownloadSpeed() {                     // Геттер на поле "Скорость скачивания".
		return downloadSpeed;
	}

	public void setDownloadSpeed(int downloadSpeed) {   // Сеттер на поле "Скорость скачивания".
		this.downloadSpeed = downloadSpeed;
	}

	public int getUploadSpeed() {                       // Геттер на поле "Скорость загрузки".
		return uploadSpeed;
	}

	public void setUploadSpeed(int uploadSpeed) {       // Сеттер на поле "Скорость загрузки".
		this.uploadSpeed = uploadSpeed;
	}

	@Override
	public String toString() {
		return "Жесткий диск: " + super.toString() + ", Объем: " + memorySize + ", Скорость скачивания: " + downloadSpeed
				+ ", Скорость загрузки: " + uploadSpeed;
	}

	public double discount(Double priceInSeller) {                  // Метод подсчета скидки. Переопределен.
		if (getQuantity() > 5) {
			return getQuantity() * 0.75 * priceInSeller;
		}
		return getQuantity() * priceInSeller;
	}

	public Memory clone() {                             // Метод клонирования. Переопределен.
		return new Memory(getBrand(), getModel(), getQuantity(), getPrice(), memorySize, downloadSpeed, uploadSpeed);
	}
}

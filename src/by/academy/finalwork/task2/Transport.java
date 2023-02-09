package by.academy.finalwork.task2;

import by.academy.finalwork.task2.emun.*;

import java.time.LocalDate;
import java.util.Objects;

public abstract class Transport {

	private Type type;
	private Brand brand;
	private Model model;
	private String number;
	private LocalDate dateOfManufacture;
	private TypeEngine typeEngine;
	private int engineCapacity;
	private TypeFuel typeFuel;
	private int cruisingSpeed;
	private int fuelConsumption;
	private int operatorCapacity;
	private int passengerCapacity;
	private int loadCapacity;
	private String color;


	public Transport() {
	}

	public Transport(Type type, Brand brand, Model model, String number, LocalDate dateOfManufacture, TypeEngine typeEngine,
	                 int engineCapacity, TypeFuel typeFuel, int cruisingSpeed, int fuelConsumption,
	                 int operatorCapacity, int passengerCapacity, int loadCapacity, String color) {
		this.type = type;
		this.brand = brand;
		this.model = model;
		this.number = number;
		this.dateOfManufacture = dateOfManufacture;
		this.typeEngine = typeEngine;
		this.engineCapacity = engineCapacity;
		this.typeFuel = typeFuel;
		this.cruisingSpeed = cruisingSpeed;
		this.fuelConsumption = fuelConsumption;
		this.operatorCapacity = operatorCapacity;
		this.passengerCapacity = passengerCapacity;
		this.loadCapacity = loadCapacity;
		this.color = color;
	}

	public Type getType() {
		return type;
	}

	public void setType(Type type) {
		this.type = type;
	}

	public Brand getBrand() {
		return brand;
	}

	public void setBrand(Brand brand) {
		this.brand = brand;
	}

	public Model getModel() {
		return model;
	}

	public void setModel(Model model) {
		this.model = model;
	}

	public String getNumber() {
		return number;
	}

	public void setNumber(String number) {
		this.number = number;
	}

	public LocalDate getDateOfManufacture() {
		return dateOfManufacture;
	}

	public void setDateOfManufacture(LocalDate dateOfManufacture) {
		this.dateOfManufacture = dateOfManufacture;
	}

	public TypeEngine getTypeEngine() {
		return typeEngine;
	}

	public void setTypeEngine(TypeEngine typeEngine) {
		this.typeEngine = typeEngine;
	}

	public int getEngineCapacity() {
		return engineCapacity;
	}

	public void setEngineCapacity(int engineCapacity) {
		this.engineCapacity = engineCapacity;
	}

	public TypeFuel getTypeFuel() {
		return typeFuel;
	}

	public void setTypeFuel(TypeFuel typeFuel) {
		this.typeFuel = typeFuel;
	}

	public int getCruisingSpeed() {
		return cruisingSpeed;
	}

	public void setCruisingSpeed(int cruisingSpeed) {
		this.cruisingSpeed = cruisingSpeed;
	}

	public int getFuelConsumption() {
		return fuelConsumption;
	}

	public void setFuelConsumption(int fuelConsumption) {
		this.fuelConsumption = fuelConsumption;
	}

	public int getOperatorCapacity() {
		return operatorCapacity;
	}

	public void setOperatorCapacity(int operatorCapacity) {
		this.operatorCapacity = operatorCapacity;
	}

	public int getPassengerCapacity() {
		return passengerCapacity;
	}

	public void setPassengerCapacity(int passengerCapacity) {
		this.passengerCapacity = passengerCapacity;
	}

	public int getLoadCapacity() {
		return loadCapacity;
	}

	public void setLoadCapacity(int loadCapacity) {
		this.loadCapacity = loadCapacity;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	@Override
	public String toString() {
		return "Transport{" +
				"type=" + type +
				", brand=" + brand +
				", model=" + model +
				", number='" + number + '\'' +
				", dateOfManufacture=" + dateOfManufacture +
				", typeEngine=" + typeEngine +
				", engineCapacity=" + engineCapacity +
				", typeFuel=" + typeFuel +
				", cruisingSpeed=" + cruisingSpeed +
				", fuelConsumption=" + fuelConsumption +
				", operatorCapacity=" + operatorCapacity +
				", passengerCapacity=" + passengerCapacity +
				", loadCapacity=" + loadCapacity +
				", color='" + color + '\'' +
				'}';
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (!(o instanceof Transport transport)) return false;
		return engineCapacity == transport.engineCapacity && cruisingSpeed == transport.cruisingSpeed && fuelConsumption == transport.fuelConsumption && operatorCapacity == transport.operatorCapacity && passengerCapacity == transport.passengerCapacity && loadCapacity == transport.loadCapacity && type == transport.type && brand == transport.brand && model == transport.model && number.equals(transport.number) && dateOfManufacture.equals(transport.dateOfManufacture) && typeEngine == transport.typeEngine && typeFuel == transport.typeFuel && color.equals(transport.color);
	}

	@Override
	public int hashCode() {
		return Objects.hash(type, brand, model, number, dateOfManufacture, typeEngine, engineCapacity, typeFuel, cruisingSpeed, fuelConsumption, operatorCapacity, passengerCapacity, loadCapacity, color);
	}
}

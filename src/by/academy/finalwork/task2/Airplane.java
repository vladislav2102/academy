package by.academy.finalwork.task2;

import by.academy.finalwork.task2.emun.*;

import java.time.LocalDate;
import java.util.Objects;

public class Airplane extends Aircraft {

	private TypeFuselage typeFuselage;
	private TypeWing typeWing;
	private int wingspan;
	private boolean isWingletsApp;

	public Airplane() {
	}

	public Airplane(Type type, Brand brand, Model model, String number, LocalDate dateOfManufacture, TypeEngine typeEngine,
	                int engineCapacity, TypeFuel typeFuel, int cruisingSpeed, int fuelConsumption, int operatorCapacity,
	                int passengerCapacity, int loadCapacity, String color, int cruiseAltitude, int rangeOfFlight,
	                TypeChassis typeChassis, TypeFuselage typeFuselage, TypeWing typeWing, int wingspan,
	                boolean isWingletsApp) {
		super(type, brand, model, number, dateOfManufacture, typeEngine, engineCapacity, typeFuel, cruisingSpeed,
				fuelConsumption, operatorCapacity, passengerCapacity, loadCapacity, color, cruiseAltitude,
				rangeOfFlight, typeChassis);
		this.typeFuselage = typeFuselage;
		this.typeWing = typeWing;
		this.wingspan = wingspan;
		this.isWingletsApp = isWingletsApp;
	}

	public TypeFuselage getTypeFuselage() {
		return typeFuselage;
	}

	public void setTypeFuselage(TypeFuselage typeFuselage) {
		this.typeFuselage = typeFuselage;
	}

	public TypeWing getTypeWing() {
		return typeWing;
	}

	public void setTypeWing(TypeWing typeWing) {
		this.typeWing = typeWing;
	}

	public int getWingspan() {
		return wingspan;
	}

	public void setWingspan(int wingspan) {
		this.wingspan = wingspan;
	}

	public boolean isWingletsApp() {
		return isWingletsApp;
	}

	public void setWingletsApp(boolean wingletsApp) {
		isWingletsApp = wingletsApp;
	}

	@Override
	public String toString() {
		return getNumber() + " " + getType() + " " + getBrand() + " " + getModel();
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (!(o instanceof Airplane airplane)) return false;
		if (!super.equals(o)) return false;
		return wingspan == airplane.wingspan && isWingletsApp == airplane.isWingletsApp && typeFuselage == airplane.typeFuselage && typeWing == airplane.typeWing;
	}

	@Override
	public int hashCode() {
		return Objects.hash(super.hashCode(), typeFuselage, typeWing, wingspan, isWingletsApp);
	}

	public void printParameters () {
		System.out.println("\nТехнические характеристики ВС № " + getNumber() +
				"\nТип самолета: " + getType() +
				"\nПроизводитель: " + getBrand() +
				"\nМодель: " + getModel() +
				"\nДата выпуска: " + getDateOfManufacture() +
				"\nТип двигателя: " + getTypeEngine() +
				"\nКоличество двигателей: " + getEngineCapacity() + " шт." +
				"\nТип топлива: " + getTypeFuel() +
				"\nРасход топлива: " + getFuelConsumption() + " кг/ч" +
				"\nКрейсерская скорость: " + getCruisingSpeed() +  " км/ч" +
				"\nКоличество летчиков: " + getOperatorCapacity() +
				"\nПассажировместимость: " + getPassengerCapacity() + " человек" +
				"\nГрузоподъемность: " + getLoadCapacity() + " кг" +
				"\nЦвет: " + getColor() +
				"\nКрейсерская высота полета: " + getCruiseAltitude() + " м" +
				"\nДальность полета: " + getRangeOfFlight() + " км" +
				"\nТип шасси: " + getTypeChassis() +
				"\nТип фюзеляжа: " + getTypeFuselage() +
				"\nТип крыла: " + getTypeWing() +
				"\nРазмах крыла: " + getWingspan() + " м" +
				"\nВинглеты: " + isWingletsApp());
	}
}

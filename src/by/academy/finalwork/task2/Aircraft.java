package by.academy.finalwork.task2;

import by.academy.finalwork.task2.emun.*;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Objects;

public abstract class Aircraft extends Transport {

	private int cruiseAltitude;
	private int rangeOfFlight;
	private TypeChassis typeChassis;

	public Aircraft() {
	}

	public Aircraft(Type type, Brand brand, Model model, String number, LocalDate dateOfManufacture, TypeEngine typeEngine,
	                int engineCapacity, TypeFuel typeFuel, int cruisingSpeed, int fuelConsumption, int operatorCapacity,
	                int passengerCapacity, int loadCapacity, String color, int cruiseAltitude, int rangeOfFlight,
	                TypeChassis typeChassis) {
		super(type, brand, model, number, dateOfManufacture, typeEngine, engineCapacity, typeFuel, cruisingSpeed,
				fuelConsumption, operatorCapacity, passengerCapacity, loadCapacity, color);
		this.cruiseAltitude = cruiseAltitude;
		this.rangeOfFlight = rangeOfFlight;
		this.typeChassis = typeChassis;
	}

	public int getCruiseAltitude() {
		return cruiseAltitude;
	}

	public void setCruiseAltitude(int cruiseAltitude) {
		this.cruiseAltitude = cruiseAltitude;
	}

	public int getRangeOfFlight() {
		return rangeOfFlight;
	}

	public void setRangeOfFlight(int rangeOfFlight) {
		this.rangeOfFlight = rangeOfFlight;
	}

	public TypeChassis getTypeChassis() {
		return typeChassis;
	}

	public void setTypeChassis(TypeChassis typeChassis) {
		this.typeChassis = typeChassis;
	}

	@Override
	public String toString() {
		return "Aircraft{" +
				"cruiseAltitude=" + cruiseAltitude +
				", rangeOfFlight=" + rangeOfFlight +
				", typeChassis=" + typeChassis +
				"} " + super.toString();
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (!(o instanceof Aircraft aircraft)) return false;
		if (!super.equals(o)) return false;
		return cruiseAltitude == aircraft.cruiseAltitude && rangeOfFlight == aircraft.rangeOfFlight && typeChassis == aircraft.typeChassis;
	}

	@Override
	public int hashCode() {
		return Objects.hash(super.hashCode(), cruiseAltitude, rangeOfFlight, typeChassis);
	}
}

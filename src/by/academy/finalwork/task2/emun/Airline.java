package by.academy.finalwork.task2.emun;

import by.academy.finalwork.task2.Aircraft;
import by.academy.finalwork.task2.Airplane;
import by.academy.lesson19.classwork.Printable;
import jdk.dynalink.Operation;

import java.beans.Expression;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Objects;
import java.util.stream.Stream;

public class Airline {

	private String name;
	private ArrayList<Airplane> fleet;

	public Airline() {
	}

	public Airline(String name, ArrayList<Airplane> fleet) {
		this.name = name;
		this.fleet = fleet;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public ArrayList<Airplane> getFleet() {
		return fleet;
	}

	public void setFleet(ArrayList<Airplane> fleet) {
		this.fleet = fleet;
	}

	@Override
	public String toString() {
		return "Airline{" +
				"name='" + name + '\'' +
				", fleet=" + fleet +
				'}';
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (!(o instanceof Airline airline)) return false;
		return name.equals(airline.name) && fleet.equals(airline.fleet);
	}

	@Override
	public int hashCode() {
		return Objects.hash(name, fleet);
	}

	public void sortedRangeOfFlight() {
		fleet.sort(Comparator.comparing(Airplane :: getRangeOfFlight));
		System.out.println(fleet);
	}

	public void Capacity() {
		int sumPassenger = 0;
		int sumLoad = 0;

		for(Airplane airplane : fleet) {
			sumPassenger += airplane.getPassengerCapacity();
			sumLoad += airplane.getLoadCapacity();
		}
		System.out.println("\nОбщая пассажировместивость : " + sumPassenger + "\nОбщая грузоподъемность : " + sumLoad);
	}

	public void fuelRangeConformity (int minFuelConsumption, int maxFuelConsumption) {
		System.out.println("\nПод заданный диапозон расхода топлива подходят следующие ВС:\n");
		int count = 1;
		for(Airplane airplane : fleet) {
			if(minFuelConsumption < airplane.getFuelConsumption() && maxFuelConsumption > airplane.getFuelConsumption()) {
				System.out.println(count + ": " + airplane);
				count++;
			}
		}
	}

	public void effectivity (int distanceBetweenAirports, int passengerCapacity) {
		ArrayList<Airplane> airplanesEffectivity = new ArrayList<>();
		for(Airplane airplane : fleet) {
			if(airplane.getRangeOfFlight() >= distanceBetweenAirports && airplane.getPassengerCapacity() >= passengerCapacity) {
				airplanesEffectivity.add(airplane);
			}
		}
		airplanesEffectivity.sort(Comparator.comparing(Airplane::getFuelConsumption));
		System.out.println("\nСписок наиболее подходящих ВС под заданные параметры:\n");
		int count = 1;
		for(Airplane airplane : airplanesEffectivity) {
			System.out.println(count + ": " + airplane.toString());
			count++;
		}
	}
}
